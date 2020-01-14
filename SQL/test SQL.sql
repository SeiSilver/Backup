use TrainingDB

select * from COURSES
select * from ENROLLMENTS
select * from STUDENTS

-- cau 1
select * from ENROLLMENTS
where Sno = 'S001'

-- cau 2
select DISTINCT Cno, GradeABCDF, count(*) as NumberOfStudent from ENROLLMENTS
group by Cno, GradeABCDF
order by Cno, GradeABCDF

-- cau 3
select * from ENROLLMENTS
where Cno = 'BP' and Semeter = 1 and School_Year = '2019-2020' 
and Mark10 = 9 and GradeABCDF = 'A' and GradeCredit = 4

-- cau 4
select Sno, GradeABCDF, count(*) as Grade_Count from ENROLLMENTS
group by Sno, GradeABCDF
order by Sno, GradeABCDF

-- cau 5
select * from ENROLLMENTS
order by  Mark10 desc, GradeABCDF 

/* user function (UF) in sql
define a UF
create function UF_name(Parameters) returns
as
begin
sql statements
return result
end
*/
create function sum_n(@n int) returns int
as 
begin
declare @res int = 0, @i int = 1
while(@i <= @n)
begin 
set @res +=@i
set @i+=1
end
return @res
end
-- drop function sum_n
select dbo.sum_n(5) as result
-------------------------------------------------------

Create function Prime_Check(@input int) Returns bit
as
begin
	declare @i int =2, @stt bit=1


while (@i<=sqrt(@input) )
	begin
		
		if (@input % @i =0) 
			begin
				set @stt=0
				break
			end
		set @i+=1
	end
	return @stt
end

drop function Prime_Check


begin
	Declare @i int, @stt int
	set @i=2
	while (@i<100)
	begin
		if (dbo.Prime_Check(@i) = 1 ) print(str(@i))
		set @i+=1;
	end
end
------------------------------------------------------------

-- cau 5 
Create function transGrade(@mark10 float) returns char
as
begin
	if @mark10 between 8.5 and 10 return 'A'
	else if @mark10 between 7 and 8.4 return 'B'
	else if @mark10 between 5.5 and 6.9 return 'C'
	else if @mark10 between 4 and 5.4 return 'D'
	return 'F'
end
----------------------------------------------------------
Create function transCredit(@mark10 float) returns int
as
begin
	if @mark10 between 8.5 and 10 return 4
	else if @mark10 between 7 and 8.4 return 3
	else if @mark10 between 5.5 and 6.9 return 2
	else if @mark10 between 4 and 5.4 return 1
	return 0
end

drop function transCredit
drop function transGrade
-- cau 6
select * from ENROLLMENTS
select * from STUDENTS
insert into STUDENTS (Sno,Sname,Class,Gender)
values ('DE1403','Dat','SE1403',1)
DELETE from STUDENTS where Sno = 'DE1403'


insert into ENROLLMENTS (Sno,Cno,EnrollTime,Semeter,School_Year,Mark10,GradeABCDF,GradeCredit)
values ('DE1403','DB',getDate(),1,'2019-2000',5,dbo.transGrade(5),dbo.transCredit(5))
select * from ENROLLMENTS
DELETE from ENROLLMENTS where Sno = 'DE1403'
----------------------------------------------------------
-- Cau 6
select * from ENROLLMENTS
select * from STUDENTS

create procedure Add_Enrollment(@Sno char(10), @Cno char(10), @Semeter int, @SchoolYear nchar(10), @mark float)
as 
begin
   if not exists( select * from STUDENTS where Sno = @Sno) print 'Stundeny does not exist!'
   else if not exists (select * from COURSES where Cno = @Cno) print 'Course does not exist!'
   if exists (select * from ENROLLMENTS where Sno = @Sno and Cno = @Cno) print 'This stundent aready enroll to this course!'
   else 
      begin
         insert into ENROLLMENTS (Sno,Cno,EnrollTime,Semeter,School_Year,Mark10,GradeABCDF,GradeCredit)
         values (@Sno,@Cno,getDate(),@Semeter,@SchoolYear,@mark,dbo.transGrade(@mark),dbo.transCredit(@mark))
		 print 'Add complete!'
      end
end

drop procedure Add_Enrollment

select * from ENROLLMENTS
select * from COURSES

Add_Enrollment 'S001', 'AL', 3, '2020-2022', 6

delete from ENROLLMENTS where Sno = 'S001' and Cno = 'AL'

----------------------------------------------------------
