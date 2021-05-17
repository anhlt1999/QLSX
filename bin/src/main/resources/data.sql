

INSERT INTO `pthttt`.`nhanvien` (`dia_chi`, `email`, `luong`, `phone`, `ten`, `vaitro`) VALUES ('a', 'a', '10', '10', 'a', 'khau');
INSERT INTO `pthttt`.`nhanvien` (`dia_chi`, `email`, `luong`, `phone`, `ten`, `vaitro`) VALUES ('b', 'b', '20', '20', 'b', 'may');

INSERT INTO `pthttt`.`bo_phan` (`ten`, `nhanviens_id`) VALUES ('a', '1');
INSERT INTO `pthttt`.`bo_phan` (`ten`, `nhanviens_id`) VALUES ('b', '2');

INSERT INTO `pthttt`.`quy_trinh` (`maymoc`, `ten`, `bophans_id`) VALUES ('may\' khau', 'khau', '1');
INSERT INTO `pthttt`.`quy_trinh` (`maymoc`, `ten`, `bophans_id`) VALUES ('may\' may', 'may', '2');

INSERT INTO `pthttt`.`ban_thanh_pham` (`mota`, `ngaybd`, `soluong`, `quytrinhs_id`, `name`) VALUES ('a', '11-05-2021', '3', '1','ao the thao');
INSERT INTO `pthttt`.`ban_thanh_pham` (`mota`, `ngaybd`, `soluong`, `quytrinhs_id`, `name`) VALUES ('b', '11-05-2021', '5', '2','quan');
INSERT INTO `pthttt`.`ban_thanh_pham` (`mota`, `ngaybd`, `soluong`, `quytrinhs_id`, `name`) VALUES ('c', '12-05-2021', '4', '1', 'ao somi');

INSERT INTO `pthttt`.`thanh_pham` (`ngaykt`, `soluong`) VALUES ('12-05-2021', '4');
INSERT INTO `pthttt`.`thanh_pham` (`gia`, `ngaykt`, `soluong`, `ten`) VALUES ('1000', '12-05-2021', '3', 'quan');

/*
select *from pthttt.ban_thanh_pham b, pthttt.quy_trinh q
where b.quytrinhs_id = q.id
and q.ten like 'may'
*/

