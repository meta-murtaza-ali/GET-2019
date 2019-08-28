package QUESTION1;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class TestQuery {

	@Test
	public void OrderDetailTest() {
		
		List<OrderDetail> orderDetail = DatabaseHelper.getOrderDetails(1);
		assertEquals(5,orderDetail.get(0).getOrderId());
		
		
	}
	
	@Test
	public void OrderDetailTestnull() {
		
		List<OrderDetail> orderDetail = DatabaseHelper.getOrderDetails(-1);
		assertEquals(null,orderDetail);		
	}
	
	@Test
	public void TopCategoryTest() {
		
		List<TopCategoryDetail> orderDetail = DatabaseHelper.getTopCategoryDetails();
		assertEquals(1,orderDetail.get(0).getNumberOfChildren());		
	}
	
	@Test
	public void ProductStatusTest() {
		
		int orderDetail = DatabaseHelper.updateProductStatus();
		assertEquals(0,orderDetail);		
	}
}
