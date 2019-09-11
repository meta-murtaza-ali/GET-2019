create database ead_mvc;
use ead_mvc;
create table user(user_id INT PRIMARY KEY auto_increment,user_name VARCHAR(20),address VARCHAR(50),contact_number LONG);
create table product(product_code INT PRIMARY KEY auto_increment,product_type VARCHAR(20),product_name VARCHAR(20),product_price INT);
create table cart(user_id INT ,product_code INT,quantity INT, FOREIGN KEY(user_id) REFERENCES user(user_id), FOREIGN KEY(product_code) REFERENCES product(product_code));