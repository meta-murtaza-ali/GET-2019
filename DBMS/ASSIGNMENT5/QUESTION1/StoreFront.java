package QUESTION1;

import java.sql.*;
import java.util.*;

/**
 * This is a main method of a store front
 * @author Murtaza Ali
 *
 */
public class StoreFront {
    
    public static void main(String args[])
    {
        System.out.println("order details of a user which is in shipped state");
        System.out.println("enter user id:");
        Scanner scanner=new Scanner(System.in);
        int userId=scanner.nextInt();
        if(DatabaseHelper.getOrderDetails(userId)!=null)
        {
        List<OrderDetail> listOfOrders=DatabaseHelper.getOrderDetails(userId);
        for(OrderDetail orderDetail:listOfOrders)
        {
            System.out.println(orderDetail.getOrderId());
            System.out.println(orderDetail.getProductId());
            System.out.println(orderDetail.getOrderDate());
            System.out.println(orderDetail.getOrderTotal());
            System.out.println();
        }
        }
        else
        {
        	System.out.println("userId not in database");
        }
        System.out.println();
        System.out.println("Mark Product status inactive for all those products which were not ordered by any Shopper in last 1 year");
        int updatedRows=DatabaseHelper.updateProductStatus();
        System.out.println("updated rows "+updatedRows);
        System.out.println();
        System.out.println();
        System.out.println("Top category details with their number of children");
        List<TopCategoryDetail> listOfTopCategories=DatabaseHelper.getTopCategoryDetails();
        for(TopCategoryDetail TopCategoryDetail:listOfTopCategories)
        {
            System.out.println(TopCategoryDetail.getName());
            System.out.println(TopCategoryDetail.getNumberOfChildren());
            System.out.println();
        }
    }

}
