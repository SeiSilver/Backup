USE OTO
Select * from HOPDONG

 update HOPDONG
 set DatTruoc=GiaTriHD*case
 when ThoiGianThue>10 then 0.5
 when ThoiGianThue>=5 then 0.7
 else 0.85
 end
 -- compute conlai
 update HOPDONG
 set ConLai = GiaTriHD*1.1-DatTruoc
