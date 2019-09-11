package Employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Murtaza Ali 
 * Process All Query of Employee.
 */
public class ProcessEmployee {

	/**
	 * Insert Data of Employee in Data Base.
	 * 
	 * @param data
	 * @return
	 */
	public int create(EmployeeData data) {

		String query = "insert into EmployeeDetail(first_name,last_name,gender,email,emp_password,contact_number,emp_organization) values (?,?,?,?,?,?,?);";
		int employee_id = 0;
		try {
			Connection connection = DatabaseConnection.getConnection();
			// Allocate statement object in connection
			PreparedStatement statement = connection.prepareStatement(query);
			// execute select query and returns result set
			statement.setString(1, data.getFirstName());
			statement.setString(2, data.getLastName());
			statement.setString(3, data.getGender());
			statement.setString(4, data.getEmail());
			statement.setString(5, data.getPassword());
			statement.setString(6, data.getContactNumber());
			statement.setString(7, data.getOrganization());
			try {
				statement.executeUpdate();
			} catch (Exception e) {
				return -2;
			}
			statement.close();

			query = "select Employee_id from EmployeeDetail where email=?";
			PreparedStatement statement2 = connection.prepareStatement(query);
			statement2.setString(1, data.getEmail());
			ResultSet rset = statement2.executeQuery();
			while (rset.next()) {
				employee_id = rset.getInt("employee_id");
				data.setEmployee_id(employee_id);
			}
			connection.close();

		} catch (Exception Exception) {
			Exception.printStackTrace();
		}

		return employee_id;

	}

	/**
	 * Show Data Of Employee.
	 * 
	 * @param email
	 * @param password
	 * @return
	 */
	public List showData(String email, String password) {
		String query = "SELECT * FROM EmployeeDetail WHERE email=? AND emp_password=?";
		Connection connection = DatabaseConnection.getConnection();
		List data = new ArrayList<>();
		EmployeeData employee = new EmployeeData();
		try {
			PreparedStatement statement = connection.prepareStatement(query);
			statement.setString(1, email);
			statement.setString(2, password);
			try {
				ResultSet rset = statement.executeQuery();
				rset.next();
				employee.setEmployee_id(rset.getInt("employee_id"));
				employee.setFirstName(rset.getString("first_name"));
				employee.setLastName(rset.getString("last_name"));
				employee.setGender(rset.getString("gender"));
				employee.setEmail(rset.getString("email"));
				employee.setOrganization(rset.getString("emp_organization"));
				employee.setContactNumber(rset.getString("contact_number"));
				employee.setPassword(rset.getString("emp_password"));
				data.add(employee);
			} catch (Exception e) {

				return null;
			}

			statement.close();
			query = "select * from employeecardetail where Employee_id=?;";
			PreparedStatement statement2 = connection.prepareStatement(query);
			statement2.setInt(1, employee.getEmployee_id());
			ResultSet rset2 = statement2.executeQuery();
			rset2.next();
			EmployeeCarDetail carDetail = new EmployeeCarDetail();
			carDetail.setEmployeeId(rset2.getInt("employee_id"));
			carDetail.setCarName(rset2.getString("car_name"));
			carDetail.setVehicleType(rset2.getString("vehicle_type"));
			carDetail.setVehicleNumber(rset2.getString("vehicle_num"));
			carDetail.setPassType(rset2.getString("pass_type"));
			carDetail.setPassPrice(rset2.getString("price"));
			data.add(carDetail);
			return data;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;

	}

	/**
	 * Insert Car Detail of Employee.
	 * 
	 * @param data
	 */
	public void insertCarDetail(EmployeeCarDetail data) {
		String query = "insert into EmployeeCarDetail(Employee_id,car_name,vehicle_type,vehicle_num,pass_type,price) values (?,?,?,?,?,?);";
		try {
			Connection connection = DatabaseConnection.getConnection();
			// Allocate statement object in connection
			PreparedStatement statement = connection.prepareStatement(query);
			// execute select query and returns result set
			statement.setInt(1, data.getEmployeeId());
			statement.setString(2, data.getCarName());
			statement.setString(3, data.getVehicleType());
			statement.setString(4, data.getVehicleNumber());
			statement.setString(5, data.getPassType());
			statement.setString(6, data.getPassPrice());
			try {
				statement.executeUpdate();
			} catch (Exception e) {

			}
			statement.close();
			connection.close();

		} catch (Exception Exception) {
			Exception.printStackTrace();
		}
	}

	/**
	 * Update Detail of Employee.
	 * 
	 * @param data
	 * @return
	 */
	public int updateData(EmployeeData data) {
		String query = "update EmployeeDetail set first_name=?, last_name=?,gender=?,email=?,emp_password=?,contact_number=?,emp_organization=? where Employee_id=?;";
		int update_rows = 0;
		try {
			Connection connection = DatabaseConnection.getConnection();
			// Allocate statement object in connection
			PreparedStatement statement = connection.prepareStatement(query);
			// execute select query and returns result set
			statement.setString(1, data.getFirstName());
			statement.setString(2, data.getLastName());
			statement.setString(3, data.getGender());
			statement.setString(4, data.getEmail());
			statement.setString(5, data.getPassword());
			statement.setString(6, data.getContactNumber());
			statement.setString(7, data.getOrganization());
			statement.setInt(8, data.getEmployee_id());
			update_rows = statement.executeUpdate();
			statement.close();
			return update_rows;

		} catch (Exception Exception) {
			Exception.printStackTrace();
		}
		return update_rows;
	}

	/**
	 * Update Car Data of Employee.
	 * 
	 * @param data
	 * @return
	 */
	public int updateCarData(EmployeeCarDetail data) {
		String query = "update EmployeeCarDetail set car_name= ?, vehicle_type=?,vehicle_num=?,pass_type=?,price=? where Employee_id=?;";
		int update_rows = 0;
		try {
			Connection connection = DatabaseConnection.getConnection();
			// Allocate statement object in connection
			PreparedStatement statement = connection.prepareStatement(query);
			// execute select query and returns result set
			statement.setString(1, data.getCarName());
			statement.setString(2, data.getVehicleType());
			statement.setString(3, data.getVehicleNumber());
			statement.setString(4, data.getPassType());
			statement.setString(5, data.getPassPrice());
			statement.setInt(6, data.getEmployeeId());
			update_rows = statement.executeUpdate();
			statement.close();
			return update_rows;

		} catch (Exception Exception) {
			Exception.printStackTrace();
		}
		return update_rows;
	}

	/**
	 * Friend List of Employee.
	 * 
	 * @param emp_id
	 * @return
	 * @throws Exception
	 */
	public ArrayList<FriendsDetail> frendsList(int emp_id) throws Exception {
		Connection connection = DatabaseConnection.getConnection();
		String query = "select emp_organization from EmployeeDetail where employee_id=?";
		PreparedStatement statement1 = connection.prepareStatement(query);
		statement1.setInt(1, emp_id);
		ResultSet rset2 = statement1.executeQuery();
		rset2.next();
		String organization = (String) (rset2.getString("emp_organization"));
		System.out.print(organization);
		statement1.close();
		query = "select employee_id,first_name,last_name from EmployeeDetail where emp_organization = ? and not Employee_id = ?;";
		ArrayList<FriendsDetail> data = new ArrayList<>();

		try {
			PreparedStatement statement = connection.prepareStatement(query);
			statement.setString(1, organization);
			statement.setInt(2, emp_id);
			ResultSet rset = statement.executeQuery();
			while (rset.next()) {
				FriendsDetail employee = new FriendsDetail();
				employee.setEmployee_id(rset.getInt("employee_id"));
				employee.setFirstName(rset.getString("first_name"));
				employee.setLastName(rset.getString("last_name"));
				data.add(employee);
			}
			statement.close();
			return data;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return data;
	}

	/**
	 * Friend Profile of Employee Friend.
	 * 
	 * @param employee_id
	 * @return
	 */
	public FriendsDetail FriendProfile(int employee_id) {
		String query = "select first_name,last_name,gender,email,contact_number,emp_organization from EmployeeDetail where Employee_id = ?";
		FriendsDetail employee = new FriendsDetail();
		try {
			Connection connection = DatabaseConnection.getConnection();
			PreparedStatement statement = connection.prepareStatement(query);
			statement.setInt(1, employee_id);
			ResultSet rset = statement.executeQuery();
			while (rset.next()) {
				employee.setFirstName(rset.getString("first_name"));
				employee.setLastName(rset.getString("last_name"));
				employee.setGender(rset.getString("gender"));
				employee.setEmail(rset.getString("email"));
				employee.setOrganization(rset.getString("emp_organization"));
				employee.setContactNumber(rset.getString("contact_number"));
			}
			statement.close();
			return employee;

		} catch (Exception e) {

		}
		return employee;

	}
}
