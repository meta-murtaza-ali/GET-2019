package com.metacube.Inventory.Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.metacube.Inventory.SQLConnection;
import com.metacube.Inventory.Element.Element;

public class Service {
	Connection connection = null;
	public Service(){
		connection = SQLConnection.getConnection();
	}
	
	public List<Element> getElements(){
		List<Element> elementList = new ArrayList<>();
		String sqlQuery = "SELECT * FROM Element";
		try {
			PreparedStatement statement = connection.prepareStatement(sqlQuery);
			 ResultSet rset= statement.executeQuery();
			 while(rset.next()){
				Element element = new Element();
				element.setName(rset.getString("name"));
				element.setQuantity(rset.getInt("quantity"));
				elementList.add(element);
			 }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return elementList;
		
	}
	
	public Element getElement(String name){
		String sqlQuery = "SELECT * FROM Element WHERE name=?";
		Element element = new Element();
		try {
			PreparedStatement statement = connection.prepareStatement(sqlQuery);
			statement.setString(1, name);
			 ResultSet rset= statement.executeQuery(); 
			 while(rset.next()){				
				element.setName(rset.getString("name"));
				element.setQuantity(rset.getInt("quantity"));
			 }
			 statement.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return element;		
	}
	
	public void create(Element element) throws SQLException{
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
		}
		finally{
			statement.close();
		}
	}
}
