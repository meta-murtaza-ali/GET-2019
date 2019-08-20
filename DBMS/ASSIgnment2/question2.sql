use storefront;

Insert into user(user_id,email_id,password,dateofbirth,contactnumber,user_type)
values (1,'murtazaali397@gmail.','murtsaza1234',11/01/1997,80038374,'admin'),
       (2,'murtazaaklera@gmail','murtaza123',12/02/2000,1234567,'shopper'),
       (3,'murtaza111@gmail','murtaza111',13/03/2001,86597423,'shopper');
       
Insert into product(product_Id,product_name,product_price,product_manufacturingdate,product_image,product_quantity,product_discription,category_id)
values (1,'earphone',10,'1997-02-02','c/pen.jpg',3,' samsung',1),
       (2,'pencil',20,'1998-03-02','c/pencil.jpg',3,'pencil',3),
       (3,'rubber',30,'2000-03-01','c/ruuber.jpg',4,'rubber',4);
       
Insert into user_Name (user_id,firstname,lastname)
values (1,'murtaza','ali'),
       (2,'jyoti','jangid'),
       (3,'priya','pandey');
       
select * from user_name;

insert into user_address(user_id,user_addressId,city,state,pin_code)
values (1,1,'jaipur','rajasthan',302017),
       (1,2,'aklera','rajasthan',326033),
       (2,1,'jodhpur','rajasthan',335262),
       (3,1,'jhalawar','rajasthan',251562);

insert into category_of_product(category_id,category_type,parent_id)
values (1,'electronics',1),
       (2,'earphone',1),
       (3,'samsung earphone',2),
       (4,'men',4),
       (5,'shirt',4);
       
insert into cart(user_id,product_id,total_price,quantity)
values (1,1,10,1),
       (1,2,40,2),
       (2,1,20,2),
       (3,3,30,1);
       
insert into order_byuser(order_id,address_id,product_id,user_id,total_price,Date_of_order)
values (1,1,1,1,10,'2019/01/11'),
       (2,2,2,1,40,'2019/02/15'),
       (3,1,3,3,30,'2018/03/13');
       
insert into order_byuser(order_id,address_id,product_id,user_id,total_price,Date_of_order)
values (4,1,1,1,10,'2019/08/11'),
       (5,2,2,1,40,'2019/08/15');
select * from order_byuser;

insert into status(order_id,delivery_date,shipped)
values (1,'2019/01/29','y'),
        (2,'2019/02/20','y'),
        (3,'2018/03/21','y'),
        (4,'2019/08/22','n');

/* Display Id, Title, Category Title, Price of the products which are Active and recently added products should be at top.
*/
select  product.product_id,product.product_name,category_of_product.category_type,product.product_price 
    from 
        product join category_of_product on product.category_id = category_of_product.category_id
    where not product.product_quantity = 0
    order by product.product_id DESC limit 10;
    
Insert into product(product_Id,product_name,product_price,product_manufacturingdate,product_quantity,product_discription,category_id)
values (4,'phone',10,'1997-02-02',3,' samsung',1);

/*Display the list of products which don't have any images.
 */
select product_name
    from 
        product  
    where product_image is null;

insert into category_of_product(category_id,category_type)
values (0,'electrical');
 
 
/*Display all Id, Title and Parent Category Title for all the Categories listed, sorted by Parent Category Title and then Category Title.
 */
select main_category.category_id,main_category.category_type as Title,
IFNULL(temp_category.parent_id,'TOP CATEGORY') AS PARENTCATEGORY
    FROM 
        category_of_product main_category
        left join category_of_product temp_category
        on main_category.category_id = temp_category.category_id;
        
/*Display Id, Title, Parent Category Title of all the leaf Categories  */
select c.category_id,c.category_type,e.category_type as parentcategory
from category_of_product c join category_of_product e on c.parent_id = e.category_id
where  c.category_id not in (select distinct c.parent_id from category_of_product c
                                                        where c.parent_id is not null);

/*Display Product Title, Price & Description which falls into particular category Title  */
SELECT p.product_name,p.product_price,p.product_discription 
FROM product p JOIN category_of_product c ON c.category_Id=p.category_Id 
WHERE c.category_Id=(SELECT category_Id from product where product_name='earphone');

/*Display the list of Products whose Quantity on hand (Inventory) is under 50.*/
SELECT product_name FROM product WHERE product_quantity<50;    
    
    