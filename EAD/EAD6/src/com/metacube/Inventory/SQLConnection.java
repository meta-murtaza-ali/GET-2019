package com.metacube.Inventory;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;
import java.sql.Connection;
import java.sql.DriverManager;

import com.ibatis.common.jdbc.ScriptRunner;

/**
 * This is a component class. 
 * This class provides connection from the database
 * 
 * @author Murtaza Ali
 */
public class SQLConnection {

	// Reference variables.
	private static Connection connection;

	/**
	 * This method returns Connection class object.
	 * 
	 * @return Connection class object
	 */
	public static Connection getConnection() {
		String url = "jdbc:mysql://localhost:3306/";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(url, "root", "root");
			// Initialize object for ScripRunner
			ScriptRunner sr = new ScriptRunner(connection, false, false);
			// Give the input file to Reader
			Reader reader = new BufferedReader(new FileReader(
					"C:/Users/Admin/workspace/Inventory/ElementsQuery.sql"));
			// Exctute script
			sr.runScript(reader);
		} catch (Exception e) {
			System.err.println("Failed to Execute" + " The error is "
					+ e.getMessage());
		}
		return connection;
	}
}
