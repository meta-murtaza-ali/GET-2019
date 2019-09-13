package com.metacube.Inventory;



import java.sql.SQLException;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.metacube.Inventory.Element.Element;
import com.metacube.Inventory.Service.Service;

@Path("inventory")
public class InventoryResource<Element> {
	Service service=new Service();
	
	
	
	@GET
	@Consumes({MediaType.APPLICATION_JSON , MediaType.APPLICATION_XML})
	public List<Element> getElements(){
		List<Element> elementList = (List<Element>) service.getElements(); 
		return  elementList;
		
	}
	
	@GET
	@Path("{name}")
	@Consumes({MediaType.APPLICATION_JSON , MediaType.APPLICATION_XML})
	public Element getElement(@PathParam("name") String name){
		 
		return (Element) service.getElement(name) ;
	}
	
	@POST
	@Path("insert")
	@Consumes({MediaType.APPLICATION_JSON , MediaType.APPLICATION_XML})
	public Element create(Element element){
		try {
			System.out.println(element);
			service.create((com.metacube.Inventory.Element.Element) element);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return element;
	}
}
