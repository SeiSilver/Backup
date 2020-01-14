select distinct skill from emps

select top 3 *  from EMPS
where age > 20
order by SALARY desc

select skill, COUNT(*) as Skill_count
from EMPS
group by SKILL

select skill, COUNT(*) as Skill_count,
sum(salary) as sum_sal, max(salary) as max_sal,
min(salary) as min_sal, AVG(salary) as avg_sal
from EMPS
group by SKILL

select skill, COUNT(*) as Skill_count,
sum(salary) as sum_sal, max(salary) as max_sal,
min(salary) as min_sal, AVG(salary) as avg_sal
from EMPS
group by SKILL
having COUNT(*)>2

select skill, COUNT(*) as Skill_count
from EMPS
group by SKILL
having COUNT(*)>2

select skill, COUNT(*) as Skill_count
from EMPS
group by SKILL
having COUNT(*)>2

 --join types in sql
 --cross join

select * from EMPS
select * from JOBS
select * from EMPS, JOBS

 --innner join

select * from EMPS inner join jobs
on EMPS.SKILL = jobs.Skill

select * from EMPS right join jobs
on EMPS.SKILL = jobs.Skill

select * from EMPS left join jobs
on EMPS.SKILL = jobs.Skill

 --display both right and left
select * from EMPS full join jobs
on EMPS.SKILL = jobs.Skill
