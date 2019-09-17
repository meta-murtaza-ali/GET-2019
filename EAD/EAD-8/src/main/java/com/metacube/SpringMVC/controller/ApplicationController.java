package com.metacube.SpringMVC.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.metacube.SpringMVC.Service.StudentService;
import com.metacube.SpringMVC.model.Student;

/**
 * This class is a Controller Class.
 * 
 * @author Murtaza Ali
 *
 */
@Controller
public class ApplicationController {
	@Value("${home.message}")
	private String message;

	@Autowired
	StudentService studentService;

	/**
	 * Display Index Form .
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping("/home")
	public String displayIndex(Model model) {
		model.addAttribute("message", message);
		return "index";
	}

	/**
	 * This method call Add Student page.
	 * 
	 * @return
	 */
	@RequestMapping("/addStudentDetail")
	public ModelAndView addStudentMapping() {
		return new ModelAndView("addStudentDetail", "student", new Student());
	}

	/**
	 * This method show detail on Logger and Add Student on List.
	 * 
	 * @param student
	 * @param result
	 * @return
	 */
	@RequestMapping("/addStudent")
	public String displayToLogger(@Validated @ModelAttribute("student") Student student, BindingResult result) {

		if (result.hasErrors()) {
			ObjectError objecterror = new ObjectError("global", "Detail must not be blank.");
			result.addError(objecterror);
			return "addStudentDetail";
		} else {
			studentService.addStudent(student);
			return "index";
		}
	}

	/**
	 * @return displayAllStudent view with attached list of students
	 */
	@RequestMapping("/showStudents")
	public ModelAndView displayAllStudents() {
		List<Student> allStudents = studentService.getAllStudent();
		return new ModelAndView("displayAllStudent", "lists", allStudents);
	}
}
