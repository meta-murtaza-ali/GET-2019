use storefront;

/* Display Recent 50 Orders placed (Id, Order Date, Order Total).
*/
select s.order_id,s.delivery_date,c.total_price
	from 
    status s join order_byuser c on s.order_id = c.order_id
    limit 50;

/*Display 10 most expensive Orders.
 */    
select c.order_id,p.product_name,c.total_price
from order_byuser c join product p on c.product_id = p.product_id
order by c.total_price DESC limit 10;

/*Display all the Orders which are placed 
more than 10 days old and one or more items from those orders are still not shipped. */
select * from order_byuser where date_of_order<Date_SUB(now(), interval 10 day); 

/*Display list of shoppers which haven't ordered anything since last month.*/
select user.user_id,user_name.firstname,user_name.lastname,user.email_id
from user join user_name join order_byuser on user.user_id = user_name.user_id
where user.user_type='shopper' and 
order_byuser.user_id = user.user_id and 
order_byuser.order_id not in(select distinct order_id 
                            from order_byuser
                            where 
                            Month(date_of_order) >=Month(now()-1) and 
                            year(date_of_order)=year(now()));
                                                                                                        

/*Display list of shopper along with orders placed by them in last 15 days. 
 */
select user.user_id,user_name.firstName,user_name.lastname,user.email_id
from user join user_name join order_byuser on user.user_id = user_name.user_id
where order_byuser.user_id = user.user_id and 
                                order_byuser.order_id in
                                (select order_id from order_byuser 
                                where date_of_order >= date_sub(now(),interval 15 day));

/*Display list of order items which are in “shipped” state for particular Order Id */
select product.product_name 
from product join order_byuser join status on order_byuser.product_id = product.product_id
where status.shipped='y' and order_byuser.order_id = status.order_id;

/*Display list of order items along with order placed date which fall between Rs 20 to Rs 50 price */
SELECT product.product_name, order_byuser.date_of_order FROM product
JOIN order_byuser ON product.product_Id=order_byuser.product_Id 
WHERE product.product_price BETWEEN 20 AND 50;
