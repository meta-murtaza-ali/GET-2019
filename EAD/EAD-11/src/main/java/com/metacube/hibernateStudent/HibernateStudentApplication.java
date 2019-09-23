package com.metacube.hibernateStudent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

/**
 * @author Murtaza Ali
 *
 */
@SpringBootApplication(exclude=HibernateJpaAutoConfiguration.class)
public class HibernateStudentApplication {

	public static void main(String[] args) {
		SpringApplication.run(HibernateStudentApplication.class, args);
	}

}
