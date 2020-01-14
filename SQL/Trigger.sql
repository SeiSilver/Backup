Create database BT1
USE BT1

--Create table ACCOUNTTRANSFER(TransferID char(10) not null Primary key, TransferTime datetime not null,
--                             AccnoSend char(10) not null,AccnoReceive char(10) not null ,Amount int not null, fee int not null )

--Create table ACCOUNTS(AccNo char(10) not null Primary key, Cno char(10) not null,Cname varchar(30) not null, DateExpired date not null, 
--PIN int not null, Balance int not null) 

--Insert into ACCOUNTS(AccNo,Cno,Cname,DateExpired, PIN, Balance)
--Values	('1', '01','Dat', '11-20-2018', 100, 5000),
--		('2', '02','Sei', '10-25-2013', 200, 5000),
--		('3', '03','Khoa', '12-28-2019', 300, 5000),
--		('4', '04','Anna', '2-15-2023', 400, 5000),
--		('5', '05','Long', '5-9-2020', 500, 5000)


--create table TRANSACTIONS (TranID char(10) not null Primary Key, TranTime time not null, Withdraw int not null, fee int not null,
--AccNo char(10),  MachineNo char(10) not null)

--select * from ACCOUNTS
--select * from TRANSACTIONS
--select * from ACCOUNTTRANSFER


---------------------------------------------------------------------------------------------------------


/* trigger
systax: 
create Trigger <trigger_name>
on <table>
for <insert|delete|update>
as 
begin
trigger's body
end
*/

---------------------------------------------------------------------------------------------------------

select * from ACCOUNTS
select * from TRANSACTIONS

create trigger trg_insert_transaction
on transactions

for insert 
as begin 
Update ACCOUNTS 
set Accounts.Balance = ACCOUNTS.Balance - inserted.withdraw 
from ACCOUNTS inner join inserted on ACCOUNTS.AccNo = inserted.AccNo
end

--drop trigger trg_insert_transaction // use to delete trigger
insert into TRANSACTIONS 
values ('004',GETDATE(),400,2,'1','M002')

select * from ACCOUNTS
select * from TRANSACTIONS
select * from ACCOUNTTRANSFER

---------------------------------------------------------------------------------------------------

create trigger trg_insert_transfer
on Accounttransfer
for insert 
as begin 
Update ACCOUNTS
set ACCOUNTS.Balance = ACCOUNTS.Balance - inserted.Amount - inserted.fee
from ACCOUNTS inner join inserted on ACCOUNTS.AccNo = inserted.AccnoSend

Update ACCOUNTS
set ACCOUNTS.Balance = ACCOUNTS.Balance + inserted.Amount
from ACCOUNTS inner join inserted on ACCOUNTS.AccNo = inserted.AccnoReceive
end

insert into ACCOUNTTRANSFER
values ('001',GETDATE(),'1','2',700,1)

select * from ACCOUNTS
select * from ACCOUNTTRANSFER

select * from TRANSACTIONS

-----------------------------------------------------------------------------------------------------------
-- xoa acc thi thong tin tren tai khoan cung bi xoa theo

create trigger trg_update_accounts
on accounts
for update
as begin
select * from deleted
select * from inserted
end

select * from ACCOUNTS 

update ACCOUNTS
set Balance = 6000 
where AccNo = '1'

-- loi ic

