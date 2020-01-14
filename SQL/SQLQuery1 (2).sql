Use JOB_DB

Select *
from EMPS
group by SKILL 

Select ENAME
from EMPS

Select SKILL, count(*) as SKILL_COUNT
from EMPS
group by SKILL 


Select * from EMPS inner join JOBS on EMPS.SKILL= JOBS.Skill

select * from JOBS inner join EMPS on EMPS.SKILL= JOBS.Skill