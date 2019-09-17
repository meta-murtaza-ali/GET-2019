package com.metacube.SpringMVC.Service;

import java.util.List;

import com.metacube.SpringMVC.model.Student;

/**
 * Interface Of Student Service .
 * @author Murtaza Ali
 *
 */
public interface StudentService {
	/**
	 * This method return all Student Detail.
	 * @return
	 */
	public List<Student> getAllStudent();
	
	/**
	 * This method Add Student Detail.
	 * @param student
	 */
	public void addStudent(Student student);
}
