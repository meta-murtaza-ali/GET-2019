create database EmployeeDetailsdb;
use EmployeeDetailsdb;


create table EmpDetails(
empId int(5) primary key not null auto_increment,
empName varchar(25) not null,
empEmail varchar(25) unique,
empContact varchar(25) not null,
empGender varchar(7) not null,
empPassword varchar(25) not null,
empOrganization varchar(25) not null

);

create table empVehicleDetails(
empId int(10) primary key not null,
vehicleName varchar(25) not null,
vehicleType varchar(25) not null,
vehicleNumber varchar(25) not null,
PassPriceDetail varchar(25) not null,
foreign key(empId) references EmpDetails(empId)
);

select * from EmpVehicleDetails;

select * from EmpDetails;

select empId from empDetails 
where empName='a' 
AND empEmail='a' 
AND empContact='a' 
AND empGender='Male' 
AND empPassword='a' 
AND empOrganization='Metacube' ; 


select empName, empEmail, empContact, empGender, empPassword, empOrganization,vehicleName,vehicleType,vehicleNumber,PassPriceDetail 
from empDetails INNER JOIN empVehicleDetails on empDetails.empId=empVehicleDetails.empId where empDetails.empId=2;

select e.empName, e.empEmail, e.empContact, e.empGender, e.empPassword, e.empOrganization,v.vehicleName,v.vehicleType,v.vehicleNumber,v.PassPriceDetail 
from empDetails e INNER JOIN empVehicleDetails v on e.empId=v.empId where e.empId=2