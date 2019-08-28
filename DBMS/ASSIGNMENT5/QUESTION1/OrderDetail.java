package QUESTION1;

import java.sql.*;

/**
 * This class represents Orders of user.
 * 
 * @author Murtaza Ali
 *
 */
public class OrderDetail {
	private int orderId;
	private int productId;
	private Date orderDate;
	private double orderTotal;

	/**
	 * @return productId
	 */
	public int getProductId() {
		return productId;
	}

	/**
	 * @param productId product Id of a product
	 */
	public void setProductId(int productId) {
		this.productId = productId;
	}

	/**
	 * @return Order Id
	 */
	public int getOrderId() {
		return orderId;
	}

	/**
	 * @param orderId order Id of a Order
	 */
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	/**
	 * @return order of a date
	 */
	public Date getOrderDate() {
		return orderDate;
	}

	/**
	 * @param orderDate set the date of order
	 */
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	/**
	 * @return total price of a order
	 */
	public double getOrderTotal() {
		return orderTotal;
	}

	/**
	 * @param orderTotal set price of a order
	 */
	public void setOrderTotal(double orderTotal) {
		this.orderTotal = orderTotal;
	}

}