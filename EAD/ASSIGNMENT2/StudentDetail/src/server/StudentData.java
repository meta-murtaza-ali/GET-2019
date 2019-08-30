package server;

public class StudentData {
	public String firstName;
	public String lastName;
	public String fatherName;
	public String email;
	public String className;
	public int age;
	public int student_id;
	
	/**
	 * This pojo class of Student Data.
	 * @param firstName
	 * @param lastName
	 * @param fatherName
	 * @param email
	 * @param className
	 * @param age
	 */
	public StudentData(String firstName, String lastName, String fatherName,String email,
			String className, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.fatherName = fatherName;
		this.email = email;
		this.className = className;
		this.age = age;
	}
	public StudentData() {}
	
	/**
	 * This is return Student First Name.
	 * @return
	 */
	public String getFirstName() {
		return firstName;
	}
	
	/**
	 * This is set First Name of student.
	 * @param firstName
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	/**
	 * This is return last name.
	 * @return
	 */
	public String getLastName() {
		return lastName;
	}
	
	/**
	 * This is return email Id 
	 * @return
	 */
	public String getEmail() {
		return email;
	}
	
	/**
	 * Set email Id
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	/**
	 * Set last name
	 * @param lastName
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	/**
	 * get father name
	 * @return
	 */
	public String getFatherName() {
		return fatherName;
	}
	
	/**
	 * set father name.
	 * @param fatherName
	 */
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	
	/**
	 * get class name
	 * @return
	 */
	public String getClassName() {
		return className;
	}
	
	/**
	 * set class name.
	 * @param className
	 */
	public void setClassName(String className) {
		this.className = className;
	}
	
	/**
	 * get age of student.
	 * @return
	 */
	public int getAge() {
		return age;
	}
	
	/**
	 * set age of student.
	 * @param age
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	/**
	 * get student id.
	 * @return
	 */
	public int getStudentId() {
		return student_id;
	}
	
	/**
	 * set student id.
	 * @param student_id
	 */
	public void setStudentId(int student_id) {
		this.student_id = student_id;
	}
	
  
}
