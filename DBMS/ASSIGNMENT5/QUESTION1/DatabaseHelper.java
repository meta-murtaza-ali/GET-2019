package QUESTION1;

import java.sql.*;
import java.sql.Date;
import java.util.*;

public class DatabaseHelper {

	/**
	 * This method is used to execute query to get order details of a user whose
	 * orders are in shipped state.
	 * 
	 * @author Murtaza Ali
	 * @param userId
	 * @return list of orders
	 */
	public static List<OrderDetail> getOrderDetails(int userId) {
		if (userId > 0) {

			List<OrderDetail> listOfOrders = new ArrayList<OrderDetail>();
			String query = Query.getOrderDetailQuery(userId);
			try (Connection connection = DatabaseConnection.getConnection();
			// Allocate statement object in connection
					PreparedStatement statement = connection
							.prepareStatement(query);) {
				// execute select query and returns result set
				ResultSet rset = statement.executeQuery();
				if (!rset.next()) {
					return null;
				}
				while (rset.next()) {
					int orderId = rset.getInt("order_id");
					int productId = rset.getInt("product_id");
					Date orderDate = rset.getDate("date_of_order");
					double orderTotal = rset.getDouble("Total_price");
					OrderDetail orderDetail = new OrderDetail();
					orderDetail.setOrderId(orderId);
					orderDetail.setProductId(productId);
					orderDetail.setOrderDate(orderDate);
					orderDetail.setOrderTotal(orderTotal);
					listOfOrders.add(orderDetail);
				}

			} catch (SQLException sqlException) {
				sqlException.printStackTrace();
			}
			return listOfOrders;
		}
		return null;
	}

	/**
	 * This method is used to execute query to mark inactive status for all
	 * products which were not ordered by any Shopper in last 1 year.
	 * 
	 * @return 1 and 0
	 */
	public static int updateProductStatus() {

		String query[] = Query.getUpdateProductStatusQuery();
		try {
			Connection connection = DatabaseConnection.getConnection();
			connection.setAutoCommit(false);
			// Allocate statement object in connection
			PreparedStatement statement = null;
			int rows = 0;

			for (int i = 0; i < query.length; i++) {

				statement = connection.prepareStatement(query[i]);
				// execute update query and return updated rows
				rows = statement.executeUpdate();

			}
			// statement.executeBatch();
			connection.commit();
			return rows;
		} catch (SQLException sqlException) {
			sqlException.printStackTrace();
		}
		return 1;
	}

	/**
	 * This method is used to execute query to get top category details with
	 * their child count.
	 * 
	 * @return
	 */
	public static List<TopCategoryDetail> getTopCategoryDetails() {
		List<TopCategoryDetail> listOfTopCategoryDetail = new ArrayList<TopCategoryDetail>();
		String query = Query.getTopCategoryDetails();
		try (Connection connection = DatabaseConnection.getConnection();
		// Allocate statement object in connection
				PreparedStatement statement = connection
						.prepareStatement(query);) {
			// execute select query and returns result set
			ResultSet rset = statement.executeQuery();
			while (rset.next()) {
				String categoryName = rset.getString("Category_type");
				int numberOfChildren = rset.getInt("number_Of_Child");
				TopCategoryDetail topCategoryDetail = new TopCategoryDetail();
				topCategoryDetail.setName(categoryName);
				topCategoryDetail.setNumberOfChildren(numberOfChildren);
				listOfTopCategoryDetail.add(topCategoryDetail);
			}

		} catch (SQLException sqlException) {
			sqlException.printStackTrace();
		}
		return listOfTopCategoryDetail;
	}

}
