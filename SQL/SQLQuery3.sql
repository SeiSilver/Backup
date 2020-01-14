----Create database HouseManage

use HouseManage	

--create table CONTRACTS(ContractNo varchar(10) not null, HouseID varchar(10) not null, EmpID varchar(10) not null, 
--CustomerID varchar(10) not null, StateDate datetime not null, EndDate datetime not null, 
--Duration int not null, ContractValue int not null, 
--PrePaid int not null, OutstandingAmount int not null)

--create table CUSTOMERS(CustomerID varchar(10) not null, Gender int not null, Cname varchar(32) not null, 
--Caddress varchar(32) not null, Email varchar(20) not null)


--create table EMPLOYEES(EmpID varchar(10) not null, Ename varchar(10) not null, Email varchar(10) not null, 
--Salary int not null, gender int not null)


--create table HOUSES (HouseID varchar(10) not null, Area_m2 float not null, Price int not null, BedRoom int not null)

select * from CONTRACTS
select * from EMPLOYEES
select * from CUSTOMERS
select * from HOUSES

update HOUSES
set price = case
when Area_m2 <= 70 then 250
when Area_m2 >=70 AND Area_m2 <= 90 then 300
when Area_m2 >90 And Area_m2 <=100 then 400
else 500
end

update HOUSES
set price = iif(Area_m2 >= 70 and Area_m2 <=90,price+price*0.2,price)
--between 70 and 90 // co lenh

update CONTRACTS
set Duration = DATEDIFF(MONTH,StateDate,EndDate)

update CONTRACTS
set ContractValue  = Duration * Price
from CONTRACTS inner join HOUSES on CONTRACTS.HouseID = HOUSES.HouseID

update CONTRACTS
set PrePaid = ContractValue*case
when Duration >12 then 0.5
when Duration >=6 then 0.7
else 0.85
end

update CONTRACTS
set OutstandingAmount = ContractValue*1.1-PrePaid