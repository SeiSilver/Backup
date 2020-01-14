/*
 name: Pham Duy Dat
 Class: SE1403
 ID: DE140191
*/
-- cau 0 -----
Create database SaleDB
--- cau 1----
use SaleDB

create table Items (Ino varchar(6) primary key not null,Iname varchar(15) not null,TaxRate float not null, UnitPrice float not null, AmountAvailable int not null)
create table Customers(Cno varchar(6) Primary key not null, Cname varchar(15) not null, Caddress varchar(15) not null, Email varchar(30) not null)
create table Orders(Ono varchar(6) not null, Ino varchar(6) not null foreign key references Items(Ino) , Cno varchar(6) not null foreign key references Customers(Cno),
                    Odate date not null , Amount int not null, Tax float not null, Total float not null, 
					CONSTRAINT PK_Orders PRIMARY KEY (Ono,Ino))

--- cau 2 ----
insert into Items(Ino, Iname, TaxRate, UnitPrice, AmountAvailable)
values ('I01','Book',0.6,10,100),
       ('I02','Pen',0.3,30,400),
	   ('I03','Toy',1,10,1000),
	   ('I04','Novel',0.9,400,3000),
	   ('I05','Laptop',2,500,200)
select * from Items

insert into Customers(Cno, Cname, Caddress, Email)
values ('C01','Khoa','Address1','khoa@gmail.com'),
       ('C02','Dat','Address2','Dat@gmail.com'),
       ('C03','Tin','Address3','Tin@gmail.com'),
       ('C04','Long','Address4','Long@gmail.com'),
       ('C05','Khang','Address5','Khang@gmail.com')
select * from Customers

insert into Orders(Ono, Ino, Cno, Odate ,Amount, Tax, Total) 
values ('N001','I01','C01','12-25-2019', 5, 0,0),
       ('N002','I02','C02','11-1-2019', 4, 0,0),
       ('N003','I03','C04','8-13-2018', 9, 0,0),
       ('N004','I01','C03','1-1-2019', 6, 0,0),
       ('N005','I04','C05','3-5-2018', 4, 0,0),
	   ('1101','I05','C03','6-2-2019', 1, 0,0)

select * from Orders

-- cau 3 + 4 --------------------------------------------------------------------------------------------------------
update Orders
set Total = Amount * UnitPrice
from Orders inner join Items on Orders.Ino = Items.Ino

update Orders
set Tax = Total * TaxRate
from Orders inner join Items on Orders.Ino = Items.Ino

select * from Orders
select * from Items

--- cau 5 --------------------------------------------------------------------------------------------------------
select top 2 * from Orders
where YEAR(Odate) = '2018'
order by Amount desc

select * from Customers
select * from Orders

----- cau 6 ---------------------------------------------------------------------------------------------------------
select Customers.* from Customers inner join Orders
on Orders.Cno = Customers.Cno and Orders.Ono = '1101'

---- cau 7 -----------------------------------------------------------------------------------------------------------
create trigger trg_Insert_Order on Orders
after insert
as 
begin 
     update Items
     set AmountAvailable = AmountAvailable - ( select Amount from inserted where Ino = Items.Ino) 
	 from Items inner join inserted on Items.Ino = inserted.Ino
end 

-- drop trigger trg_Insert_Order
select * from Items
insert into Orders(Ono, Ino, Cno, Odate ,Amount, Tax, Total) 
values ('Test','I01','C05','3-5-2019', 6, 0,0)

-- DELETE from Orders where Ono = 'Test'
select * from Items
select * from Orders

-- cau 8 ------------------------------------------------------------------------------------------------------------------
Create procedure  sp_Insert_Order (@Ono varchar(6), @Ino varchar(6), @Cno varchar(6), @Odate date , @Amount int , @Tax float, @Total float )
as
begin
   if not exists (select * from Items where @Amount < AmountAvailable and @Ino = Ino)
       print 'the amount you want to buy is surpassed our AmountAvailable'
   else if exists (select * from Orders where @Ono = Orders.ono)
       print 'This Orders code already exist - Please Enter another OrderNo'
   else 
       insert into Orders(Ono, Ino, Cno, Odate ,Amount, Tax, Total) 
       values (@Ono,@Ino,@Cno,@Odate,@Amount,@Tax,@Total)
end

-- drop procedure sp_Insert_Order 

-- delete from Orders where Ono = 'N000'

sp_Insert_Order 'N000','I01','C02','3-5-2019', 10, 0,0

select * from Items
select * from Orders