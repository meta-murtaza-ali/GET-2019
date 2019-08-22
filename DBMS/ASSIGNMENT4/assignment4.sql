USE storefront;

/*ASSIGNMENT1*/
/*Create a function to calculate number of orders in a month. Month and year will be input parameter to function*/
DROP FUNCTION IF EXISTS cal_orders;
DELIMITER $$
 CREATE FUNCTION cal_orders(input_month INT , input_year INT) RETURNS INT DETERMINISTIC
 BEGIN 
 DECLARE number_of_order INT ;
 SELECT count(*) INTO number_of_order
 FROM order_byuser
 WHERE month(date_of_order) IN(input_month) AND year(date_of_order) IN(input_year);
 RETURN number_of_order;
 END $$
 DELIMITER ;
 SELECT cal_orders(8,2019);
 
 /*Create a function to return month in a year having maximum orders. Year will be input parameter.*/
 DROP FUNCTION IF EXISTS cal_month;
 DELIMITER $$
 CREATE FUNCTION cal_month(input_year INT) RETURNS VARCHAR(10) DETERMINISTIC
 BEGIN
 DECLARE name_of_month VARCHAR(10);
 SELECT  MONTHNAME(date_of_order) INTO name_of_month 
 FROM order_byuser
 WHERE YEAR(DATE_OF_ORDER) IN(INPUT_YEAR)
 GROUP BY MONTH(DATE_OF_ORDER)  
 ORDER BY COUNT(*) DESC LIMIT 1
 ;
 RETURN name_of_month;
 END $$
 DELIMITER ;
 SELECT cal_month(2019);
 
 /*ASSIGNMENT2*/
 /*Create a Stored procedure to retrieve average sales of each product in a month. 
 Month and year will be input parameter to function*/
 DROP PROCEDURE IF EXISTS cal_average_sale;
 DELIMITER $$ 
 CREATE PROCEDURE get_average_sale(input_month INT ,input_year INT) 
 BEGIN 
 SELECT product.product_name,count(product.product_id) AS avg_sale
 FROM product JOIN order_byuser ON product.product_id = order_byuser.product_id
 WHERE month(order_byuser.date_of_order) IN (input_month) AND year(order_byuser.date_of_order) IN(input_year)
 GROUP BY order_byuser.product_id;
 END $$
 DELIMITER ;
CALL get_average_sale(8,2019);



/* Create a stored procedure to retrieve table having order detail with status for a given period. 
Start date and end date will be input parameter.*/
DROP PROCEDURE IF EXISTS get_order_detail;
DELIMITER $$
CREATE PROCEDURE get_order_detail(start_date DATE, end_date DATE)
BEGIN
   IF start_date>end_date THEN
       SET start_date=(end_date-Interval day(end_date) DAY) + Interval 1 DAY;
   END IF;
   SELECT Distinct order_byuser.order_Id,order_byuser.date_of_order,order_byuser.total_price,
   order_byuser.product_Id,status.shipped AS Shipped 
   FROM order_byuser JOIN status ON order_byuser.order_Id = status.order_Id 
   WHERE order_byuser.date_of_order>=start_date AND order_byuser.date_of_order<=end_date;
END$$
DELIMITER ;
CALL get_order_detail('2019-08-01',CURDATE());


/* ASSIGNEMNT-3 */
/*Identify the columns require indexing in order, product, category tables and create indexes.*/
ALTER TABLE product ADD INDEX product (product_Id);
ALTER TABLE category_of_product ADD INDEX parent_category_id (category_type);
ALTER TABLE order_byuser ADD INDEX parent_category_id (date_of_order);

