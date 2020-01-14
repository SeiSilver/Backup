/* basic programing in sql
Declare variable in sql
granted value
control structures in sql (if, case, while) 
block of code i sql

Declare @varname data tyoe [=initial value]
granted value: set, select
*/

declare @name varchar(50), @age int = 30, @gender bit 
set @name = 'dat'
select @gender = 0
print 'hello world ' + @name
if (@gender = 1)
print 'hello Mr.' + @name
else 
print 'hello Ms.' + @name
-- while loop
/* 
while (condition) 
begin 
     SQL statements
end
-- block of code: begin .... end
-- sum = 1+2+...+n
*/
--declare @n int = 10, @i int = 1, @result int =0
--while @i <= @n

--begin 
--  set @result +=@i
--  set @i+=1
--end
--print 'total is:' + str(@result)

-- int 10 dong
--declare @i int = 0
--while @i != 10 
--begin
--  if ( @i < 7) print 'tap trung hoc tap' 
--  else print 'lam van game roi nghi' 
--  set @i+=1
--end 

-- prime
/*
declare @check int = 6, @m int = 0, @i int = 2, @stt bit = 0
set @m = sqrt(@check)

while (@i < @m)
begin 
  if (@check % @i = 0)
    begin
       set @stt = 0
       break
    end
  else
    begin
       set @stt = 1
       break
    end
  set @i+=1
end 

if @stt = 0  print str(@check) + ' Not a prime'
else if @stt = 1 print str(@check)+ ' iS a prime'
*/

-- sinh hoat tien dien
declare @kwh int = 100, @price float = 0.0  -- 100

if (@kwh between 0 and 50) set @price = @kwh * 1.678
else if (@kwh <= 100)  set @price =  @kwh * 1.678 + (@kwh - 50)*1.734
else if (@kwh <= 200)  set @price = @kwh * 1.678 + (@kwh - 50)*1.734 + (@kwh-100) *2.014 
else if (@kwh <= 300)  set @price = @kwh * 1.678 + (@kwh - 50)*1.734 + (@kwh-100) *2.014  + (@kwh-200) *2.536
else if (@kwh <= 400)  set @price = @kwh * 1.678 + (@kwh - 50)*1.734 + (@kwh-100) *2.014  + (@kwh-200) *2.536 + (@kwh -300) *2.834
else if (@kwh >= 401)  set @price = @kwh * 1.678 + (@kwh - 50)*1.734 + (@kwh-100) *2.014  + (@kwh-200) *2.536 + (@kwh -300) *2.834 + (@kwh-400) *2.927
print 'price' + str(@price)







