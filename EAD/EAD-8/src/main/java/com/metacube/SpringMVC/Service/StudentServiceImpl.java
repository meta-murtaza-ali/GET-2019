package com.metacube.SpringMVC.Service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.metacube.SpringMVC.DAO.InsertANDFetchStudent;
import com.metacube.SpringMVC.model.Student;
/**
 * This is Class Of Student Service Implementation.
 * @author Murtaza Ali
 *
 */
@Component
public class StudentServiceImpl implements StudentService {

	@Autowired
	InsertANDFetchStudent studentlist;
	@Override
	public List<Student> getAllStudent() {
		
		return studentlist.fetch();
	}

	@Override
	public void addStudent(Student student) {
		studentlist.insert(student);
		Logger log = LoggerFactory.getLogger(StudentServiceImpl.class);
		log.info(student.getFirstName());
		log.info(student.getLastName());
		log.info(student.getFatherName());
		log.info(student.getEmail());
		log.info(student.getClassName());
		log.info(student.getAge());
		
	}

}
