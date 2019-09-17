package com.metacube.SpringMVC.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Student {
	@NotBlank(message="{blankFirstName}")
	@Size(min=2)
	protected String firstName;
	@NotBlank(message="{blankLastName}")
	@Size(min=2)
	protected String lastName;
	@NotBlank(message="{blankfatherName}")
	@Size(min=2)
	protected String fatherName;
	@NotBlank(message="{blankemail}")
	@Email
	protected String email;
	@NotBlank(message="{blankClassName}")
	@Pattern(regexp="[1-4]",message="{correctClassName}")
	protected String className;
	@NotBlank(message="{blankAge}")
	@Pattern(regexp="[0-9]+",message="{correctAge}")
	protected String age;
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the fatherName
	 */
	public String getFatherName() {
		return fatherName;
	}
	/**
	 * @param fatherName the fatherName to set
	 */
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the className
	 */
	public String getClassName() {
		return className;
	}
	/**
	 * @param className the className to set
	 */
	public void setClassName(String className) {
		this.className = className;
	}
	/**
	 * @return the age
	 */
	public String getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(String age) {
		this.age = age;
	}
	
	
}
