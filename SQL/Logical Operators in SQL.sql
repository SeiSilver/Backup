use JOB_DB

select * from EMPS
select * from JOBS

-- <> all the same not in
select * from EMPS
where skill <> all (select SKILL from JOBS)

select * from EMPS
where skill not in (select SKILL from JOBS)

-- any the same in
select * from EMPS
where skill =any (select SKILL from JOBS)

select * from EMPS
where skill in (select SKILL from JOBS)
