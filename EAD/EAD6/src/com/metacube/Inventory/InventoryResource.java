package com.metacube.Inventory;

import java.sql.SQLException;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

import com.metacube.Inventory.Element.Element;
import com.metacube.Inventory.Service.Service;

/**
 * @author Murtaza Ali
 * 
 * This Class is a resource of all operation through url.
 */
@Path("inventory")
public class InventoryResource {
	Service service = new Service();

	/**
	 * This method give all elements list.
	 * @return element List.
	 */
	@GET
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public List<Element> getElements() {
		List<Element> elementList = (List<Element>) service.getElements();
		return elementList;
	}

	/**
	 * This method give a particular element detail.
	 * @param name is give by url.
	 * @return element detail.
	 */
	@GET
	@Path("/{name}")
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public Element getElement(@PathParam("name") String name) {

		return (Element) service.getElement(name);
	}

	/**
	 * This method create element in data base.
	 * @param element is a object of a element class.
	 * @return created element.
	 */
	@POST
	@Path("insert")
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public Element create(Element element) {
		try {
			service.create((com.metacube.Inventory.Element.Element) element);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return element;
	}

	/**
	 * This method update element detail in database.
	 * @param element is a object of a element class.
	 * @return update element details.
	 */
	@PUT
	@Path("update")
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public Element update(Element element) {
		if (service.update(element)) {
			return element;
		}
		return null;
	}

	/**
	 * This method delete a particular element.
	 * @param name delete a element from database whose name is given by url.
	 */
	@DELETE
	@Path("delete/{name}")
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public void delete(@PathParam("name") String name) {
		service.delete(name);
	}
}
