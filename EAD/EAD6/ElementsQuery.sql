create database if not exists Inventory;
use Inventory;
create table if not exists Element(
name VARCHAR(20),
quantity INT
);
INSERT INTO Element(name,quantity)
Values('APPLE',20);