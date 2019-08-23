package QUESTION1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Define the data base connection and connect with database
 * 
 * @author Murtaza Ali
 *
 */
public class DatabaseConnection {
	public static Connection getConnection() {
		Connection connection = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost/StoreFront";
			String username = "root";
			String password = "root";
			connection = DriverManager.getConnection(url, username, password);
		} catch (ClassNotFoundException classNotFoundException) {
			classNotFoundException.printStackTrace();
		} catch (SQLException sqlException) {
			sqlException.printStackTrace();
		}
		return connection;
	}

}
