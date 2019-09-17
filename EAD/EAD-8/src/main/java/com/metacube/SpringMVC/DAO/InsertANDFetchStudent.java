package com.metacube.SpringMVC.DAO;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.metacube.SpringMVC.model.Student;

/**
 * This class Insert and Fetch Student Data.
 * 
 * @author Murtaza Ali
 *
 */
@Component
public class InsertANDFetchStudent {
	List<Student> studentList = new ArrayList<>();

	/**
	 * Insert Student Detail.
	 * 
	 * @param student
	 */
	public void insert(Student student) {
		studentList.add(student);
	}

	/**
	 * Fetch Student Data.
	 * 
	 * @return
	 */
	public List<Student> fetch() {
		return studentList;
	}
}
