-- Create Database named: TraningDB
--Create database TrainingDB
use TrainingDB	-- change the current database
Create table DEPARTMENTS(Dno char(2) not null Primary key, Dname varchar(50) not null, Location varchar(120))
-- Append data into table
Insert into DEPARTMENTS(Dno,Dname,Location)
Values	('IT', 'Infomation Technology','Room 204, Floor 2'),
		('CS', 'Computer Science', 'Room 205, Floor 2nd')
Select * from DEPARTMENTS

Create table course(Cno char(6) not null Primary key, name varchar(20) not null, Credit int not null, ctype bit)
Insert into course(Cno,name,Credit,ctype) 
Values ('6','Database System',3 + 2.1,1)
Select * from course

Create table student(Cno char(8) not null Primary key, name varchar(50) not null, gender bit not null, DataOfBirth date,
class char(6) not null, dno char(2) not null, 
constraint FK_Department foreign key (Dno) References DEPARTMENTS(Dno))
