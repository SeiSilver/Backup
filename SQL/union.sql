use JOB_DB

select * from EMPS
where SKILL in (select skill from JOBS where JobNo = 1)

select * from EMPS
where SKILL in ('SQL','Java','c#')

select * from EMPS
where SALARY between 1200 and 1300

select * from EMPS
where DateOfBirth between '1980-03-01' and '1980-03-20' 

-- like (Pattern matching)

--%: set of characters
-- _: single chacracter 

select * from EMPS
where skill like 'C%'; 

select * from EMPS
where skill like 'C_'; 

select * from EMPS
where skill like 'C__'; 

Select * from EMPS where SALARY like '12__'

select * from EMPS
select SKILL, count(SKILL) as skill_count from EMPS
 group by SKILL
 union 
 select 'Number of Employees; ', COUNT(SKILL) as emps_count
 from EMPS
 order by COUNT(SKILL)


select * from EMPS
select * from EMPS 
where skill not in (select skill from EMPS group by skill having COUNT(*) = 1)

--cho biet thong tin cua tat ca nhan vien co y nhat ngay sinh(nam va thang) trung voi 1 nguoi khac

select * from EMPS
select * from EMPS as t1, EMPS as t2
--where year(DateOfBirth) = (select DateOfBirth from EMPS  ) and MONTH(DateOfBirth) = (select DateOfBirth from EMPS)
where day(t1.DateOfBirth) = day(t2.DateOfBirth) and month(t1.DateOfBirth) = month(t2.DateOfBirth)
and t1.ENO <> t2.ENO

--select * from EMPS
--select * from EMPS
--where month(DateOfBirth) = (select DateOfBirth from EMPS group by month(DateOfBirth) having count(*) >=1 ) 
--  and day(DateOfBirth) = (select DateOfBirth from EMPS group by day(DateOfBirth) having COUNT(*) >=1)

select * from EMPS
--select top 2* from EMPs
--update EMPS
--set SALARY = SALARY + SALARY*10/100
--where 
--order by SALARY 


select * from EMPS 
update EMPS
set emps.SALARY = T.SALARY*1.1

from (select top 2* from EMPS order by SALARY) as T

where EMPS.SALARY = t.SALARY