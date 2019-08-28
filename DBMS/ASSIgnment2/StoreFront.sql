CREATE DATABASE StoreFront;
USE StoreFront;
CREATE TABLE user
(user_id int not null auto_increment primary key,
email_Id varchar(20),
password varchar(20),
DateofBirth Date,
contactnumber int);

USE sTOREfRONT;
SHOW TABLES;
dESCRIBE USER;
CREATE TABLE product(
    product_Id int primary key,
    product_name varchar(20),
    product_price int,
    product_manufacturingdate Date,
    product_image varchar(20),
    product_quantity int,
    product_discription varchar(20)
    );
alter table product add (category_id int,foreign key (category_id) references category_of_product(category_id));
set foreign_key_checks=0;
drop table product;
set foreign_key_checks=1;

CREATE TABLE USER_NAME(
    user_Id int,
    firstName varchar(20),
    lastName varchar(20),
    foreign key (user_Id) references user(user_id)
    );
ALTER TABLE user ADD (user_type varchar(20));
DESCRIBE USER;

CREATE TABLE user_address(
    user_id int,
    user_addressId varchar(50) NOT NULL,
    city varchar(10),
    state varchar(10),
    pin_code int,
    PRIMARY KEY(user_id,user_addressId),
    FOREIGN KEY (user_id) REFERENCES user(user_id)
    );
    
CREATE TABLE contact_number_of_user(
    user_id int,
    contact_number int,
    FOREIGN KEY (user_id) REFERENCES user(user_id)
    );
    
CREATE TABLE category_of_product(
    category_id int not null primary key,
    category_type varchar(50),
    parent_id int,
    foreign key (parent_id) references category_of_product(category_id)
    );
CREATE TABLE cart(
    user_id int,
    product_id int,
    total_price int,
    quantity int,
    primary key (user_id,product_id),
    foreign key (user_id) references user(user_id),
    foreign key (product_id) references product(product_Id)
    );
CREATE TABLE Order_ByUser(
    order_id int,
    address_id varchar(50),
    product_id int,
    user_id int,
    total_price int,
    Date_of_order Date,
    Primary key(order_id,address_id,product_id,user_id),
    foreign key (product_id) references product(product_Id)
);
ALTER tABLE ORDER_BYUSER ADD(FOREIGN KEY (USER_ID,ADDRESS_ID) references user_address(user_id,user_addressId) );
Create TABLE status(
    order_id int,
    delivery_date Date,
    shipped char(3)
    );
    set foreign_key_checks=0;
drop table status;
set foreign_key_checks=1;
show tables;