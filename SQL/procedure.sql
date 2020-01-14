-- store Procedured (SP) in SQL
/*
create Procedured <SP_name> (Parameter)
as begin
sql statements
end 

Call to execute a SP
Sp_name Parameters 
*/
use ATM

select * from ACCOUNTS
select * from TRANSACTIONS

create procedure SP_Tran_add(@TranID char(6), @AccNo char(6), @Withdraw int, @MachineNo char(4))
as 
begin

if not exists (select * from ACCOUNTS where AccNo = @AccNo)
   print 'Account does not exist'
else if exists (select * from TRANSACTIONS where TranID = @TranID)
   print 'Transaction ID aready exist'
else 
  begin 
    declare @Balance int
    select @Balance = Balance from ACCOUNTS  where AccNo = @AccNo
    if (@Balance < @Withdraw ) print ('Withdraw must be Smaller then Blance')
    else 
---
       begin
           Insert into TRANSACTIONS
           values (@TranID, GETDATE(), @Withdraw,@AccNo,@MachineNo)
           update ACCOUNTS
           set Balance = Balance - @Withdraw
           where AccNo = @AccNo
           print 'The transaction is completed!'  
       end
  end
end

drop procedure SP_Tran_add

SP_Tran_add '003','1',1000,'M003'

select * from ACCOUNTS
select * from TRANSACTIONS

