

-- Weather Observation Station 3 

-- DISTINCT dùng để nhận giá trị khác nhau

SELECT DISTINCT CITY
FROM STATION
WHERE ID % 2 = 0

--  Weather Observation Station 4 
-- count xài để đếm số hàng trong nó chọn, có thể xài count

select
    count(CITY) - COUNT(DISTINCT CITY)
FROM STATION

-- Weather Observation Station 5

select CITY, LENGTH(CITY)
FROM STATION
ORDER BY LENGTH(CITY), CITY
LIMIT 1;

select CITY, LENGTH(CITY)
FROM STATION
ORDER BY LENGTH(CITY) desc, CITY
LIMIT 1;

-- Weather Observation Station 6
-- REGEXP dùng để tìm kí tự chứa 
-- bắt đầu '^Ng', kết thúc 'ng$', chứa 'ng', bắt đầu với 1 nguyên âm  ^'[aeiou]'
-- https://laptrinhvb.net/bai-viet/chuyen-de-csharp/---Csharp----Huong-dan--su-dung-Regular-Expression/9fc038a7df07b644.html

SELECT DISTINCT CITY
FROM STATION
WHERE CITY REGEXP '^[aeiou]';

SELECT DISTINCT CITY FROM STATION 
WHERE CITY REGEXP '[aeiou]$'
order by CITY 

-- // Weather Observation Station 8 as
-- // https://xuanthulab.net/bieu-thuc-chinh-quy-regexp.html (chuẩn)

    SELECT DISTINCT CITY FROM STATION 
    WHERE CITY REGEXP '^[aeiou].+[aeiou]$' -- * loop 0, + loop 1
    order by CITY 

-- Weather Observation Station 11
SELECT DISTINCT CITY FROM STATION 
WHERE CITY REGEXP '^[^aeiou]|[^aeiou]$'
order by CITY 

-- Higher Than 75 Marks

select Name FROM STUDENTS
WHERE Marks > 75
order by Right(name,3), ID

-- Asian Population

select SUM(CITY.POPULATION) FROM CITY, COUNTRY

WHERE CITY.COUNTRYCODE = COUNTRY.CODE AND COUNTRY.CONTINENT = 'Asia'

-- African Cities

select CITY.NAME FROM CITY, COUNTRY
WHERE CITY.COUNTRYCODE = COUNTRY.CODE AND COUNTRY.CONTINENT = 'Africa'

-- Average Population of Each Continent

SELECT COUNT(NAME) FROM CITY
WHERE POPULATION > 100000

-- The Blunder
-- Ceiling or ceil, floor, round
SELECT
    CEILING(AVG(Salary) - AVG(REPLACE(SALARY, '0', '')))
FROM EMPLOYEES;
