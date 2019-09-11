create database EmployeeDetails;
use EmployeeDetails;
create table EmployeeDetail(Employee_id int not null auto_increment primary key,first_name varchar(20),last_name varchar(20),gender varchar(10),email varchar(50) unique,emp_password varchar(20),contact_number varchar(10),emp_organization varchar(10));
create table  EmployeeCarDetail(Employee_id int,car_name varchar(20),vehicle_type varchar(20),vehicle_num varchar(20),pass_type varchar(20),price varchar(20),
foreign key (Employee_id) references  EmployeeDetail(Employee_id));