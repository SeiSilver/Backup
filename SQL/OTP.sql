select HangSX, DonGia from XE

where Socho = 4
order by HangSX, DonGia;

select * from HOPDONG

select HoTen, DienThoai from Khach inner join HopDong on Khach.CMND = HOPDONG.CMND
where SoHD = 'HD001';

select * from HOPDONG
select HoTen,DienThoai,HangSX, Socho, DonGia, ThoiGianThue,NgayKy,GiaTriHD from 
(HopDong inner join Xe on HOPDONG.BienSo = Xe.BienSo)
inner Join Khach on HopDong.CMND = Khach.CMND
where Month(NgayKy)>9 and Year(NgayKy) = 2018
