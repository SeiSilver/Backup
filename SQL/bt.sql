use HOUSEDB

select * from EMPLOYEES
select * from CONTRACTS
select * from HOUSES
select * from CUSTOMERS

--Q1
select * from HOUSES
where price between 600 and 800
order by Area_m2

--Q2
select * from CUSTOMERS inner join CONTRACTS
on CUSTOMERS.CustomerID = CONTRACTS.CustomerID 
where ContractNo = 'CT001'
--Q3
select HOUSES.HouseID from HOUSES inner join CONTRACTS
on HOUSES.HouseID = CONTRACTS.HouseID
where month(StartDate) <9 and year(StartDate) = 2018
--Q4
select COUNT(HouseID) as NumberOfHouse, BedRoom from HOUSES 
group by BedRoom;
select * from HOUSES
--Q5
select EmpID from CONTRACTS
where YEAR(StartDate) = 2018
group by CONTRACTS.EmpID
having COUNT(*) >=3
--Q6
select CUSTOMERS.Cname, CUSTOMERS.Gender, HOUSES.HouseID, HOUSES.Area_m2, CONTRACTS.StartDate, CONTRACTS.EndDate, Duration, ContractValue,  Ename
from ((CONTRACTS inner join CUSTOMERS on CONTRACTS.CustomerID=CUSTOMERS.CustomerID) inner join EMPLOYEES 
on CONTRACTS.EmpID=EMPLOYEES.EmpID) inner join HOUSES 
on CONTRACTS.HouseID=HOUSES.HouseID
where month(EndDate)=6 and year(EndDate)=2018

select * from CONTRACTS
select * from HOUSES
select * from CUSTOMERS

-- Q7
select HOUSES.HouseID from HOUSES inner join CONTRACTS
on CONTRACTS.HouseID = HOUSES.HouseID 
where HOUSES.BedRoom = 1 and MOnth(CONTRACTS.StartDate) between 6 and 9 and YEAR(CONTRACTS.StartDate) = 2018 or YEAR(CONTRACTS.EndDate) = 2018
 -- Q8

select count(CONTRACTS.HouseID) as solan, sum(Duration) as SSUM ,sum(CONTRACTS.ContractValue) as tongvalue 
from CONTRACTS inner join HOUSES
on HOUSES.HouseID = CONTRACTS.HouseID
where year(CONTRACTS.StartDate) = 2018 
group by CONTRACTS.HouseID
select * from CONTRACTS

-- Q9
select top 1* from CONTRACTS
where year(StartDate)=2018
order by DATEDIFF(day, StartDate, EndDate) desc

-- Q10
select * from HOUSES
where Price < 500 and BedRoom = 3
