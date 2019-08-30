package server;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * This class Process the student data.
 * 
 * @author Murtaza Ali
 *
 */
public class ProcessStudent {

	/**
	 * This method Add Student data on DataBase
	 * 
	 * @param data is a object of Student Data class
	 * @return
	 * @throws Exception
	 */
	public int create(StudentData data) throws Exception {

		String query = QueryStudent.setStudentDetail();
		int student_id = 10;
		try {
			Connection connection = DatabaseConnection.getConnection();
			// Allocate statement object in connection
			PreparedStatement statement = connection.prepareStatement(query);
			// execute select query and returns result set
			statement.setString(1, data.getFirstName());
			statement.setString(2, data.getLastName());
			statement.setString(3, data.getFatherName());
			statement.setString(4, data.getEmail());
			statement.setString(5, data.getClassName());
			statement.setInt(6, data.getAge());
			try {
				int update_rows = statement.executeUpdate();
			} catch (Exception e) {
				return 0;
			}
			statement.close();
			query = QueryStudent.getStudentId();
			PreparedStatement statement2 = connection.prepareStatement(query);
			statement2.setString(1, data.getEmail());
			ResultSet rset = statement2.executeQuery();
			while (rset.next()) {
				student_id = rset.getInt("student_id");
			}
			connection.close();
		} catch (Exception Exception) {
			throw (new Exception());
		}
		return student_id;
	}

	/**
	 * This method Show Student Data
	 * 
	 * @return data of student.
	 */
	public List<StudentData> showData() {
		String query = QueryStudent.showStudentDetail();
		Connection connection = DatabaseConnection.getConnection();
		List<StudentData> data = new ArrayList<StudentData>();
		try {
			PreparedStatement statement = connection.prepareStatement(query);
			ResultSet rset = statement.executeQuery();
			while (rset.next()) {
				StudentData student = new StudentData();
				student.setStudentId(rset.getInt("student_id"));
				student.setFirstName(rset.getString("first_name"));
				student.setLastName(rset.getString("last_name"));
				student.setFatherName(rset.getString("father_name"));
				student.setEmail(rset.getString("email"));
				student.setClassName(rset.getString("class_name"));
				student.setAge(rset.getInt("age"));
				data.add(student);
			}
			statement.close();
			connection.close();
			return data;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;
	}

	/**
	 * This Update the data of Student in Data Base.
	 * 
	 * @param data is a object of Student Data class
	 * @return
	 */
	public int updateData(StudentData data) {
		String query = QueryStudent.updateStudentDetails();
		int update_rows = 0;
		try {
			Connection connection = DatabaseConnection.getConnection();
			// Allocate statement object in connection
			PreparedStatement statement = connection.prepareStatement(query);
			// execute select query and returns result set
			statement.setString(1, data.getFirstName());
			statement.setString(2, data.getLastName());
			statement.setString(3, data.getFatherName());
			statement.setString(4, data.getEmail());
			statement.setString(5, data.getClassName());
			statement.setInt(6, data.getAge());
			statement.setInt(7, data.getStudentId());
			update_rows = statement.executeUpdate();
			statement.close();
			connection.close();
			return update_rows;

		} catch (Exception Exception) {
			Exception.printStackTrace();
		}
		return update_rows;
	}

	/**
	 * This search student data by first name.
	 * 
	 * @param firstName
	 * @return data of the student.
	 */
	public List<StudentData> searchByFirstName(String firstName) {
		String query = QueryStudent.searchByFirstName();
		Connection connection = DatabaseConnection.getConnection();
		List<StudentData> data = new ArrayList<StudentData>();
		try {
			PreparedStatement statement = connection.prepareStatement(query);
			statement.setString(1, firstName);
			ResultSet rset = statement.executeQuery();
			while (rset.next()) {
				StudentData student = new StudentData();
				student.setStudentId(rset.getInt("student_id"));
				student.setFirstName(rset.getString("first_name"));
				student.setLastName(rset.getString("last_name"));
				student.setFatherName(rset.getString("father_name"));
				student.setEmail(rset.getString("email"));
				student.setClassName(rset.getString("class_name"));
				student.setAge(rset.getInt("age"));
				data.add(student);
			}
			statement.close();
			connection.close();
			return data;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;

	}

	/**
	 * This search student data by its last name.
	 * 
	 * @param lastName
	 * @return
	 */
	public List<StudentData> searchByLastName(String lastName) {
		String query = QueryStudent.searchByLastName();
		Connection connection = DatabaseConnection.getConnection();
		List<StudentData> data = new ArrayList<StudentData>();
		try {
			PreparedStatement statement = connection.prepareStatement(query);
			statement.setString(1, lastName);
			ResultSet rset = statement.executeQuery();
			while (rset.next()) {
				StudentData student = new StudentData();
				student.setStudentId(rset.getInt("student_id"));
				student.setFirstName(rset.getString("first_name"));
				student.setLastName(rset.getString("last_name"));
				student.setFatherName(rset.getString("father_name"));
				student.setEmail(rset.getString("email"));
				student.setClassName(rset.getString("class_name"));
				student.setAge(rset.getInt("age"));
				data.add(student);
			}
			statement.close();
			connection.close();
			return data;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;

	}
}
