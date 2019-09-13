package com.metacube.Inventory.Element;

/**
 * @author Murtaza Ali
 * This is pojo class of a element.
 */
public class Element {
	private String name;
	private int quantity;
	
	public Element(){	
		
	}
	
	/**
	 * @param name String type name
	 * @param quantity int type quantity 
	 */
	public Element(String name , int quantity){
		this.name = name;
		this.quantity = quantity;
	}
	
	/**
	 * @return String type name
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * @param name String type
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * @return int type quantity 
	 */
	public int getQuantity() {
		return this.quantity;
	}
	
	/**
	 * @param quantity int type
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	@Override
	public String toString() {
		return "element [name=" + this.name + ", quantity=" + this.quantity + "]";
	}
	
	
}
