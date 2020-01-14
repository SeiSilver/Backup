use OTO

select * from HOPDONG
select * from KHACH
select * from XE

/*1*/
select * from HOPDONG inner join XE on HOPDONG.Bienso= XE.Bienso
where HangSX='Toyota'
order by DonGia desc

/*2*/
select top 2 * from xe
where Socho=4
order by DonGia asc

/*3*/
select Socho, count(*) as Count_Socho from Xe
group by Socho

/*4*/
select HangSX, count(*) as count_xe from Xe
group by HangSX
having COUNT(*)>=3

/*5*/
select KHACH.* from KHACH inner join HOPDONG on KHACH.CMND = HOPDONG.CMND
where Month(NgayKy)>=9 and year(NgayKy)=2018

/*6*/
select Bienso, count(*) as Count_lanthue, sum(ThoiGianThue) as Sum_thoigian from HOPDONG
where  year(NgayKy)=2018
group by Bienso

/*7*/
select * from HOPDONG inner join XE on HOPDONG.Bienso = XE.Bienso
where (MONTH(NgayKy)=10 and year(NgayKy)=2018)
order by GiaTriHD desc