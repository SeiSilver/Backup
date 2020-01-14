use OTO
-- Q1
select * from XE
where HangSX = 'Toyota'
order by DonGia desc

-- Q2
select top 2* from xe
where socho = 4
order by dongia desc
select * from xe

-- Q3
select COUNT(*) as SoXe, Socho
from Xe
group by Socho
select * from xe

-- Q4
select HangSX, COUNT(HangSX) as SoXe from XE
group by HangSX
having COUNT(HangSX) >= 3
select * from xe

-- Q5
select khach.* from KHACH inner join HOPDONG 
on khach.CMND = HOPDONG.CMND 
where month(ngayky) >9 and year(NgayKy) = 2018
select * from khach
select * from HOPDONG

-- Q6
select xe.hangsx, count(Hopdong.Bienso) as SoLanThue, sum(ThoiGianThue) as sum from HOPDONG inner join XE
on HOPDONG.Bienso = xe.Bienso 
group by HangSX

-- Q7


