use JOB_DB

select CAST('' as nvarchar(50)) as ename, skill, CAST('' as nvarchar(50)) as salary,
CAST(sum(salary) as nvarchar(50)) as total, CAST(count(*) as nvarchar(50)) as Quantity
from EMPS
group by SKILL
union all 
select CAST(ename as nvarchar(50)) as ename, skill, CAST(salary as nvarchar(50)) as salary, 
CAST('' as nvarchar(50)) as total, CAST('' as nvarchar(50)) as Quantity
from EMPS
order by SKILL, ename



select * from EMPS


--union all

--select ename, skill, CAST(salary as nvarchar(50)) as salary,
--CAST(sum(salary) as nvarchar(50)) as Tong, CAST('' as nvarchar(50)) as SL
--from EMPS
--order by SKILL,ENAME



select * from EMPS

select Ename, skill, salary, sum(salary) as Total, count(*) as quantity from EMPS

group by SKILL, SALARY, ENAME