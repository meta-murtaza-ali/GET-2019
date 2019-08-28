USE storefrONt;
/*ASSIGNMENT2*/
/*Display the list of products (Id, Title, Count of Categories) which fall in more than ONe Categories.
 */
SELECT product.product_id,product.product_name ,count(category_of_product.category_id) AS countcategory
FROM product JOIN category_of_product ON product.product_id = category_of_product.category_id
GROUP BY category_of_product.parent_id HAVING count(countcategory)>1;


/*Display Count of products*/ 
SELECT '1-100' AS 'RANGE in rs.', count(product_id) AS count
FROM product
WHERE product_price BETWEEN 0 AND 100
UNION 
SELECT '101-500',count(product_id)
FROM product
WHERE product_price BETWEEN 101 AND 500
UNION 
SELECT 'Above 500', count(product_id)
FROM product
WHERE product_price  > 500;

/*Display the Categories alONg with number of products under each category.*/
SELECT category_of_product.category_type AS "Category Title",
      count(product.category_id) AS "Number Of Product"
      FROM category_of_product INNER JOIN product
      ON category_of_product.category_id=product.category_id 
      GROUP BY category_of_product.category_id;

/*ASSIGNMENT3 */
/*Display Shopper’s informatiON alONg with number of orders he/she placed during lASt 30 days*/
SELECT user.user_id,user_name.firstName,user_name.lAStname,user.email_id,
count(order_byuser.user_id) AS numberoforders
FROM user JOIN user_name JOIN order_byuser ON user.user_id = user_name.user_id
WHERE order_byuser.user_id = user.user_id AND DATEDIFF(CURDATE(),order_byuser.date_of_order)<=30;

/*Display top 20 Products which are ordered most in lASt 60 days alONg with numbers.*/
SELECT product.product_name,count(order_byuser.product_id) AS numberoforder
FROM product JOIN order_byuser ON order_byuser.product_id = product.product_id
WHERE datediff(curdate(),order_byuser.date_of_order)<=60;

/*Display the top 10 Shoppers who generated maximum number of revenue in lASt 30 days.
 */
SELECT user_Name.firstname 
FROM user_Name INNER JOIN order_byuser ON user_Name.user_Id=order_byuser.user_Id  
WHERE DATEDIFF(CURDATE(),order_byuser.date_of_order)<=30
ORDER BY SUM(order_byuser.total_price) DESC LIMIT 10;

/*Display monthly sales revenue of the StoreFrONt for lASt 6 months. It should display each month’s sale.*/
SELECT month(order_byuser.date_of_order) AS month,SUM(order_byuser.total_price) AS sales_revenue
FROM  order_byuser WHERE TIMESTAMPDIFF(month,date_of_order,CURDATE())<=6  
GROUP BY month;

/*Mark the products AS Inactive which are not ordered in lASt 90 days*/
UPDATE product JOIN order_byuser ON product.product_Id=order_byuser.product_Id  
SET product.status='inactive' WHERE DATEDIFF(CURDATE(),order_byuser.date_of_order) >=90 ;

/*Given a category search keyword, display all the Products present in this category/categories.*/
SELECT product.product_name
FROM product JOIN category_of_product ON category_of_product.category_id = product.category_id
WHERE category_of_product.category_type = 'electrONics';

/*Display top 10 Items which were cancelled most.*/
SELECT product.product_name,count(status.product_id) AS numberofproduct,status.canceled_status
FROM product JOIN status ON status.product_id = product.product_id
GROUP BY status.product_id HAVING status.canceled_status = 'yes'
ORDER BY numberofproduct DESC LIMIT 10;

/*ASSIGNMENT4*/
/*Consider a form WHERE providing a Zip Code populates associated City and
State*/
CREATE TABLE zipcode
(
    zipcode INT NOT NULL,
    city VARCHAR(50) NOT NULL,
    state VARCHAR(50) NOT NULL,
    PRIMARY KEY(zipcode)
);

INSERT INTO zipcode VALUES
(313001, 'Udaipur', 'Rajasthan'),
(302019, 'Jaipur', 'Rajasthan'),
(302020, 'Jaipur', 'Rajasthan'), 
(302021, 'Jaipur', 'Rajasthan');

SELECT zipcode, city, state
FROM zipcode
ORDER BY state, city;

/*ASSIGNMENT5*/
/*Create a view displaying the order information (Id, Title, Price, Shopper’s name, Email, Orderdate, Status) 
with latest ordered items should be displayed first for last 60 days.*/
CREATE view orderInformation AS 
SELECT DISTINCT product.product_id,product.product_name,
product.product_price,user_name.firstname,
user.email_id,order_byuser.date_of_order,status.shipped
FROM user JOIN user_name JOIN product JOIN order_byuser JOIN status ON user.user_id = user_name.user_id
WHERE user.user_id = order_byuser.user_id 
AND order_byuser.product_id = product.product_id AND status.product_id = product.product_id 
AND datediff(now(),order_byuser.date_of_order)>=60
ORDER BY order_byuser.date_of_order DESC;
SELECT * FROM orderInformation;
DROP view orderInformation;

/*Use the above view to display the Products(Items) which are in ‘shipped’ state*/
SELECT product_name FROM orderInformation
WHERE shipped = 'y'; 

/*Use the above view to display the top 5 most selling products*/
SELECT product_name,count(product_id) as count  FROM orderInformation
GROUP BY product_id
ORDER BY count DESC limit 5;
