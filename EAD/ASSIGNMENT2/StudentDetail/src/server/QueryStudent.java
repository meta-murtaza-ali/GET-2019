package server;

/**
 * This is Query for the data base.
 * 
 * @author Murtaza Ali
 *
 */
public class QueryStudent {

	/**
	 * This is for Set Student Detail in data base.
	 * 
	 * @return
	 */
	public static String setStudentDetail() {

		String query = "insert into StudentDetail(first_name, last_name, father_name, email, class_name, age) values (?, ?, ?, ?, ?, ?)";
		return query;
	}

	/**
	 * This is for get Student Detail from database.
	 * 
	 * @return
	 */
	public static String getStudentId() {

		String query = "select student_id from StudentDetail where email=?";
		return query;
	}

	/**
	 * This is for show Student Detail from Database.
	 * 
	 * @return
	 */
	public static String showStudentDetail() {

		String query = "select * from StudentDetail";
		return query;
	}

	/**
	 * This is for update student detail.
	 * 
	 * @return
	 */
	public static String updateStudentDetails() {

		String query = "update StudentDetail set first_name=?, last_name=?, father_name=?, email=?, class_name=?, age=? where student_id=? ";
		return query;
	}

	/**
	 * This is for Search Student Detail by its first name.
	 * 
	 * @return
	 */
	public static String searchByFirstName() {

		String query = "select * from StudentDetail where first_name= ? order by class_name DESC";
		return query;
	}

	/**
	 * This is for Search Student Detail by its last name.
	 * 
	 * @return
	 */
	public static String searchByLastName() {

		String query = "select * from StudentDetail where last_name= ? order by class_name DESC";
		return query;
	}

}
