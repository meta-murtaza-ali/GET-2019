package QUESTION1;

/**
 * This is utility class to store queries.
 * 
 * @author Murtaza Ali
 *
 */
public class Query {

	/**
	 * Returns query to fetch all order details of a user which are in shipped
	 * state. Orders should be sorted by order date column in chronological
	 * order.
	 * @param userId contains Id of user whose order to be fetched.
	 * @return
	 */
	public static String getOrderDetailQuery(int userId) {
		String query = "SELECT distinct order_byuser.order_id,order_byuser.product_id,order_byuser.date_of_order,order_byuser.total_price FROM order_byuser join user on order_byuser.user_id = user.user_id join status on order_byuser.order_id = status.order_id WHERE user.user_id ="
				+ userId
				+ " AND status.shipped = 'y' order by order_byuser.date_of_order ASC";
		return query;
	}

	/**
	 * Returns query to mark inactive status for all products which were not
	 * ordered by any Shopper in last 1 year.
	 * 
	 * @return
	 */
	public static String[] getUpdateProductStatusQuery() {
		String query[] = new String[3];
		query[0] = "set foreign_key_checks=0";
		query[1] = "DELETE FROM product where product.product_id not in (select order_byuser.product_id from order_byuser where timestampDIFF(month,date_of_order,curdate())<=12)";
		query[2] = "set foreign_key_checks=1";
		return query;
	}

	/**
	 * Returns query to select the category title of all top parent categories
	 * sorted alphabetically and the count of their child categories.
	 * 
	 * @return
	 */
	public static String getTopCategoryDetails() {
		String query = "Select C.category_type , count(o.parent_id) as number_of_child from category_of_product c join category_of_product o on c.category_id = o.parent_id group by o.parent_id order by c.category_type;";
		return query;
	}

}
