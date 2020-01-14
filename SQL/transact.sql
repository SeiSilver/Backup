use JOB_DB

select * from JOBS

delete from JOBS
where JobNo = 5

Truncate table Jobs -- xoa het du lieu trong bang
delete from JOBS -- xoa du lieu dua tren dieu kien 2 lệnh này giống nháu nếu delete ko có where

-- trong slide session 15 co noi 

---------------------------------------------------------
use ATM
select * from Accounts

begin Transaction T1
update ACCOUNTS
set Balance = 0
where AccNo = '1'
rollback Transaction T1

select * from ACCOUNTS

---------------------------------------------------------
select * from ACCOUNTS

begin Transaction T2
update ACCOUNTS
set Balance = 1000
where AccNo = '1'
commit Transaction T2 -- acc1 has been changed

select * from ACCOUNTS


update ACCOUNTS
set Balance = 0
where AccNo = '1'
---------------------------------------------------------
select * from ACCOUNTS
begin Transaction T3
update ACCOUNTS set Balance = 100 where AccNo = '1'
save Transaction SP1
update ACCOUNTS set Balance = 400 where AccNo = '2'
save Transaction SP2
update ACCOUNTS set Balance = 400 where AccNo = '3'
rollback transaction SP1
update ACCOUNTS set Balance = 500 where AccNo = '4'
commit Transaction T3 -- acc1 has been changed
select * from ACCOUNTS

