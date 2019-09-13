package com.metacube.Inventory.Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.metacube.Inventory.SQLConnection;
import com.metacube.Inventory.Element.Element;

/**
 * @author Murtaza Ali. 
 * This class content all method for database.
 */
public class Service {
	Connection connection = null;

	public Service() {
		connection = SQLConnection.getConnection();
	}

	/**
	 * This method give all element list from database.
	 * 
	 * @return element List.
	 */
	public List<Element> getElements() {
		List<Element> elementList = new ArrayList<>();
		String sqlQuery = "SELECT * FROM Element";
		PreparedStatement statement = null;
		try {
			statement = connection.prepareStatement(sqlQuery);
			ResultSet rset = statement.executeQuery();
			while (rset.next()) {
				Element element = new Element();
				element.setName(rset.getString("name"));
				element.setQuantity(rset.getInt("quantity"));
				elementList.add(element);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				statement.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return elementList;

	}

	/**
	 * This method give element detail from database.
	 * 
	 * @param name
	 * @return
	 */
	public Element getElement(String name) {
		String sqlQuery = "SELECT * FROM Element WHERE name=?";
		Element element = new Element();
		PreparedStatement statement = null;
		try {
			statement = connection.prepareStatement(sqlQuery);
			statement.setString(1, name);
			ResultSet rset = statement.executeQuery();
			while (rset.next()) {
				element.setName(rset.getString("name"));
				element.setQuantity(rset.getInt("quantity"));
			}
			statement.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				statement.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return element;
	}

	public void create(Element element) throws SQLException {
		String sqlQuery = "INSERT INTO Element(name,quantity) VALUES(?,?)";
		PreparedStatement statement = null;
		try {
			statement = connection.prepareStatement(sqlQuery);
			statement.setString(1, element.getName());
			statement.setInt(2, element.getQuantity());
			statement.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			statement.close();
		}
	}

	/**
	 * This method update the element in database.
	 * 
	 * @param element
	 * @return
	 */
	public boolean update(Element element) {
		String sqlQuery = "UPDATE Element set quantity=? WHERE name=?;";
		PreparedStatement statement = null;
		try {
			statement = connection.prepareStatement(sqlQuery);
			statement.setInt(1, element.getQuantity());
			statement.setString(2, element.getName());
			statement.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		finally {
			try {
				statement.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		return true;
	}

	/**
	 * This method delete detail from database.
	 * 
	 * @param name
	 */
	public void delete(String name) {
		String sqlQuery = "delete from Element where name=?;";
		PreparedStatement statement = null;
		try {
			statement = connection.prepareStatement(sqlQuery);
			statement.setString(1, name);
			statement.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		finally {
			try {
				statement.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
