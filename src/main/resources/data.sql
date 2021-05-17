/*
#Khach hang
INSERT INTO `pthttt`.`khachhang` (`id`, `dia_chi`, `email`, `phone`, `ten`) VALUES ('1', 'Hà Nội', 'mi@gmail.com', '0978676543', 'Mi');
INSERT INTO `pthttt`.`khachhang` (`id`, `dia_chi`, `email`, `phone`, `ten`) VALUES ('2', 'Hải Dương', 'quoc@gmail.com', '0987891234', 'Quốc');
INSERT INTO `pthttt`.`khachhang` (`id`, `dia_chi`, `email`, `phone`, `ten`) VALUES ('3', 'Đà Nẵng', 'ha@gmail.com', '0967876543', 'Hà');
INSERT INTO `pthttt`.`khachhang` (`id`, `dia_chi`, `email`, `phone`, `ten`) VALUES ('4', 'Sài Gòn', 'may@gmail.com', '0967654345', 'Mây');
INSERT INTO `pthttt`.`khachhang` (`id`, `dia_chi`, `email`, `phone`, `ten`) VALUES ('5', 'Hà Nội', 'duy@gmail.com', '0978654543', 'Duy');


#Don hang
INSERT INTO `pthttt`.`donhang` (`id`, `mota`, `soluong`, `khachhangs_id`) VALUES ('1', 'Áo Thun cộc', '100', '2');
INSERT INTO `pthttt`.`donhang` (`id`, `mota`, `soluong`, `khachhangs_id`) VALUES ('2', 'Bộ quần áo thể thao', '200', '4');
INSERT INTO `pthttt`.`donhang` (`id`, `mota`, `soluong`, `khachhangs_id`) VALUES ('3', 'Váy hoa mùa hè', '200', '5');
INSERT INTO `pthttt`.`donhang` (`id`, `mota`, `soluong`, `khachhangs_id`) VALUES ('4', 'Quần Jeans nữ', '200', '1');

#NVL
INSERT INTO `pthttt`.`nvl` (`gia`,`ngay_nhap`,`so_luong`,`ten`) VALUES ('3500','13-05-2021','50','Kéo cắt chỉ');
INSERT INTO `pthttt`.`nvl` (`gia`,`ngay_nhap`,`so_luong`,`ten`) VALUES ('1000','13-05-2021','100','Kim');
INSERT INTO `pthttt`.`nvl` (`gia`,`ngay_nhap`,`so_luong`,`ten`) VALUES ('20000','13-05-2021','300','Chỉ Cuộn 5000m');
INSERT INTO `pthttt`.`nvl` (`gia`,`ngay_nhap`,`so_luong`,`ten`) VALUES ('100','13-05-2021','2000','Nút áo');
INSERT INTO `pthttt`.`nvl` (`gia`,`ngay_nhap`,`so_luong`,`ten`) VALUES ('25000','13-05-2021','100','Vải lót 1m');
INSERT INTO `pthttt`.`nvl` (`gia`,`ngay_nhap`,`so_luong`,`ten`) VALUES ('50000','13-05-2021','200','Vải hoa 1m');
INSERT INTO `pthttt`.`nvl` (`gia`,`ngay_nhap`,`so_luong`,`ten`) VALUES ('50000','13-05-2021','200','Vải lanh');
INSERT INTO `pthttt`.`nvl` (`gia`,`ngay_nhap`,`so_luong`,`ten`) VALUES ('55000','13-05-2021','240','Vải Linen 1m');
INSERT INTO `pthttt`.`nvl` (`gia`,`ngay_nhap`,`so_luong`,`ten`) VALUES ('5000','13-05-2021','50','Thước dây');
INSERT INTO `pthttt`.`nvl` (`gia`,`ngay_nhap`,`so_luong`,`ten`) VALUES ('10000','13-05-2021','50','Dụng cụ tháo chỉ');
INSERT INTO `pthttt`.`nvl` ( `gia`, `ngay_nhap`, `so_luong`, `ten`) VALUES ('3500000', '14-01-2021', '30', 'Bàn là');
INSERT INTO `pthttt`.`nvl` ( `gia`, `ngay_nhap`, `so_luong`, `ten`) VALUES ('16000', '14-01-2021', '50', 'Thước kẻ');
INSERT INTO `pthttt`.`nvl` ( `gia`, `ngay_nhap`, `so_luong`, `ten`) VALUES ('5000', '14-01-2021', '1000', 'Khóa');
INSERT INTO `pthttt`.`nvl` ( `gia`, `ngay_nhap`, `so_luong`, `ten`) VALUES ('200', '14-01-2021', '2000', 'Cúc');
INSERT INTO `pthttt`.`nvl` ( `gia`, `ngay_nhap`, `so_luong`, `ten`) VALUES ('500', '14-01-2021', '2000', 'Tem, mác');
INSERT INTO `pthttt`.`nvl` ( `gia`, `ngay_nhap`, `so_luong`, `ten`) VALUES ('100', '14-01-2021', '3000', 'Túi đựng');
INSERT INTO `pthttt`.`nvl` ( `gia`, `ngay_nhap`, `so_luong`, `ten`) VALUES ('10000', '14-01-2021', '100', 'Thùng đựng');
INSERT INTO `pthttt`.`nvl` ( `gia`, `ngay_nhap`, `so_luong`, `ten`) VALUES ('1000', '14-01-2021', '100', 'Chun');
INSERT INTO `pthttt`.`nvl` ( `gia`, `ngay_nhap`, `so_luong`, `ten`) VALUES ('20000', '14-01-2021', '50', 'Kéo cắt vải');
INSERT INTO `pthttt`.`nvl` ( `gia`, `ngay_nhap`, `so_luong`, `ten`) VALUES ('70000', '14-01-2021', '100', 'Vải Bò');
INSERT INTO `pthttt`.`nvl` ( `gia`, `ngay_nhap`, `so_luong`, `ten`) VALUES ('55000', '14-01-2021', '300', 'Vải Thun');

#Nha cung cap
INSERT INTO `pthttt`.`nha_cung_cap` (`id`, `diachi`, `name`, `phone`) VALUES ('1','Thanh Trì','Công Ty TNHH Sản Xuất Thương Mại Và Dịch Vụ VAQ','0981298998');
INSERT INTO `pthttt`.`nha_cung_cap` (`id`, `diachi`, `name`, `phone`) VALUES ('2','Thanh Trì','Công Ty TNHH Thương Mại Hà Thanh Bắc','0979923179');
INSERT INTO `pthttt`.`nha_cung_cap` (`id`, `diachi`, `name`, `phone`) VALUES ('3','Nam Định','Công Ty TNHH Hai Thành Viên Đằng Đạt','0845 134 026');
INSERT INTO `pthttt`.`nha_cung_cap` (`id`, `diachi`, `name`, `phone`) VALUES ('4','Bắc Ninh','Công Ty TNHH Phú Quý BN','0936711828');
INSERT INTO `pthttt`.`nha_cung_cap` (`id`, `diachi`, `name`, `phone`) VALUES ('5', 'Hà Đông', 'Công Ty TNHH Việt Hùng', '0981933298');

#Nhan vien
INSERT INTO `pthttt`.`nhanvien` ( `dia_chi`, `email`, `luong`, `phone`, `ten`, `vaitro` ) VALUES ('Hà Nội', 'hien@gmail.com', '10000000', '0969599764', 'Nguyễn Văn Hiên', 'qtv');
INSERT INTO `pthttt`.`nhanvien` ( `dia_chi`, `email`, `luong`, `phone`, `ten`, `vaitro` ) VALUES ('Hà Nội', 'uyen@gmail.com', '20000000', '0927566432', 'Nguyễn Thị Tố Uyên', 'qldh');
INSERT INTO `pthttt`.`nhanvien` ( `dia_chi`, `email`, `luong`, `phone`, `ten`, `vaitro` ) VALUES ('Hà Nam', 'phat@gmail.com', '8000000', '0967543276', 'Bùi Minh Phát', 'qlk');
INSERT INTO `pthttt`.`nhanvien` ( `dia_chi`, `email`, `luong`, `phone`, `ten`, `vaitro` ) VALUES ('Hòa Bình', 'minh@gmail.com', '12000000', '0978654387', 'Nguyễn Thị Minh', 'qlsx');
INSERT INTO `pthttt`.`nhanvien` ( `dia_chi`, `email`, `luong`, `phone`, `ten`, `vaitro` ) VALUES ('Bắc Ninh', 'lan@gmail.com', '10500000', '0978767654', 'Nguyễn Phương Lan', 'nvtk');
INSERT INTO `pthttt`.`nhanvien` ( `dia_chi`, `email`, `luong`, `phone`, `ten`, `vaitro`) VALUES ('Bắc Giang', 'myy@gmail.com', '10500000', '0978767654', 'Đoàn Thị My', 'nvtk');
INSERT INTO `pthttt`.`nhanvien` ( `dia_chi`, `email`, `luong`, `phone`, `ten`, `vaitro` ) VALUES ('Vĩnh Phúc', 'mai@gmail.com', '10500000', '0978767654', 'Vũ Thu Mai', 'nvtk');
INSERT INTO `pthttt`.`nhanvien` ( `dia_chi`, `email`, `luong`, `phone`, `ten`, `vaitro` ) VALUES ('Hòa Bình', 'minh@gmail.com', '7000000', '0978767654', 'Bùi Tuấn Minh', 'cn' );
INSERT INTO `pthttt`.`nhanvien` ( `dia_chi`, `email`, `luong`, `phone`, `ten`, `vaitro`) VALUES ('Hà Nam', 'minh@gmail.com', '7000000', '0978767654', 'Lưu Thị Giang', 'cn');
INSERT INTO `pthttt`.`nhanvien` ( `dia_chi`, `email`, `luong`, `phone`, `ten`, `vaitro` ) VALUES ('Vĩnh Phúc', 'minh@gmail.com', '7000000', '0978767654', 'Bùi Tuấn Anh', 'cn');
INSERT INTO `pthttt`.`nhanvien` ( `dia_chi`, `email`, `luong`, `phone`, `ten`, `vaitro`) VALUES ('Vĩnh Phúc', 'minh@gmail.com', '7000000', '0978767654', 'Đặng Thị Quỳnh', 'cn');
INSERT INTO `pthttt`.`nhanvien` ( `dia_chi`, `email`, `luong`, `phone`, `ten`, `vaitro` ) VALUES ('Hải Dương', 'minh@gmail.com', '7000000', '0978767654', 'Bùi Minh Quân', 'cn');
INSERT INTO `pthttt`.`nhanvien` ( `dia_chi`, `email`, `luong`, `phone`, `ten`, `vaitro` ) VALUES ('Hải Dương', 'minh@gmail.com', '7000000', '0978767654', 'Nguyễn Thị Hà', 'cn');

#Tai khoan
INSERT INTO `pthttt`.`tai_khoan` (`id`, `password`, `username`, `nhanviens_id`) VALUES ('1', '1234', 'qtv', '1');
INSERT INTO `pthttt`.`tai_khoan` (`id`, `password`, `username`, `nhanviens_id`) VALUES ('2', '1234', 'qldh', '2');
INSERT INTO `pthttt`.`tai_khoan` (`id`, `password`, `username`, `nhanviens_id`) VALUES ('3', '1234', 'qlk', '3');
INSERT INTO `pthttt`.`tai_khoan` (`id`, `password`, `username`, `nhanviens_id`) VALUES ('4', '1234', 'qlsx', '4');
INSERT INTO `pthttt`.`tai_khoan` (`id`, `password`, `username`, `nhanviens_id`) VALUES ('5', '1234', 'nvtk', '5');

#Bo phan
INSERT INTO `pthttt`.`bo_phan` (`nhanviens_id`, `ten`) VALUES ('1', 'Bộ phận quản lý');
INSERT INTO `pthttt`.`bo_phan` (`nhanviens_id`, `ten`) VALUES ('5', 'Bộ phận thiết kế');
INSERT INTO `pthttt`.`bo_phan` (`nhanviens_id`, `ten`) VALUES ('8', 'Bộ phận cắt');
INSERT INTO `pthttt`.`bo_phan` (`nhanviens_id`, `ten`) VALUES ('9', 'Bộ phận chuyền may');
INSERT INTO `pthttt`.`bo_phan` (`nhanviens_id`, `ten`) VALUES ('10', 'Bộ phận kiểm hàng');
INSERT INTO `pthttt`.`bo_phan` (`nhanviens_id`, `ten`) VALUES ('11', 'Bộ phận hoàn thiện');
INSERT INTO `pthttt`.`bo_phan` (`nhanviens_id`, `ten`) VALUES ('12', 'Bộ phận kho');
INSERT INTO `pthttt`.`bo_phan` (`nhanviens_id`, `ten`) VALUES ('13', 'Bộ phận kế hoạch');


#Quy trinh
INSERT INTO `pthttt`.`quy_trinh` (`maymoc`, `ten`, `bophans_id`) VALUES ('Máy cắt,...', 'Sản xuất cắt, đánh số đồng bộ', '3');
INSERT INTO `pthttt`.`quy_trinh` (`maymoc`, `ten`, `bophans_id`) VALUES ('Máy may, Bàn là, Máy vắt sổ, Máy thêu,...', 'May theo bó', '4');
INSERT INTO `pthttt`.`quy_trinh` (`maymoc`, `ten`, `bophans_id`) VALUES  ('Máy kiểm vải,...', 'Kiểm tra chất lượng sản phẩm', '5');
INSERT INTO `pthttt`.`quy_trinh` (`maymoc`, `ten`, `bophans_id`) VALUES ('Máy dập cúc, máy đóng khuy,...', 'Đóng khuy', '6');
INSERT INTO `pthttt`.`quy_trinh` (`maymoc`, `ten`, `bophans_id`) VALUES ('Máy kiểm kim,...', 'Kiểm kim', '5');
INSERT INTO `pthttt`.`quy_trinh` (`maymoc`, `ten`, `bophans_id`) VALUES ('Máy đóng gói,...', 'Đóng gói, hoàn thiện', '6');
INSERT INTO `pthttt`.`quy_trinh` (`maymoc`, `ten`, `bophans_id`) VALUES ('Không có', 'Hoàn thành', '6');


#Ban thanh pham
INSERT INTO `pthttt`.`ban_thanh_pham` (`mota`, `name`, `ngaybd`, `soluong`, `quytrinhs_id`) VALUES ('Đang thực hiện', 'Quần áo đá bóng', '16-01-2021', '20', '1');
INSERT INTO `pthttt`.`ban_thanh_pham` (`mota`, `name`, `ngaybd`, `soluong`, `quytrinhs_id`) VALUES ('Đang thực hiện', 'Váy hoa mùa hè', '15-01-2021', '50', '1');
INSERT INTO `pthttt`.`ban_thanh_pham` ( `mota`, `name`, `ngaybd`, `soluong`, `quytrinhs_id`) VALUES ('Đang thực hiện', 'Áo thun cộc', '15-01-2021', '20', '1');
INSERT INTO `pthttt`.`ban_thanh_pham` (`mota`, `name`, `ngaybd`, `soluong`, `quytrinhs_id`) VALUES ('Đang thực hiện', 'Quần Jeans', '15-01-2021', '60', '1');
INSERT INTO `pthttt`.`ban_thanh_pham` (`mota`, `name`, `ngaybd`, `soluong`, `quytrinhs_id`) VALUES ('Đang thực hiện', 'Bộ quần áo đá bóng', '27-01-2021', '50', '2');
INSERT INTO `pthttt`.`ban_thanh_pham` (`mota`, `name`, `ngaybd`, `soluong`, `quytrinhs_id`) VALUES ('Đang thực hiện', 'Váy hoa mùa hè', '27-01-2021', '70', '2');
INSERT INTO `pthttt`.`ban_thanh_pham` (`mota`, `name`, `ngaybd`, `soluong`, `quytrinhs_id`) VALUES ('Đang thực hiện', 'Áo thun cộc', '27-01-2021', '30', '2');
INSERT INTO `pthttt`.`ban_thanh_pham` (`mota`, `name`, `ngaybd`, `soluong`, `quytrinhs_id`) VALUES ('Đang thực hiện', 'Quần Jeans', '30-01-2021', '30', '2');
INSERT INTO `pthttt`.`ban_thanh_pham` (`mota`, `name`, `ngaybd`, `soluong`, `quytrinhs_id`) VALUES ('Đang thực hiện', 'Quần Jeans', '15-03-2021', '30', '3');
INSERT INTO `pthttt`.`ban_thanh_pham` (`mota`, `name`, `ngaybd`, `soluong`, `quytrinhs_id`) VALUES ('Đang thực hiện', 'Váy hoa mùa hè', '15-03-2021', '40', '3');
INSERT INTO `pthttt`.`ban_thanh_pham` (`mota`, `name`, `ngaybd`, `soluong`, `quytrinhs_id`) VALUES ('Đang thực hiện', 'Quần Jeans', '01-04-2021', '30', '4');
INSERT INTO `pthttt`.`ban_thanh_pham` (`mota`, `name`, `ngaybd`, `soluong`, `quytrinhs_id`) VALUES ('Đang thực hiện', 'Áo thun cộc', '07-04-2021', '10', '5');
INSERT INTO `pthttt`.`ban_thanh_pham` (`mota`, `name`, `ngaybd`, `soluong`, `quytrinhs_id`) VALUES ('Đang thực hiện', 'Bộ quần áo đá bóng', '10-04-2021', '60', '5');
INSERT INTO `pthttt`.`ban_thanh_pham` (`mota`, `name`, `ngaybd`, `soluong`, `quytrinhs_id`) VALUES ('Đang thực hiện', 'Áo thun cộc ', '20-04-2021', '20', '6');
INSERT INTO `pthttt`.`ban_thanh_pham` (`mota`, `name`, `ngaybd`, `soluong`, `quytrinhs_id`) VALUES ('Đang thực hiện', 'Bộ quần áo', '29-04-2021', '40', '6');
INSERT INTO `pthttt`.`ban_thanh_pham` (`mota`, `name`, `ngaybd`, `soluong`, `quytrinhs_id`) VALUES ('Đang thực hiện', 'Quần Jeans', '03-05-2021', '50', '6');


#Thanh pham
INSERT INTO `pthttt`.`thanh_pham` (`gia`, `ngaykt`, `soluong`, `ten`) VALUES ('1000', '12-05-2021', '3', 'quan');
INSERT INTO `pthttt`.`thanh_pham` (`gia`, `ngaykt`, `soluong`, `ten`) VALUES ('70000', '14-05-2021', '20', 'Áo thun cộc');
INSERT INTO `pthttt`.`thanh_pham` (`gia`,`ngaykt`,`soluong`,`ten`) VALUES ('75000','13-05-2021','30','Bộ quần áo thể thao');
INSERT INTO `pthttt`.`thanh_pham` (`gia`, `ngaykt`, `soluong`, `ten`) VALUES ('135000', '13-05-2021', '40', 'Váy hoa mùa hè');


#Hoa Don Nhap
INSERT INTO `pthttt`.`hoa_don_nhap` (`donvi`, `ngay_nhap`, `so_luong`, `tongtien`, `nhacungcaps_id`, `nvls_id`, `trang_thai`) VALUES ('Cái', '13-01-2021', '50', '175000', '2', '1', 'confirm');
INSERT INTO `pthttt`.`hoa_don_nhap` (`donvi`, `ngay_nhap`, `so_luong`, `tongtien`, `nhacungcaps_id`, `nvls_id`, `trang_thai`) VALUES ('Cái', '13-01-2021', '100', '100000', '2', '2', 'confirm');
INSERT INTO `pthttt`.`hoa_don_nhap` (`donvi`, `ngay_nhap`, `so_luong`, `tongtien`, `nhacungcaps_id`, `nvls_id`, `trang_thai`) VALUES ('Cuộn', '13-01-2021', '300', '6000000', '5', '3', 'confirm');
INSERT INTO `pthttt`.`hoa_don_nhap` (`donvi`, `ngay_nhap`, `so_luong`, `tongtien`, `nhacungcaps_id`, `nvls_id`, `trang_thai`) VALUES ('Cái', '13-01-2021', '2000', '200000', '5', '4', 'confirm');
INSERT INTO `pthttt`.`hoa_don_nhap` (`donvi`, `ngay_nhap`, `so_luong`, `tongtien`, `nhacungcaps_id`, `nvls_id`, `trang_thai`) VALUES ('Cuộn', '13-01-2021', '100', '2500000', '3', '5', 'confirm');
INSERT INTO `pthttt`.`hoa_don_nhap` (`donvi`, `ngay_nhap`, `so_luong`, `tongtien`, `nhacungcaps_id`, `nvls_id`, `trang_thai`) VALUES ('Cuộn', '13-01-2021', '200', '5000000', '3', '6', 'confirm');
INSERT INTO `pthttt`.`hoa_don_nhap` (`donvi`, `ngay_nhap`, `so_luong`, `tongtien`, `nhacungcaps_id`, `nvls_id`, `trang_thai`) VALUES ('Cuộn', '13-01-2021', '200', '5900000', '3', '7', 'confirm');
INSERT INTO `pthttt`.`hoa_don_nhap` (`donvi`, `ngay_nhap`, `so_luong`, `tongtien`, `nhacungcaps_id`, `nvls_id`, `trang_thai`) VALUES ('Cuộn', '13-01-2021', '240', '5500000', '3', '8', 'confirm');
INSERT INTO `pthttt`.`hoa_don_nhap` (`donvi`, `ngay_nhap`, `so_luong`, `tongtien`, `nhacungcaps_id`, `nvls_id`, `trang_thai`) VALUES ('Cái', '13-01-2021', '50', '250000', '1', '9', 'confirm');
INSERT INTO `pthttt`.`hoa_don_nhap` (`donvi`, `ngay_nhap`, `so_luong`, `tongtien`, `nhacungcaps_id`, `nvls_id`, `trang_thai`) VALUES ('Cái', '13-01-2021', '50', '500000', '1', '10', 'confirm');
INSERT INTO `pthttt`.`hoa_don_nhap` (`donvi`, `ngay_nhap`, `so_luong`, `tongtien`, `nhacungcaps_id`, `nvls_id`, `trang_thai`) VALUES ('Cái','14-01-2021', '30', '105000000', '1', '11', 'confirm');
INSERT INTO `pthttt`.`hoa_don_nhap` (`donvi`, `ngay_nhap`, `so_luong`, `tongtien`, `nhacungcaps_id`, `nvls_id`, `trang_thai`) VALUES ('Cái', '14-01-2021', '50', '800000', '4', '12', 'confirm');
INSERT INTO `pthttt`.`hoa_don_nhap` (`donvi`, `ngay_nhap`, `so_luong`, `tongtien`, `nhacungcaps_id`, `nvls_id`, `trang_thai`) VALUES ('Cái', '14-01-2021', '1000', '5000000', '4', '13', 'confirm');
INSERT INTO `pthttt`.`hoa_don_nhap` (`donvi`, `ngay_nhap`, `so_luong`, `tongtien`, `nhacungcaps_id`, `nvls_id`, `trang_thai`) VALUES ('Cái', '14-01-2021', '2000', '400000', '4', '14', 'confirm');
INSERT INTO `pthttt`.`hoa_don_nhap` (`donvi`, `ngay_nhap`, `so_luong`, `tongtien`, `nhacungcaps_id`, `nvls_id`, `trang_thai`) VALUES ('Cái', '14-01-2021', '2000', '1000000', '4', '15', 'confirm');
INSERT INTO `pthttt`.`hoa_don_nhap` (`donvi`, `ngay_nhap`, `so_luong`, `tongtien`, `nhacungcaps_id`, `nvls_id`, `trang_thai`) VALUES ('Cái', '14-01-2021', '3000', '300000', '4', '16', 'confirm');
INSERT INTO `pthttt`.`hoa_don_nhap` (`donvi`, `ngay_nhap`, `so_luong`, `tongtien`, `nhacungcaps_id`, `nvls_id`, `trang_thai`) VALUES ('Cái', '14-01-2021', '100', '1000000', '4', '17', 'confirm');
INSERT INTO `pthttt`.`hoa_don_nhap` (`donvi`, `ngay_nhap`, `so_luong`, `tongtien`, `nhacungcaps_id`, `nvls_id`, `trang_thai`) VALUES ('Cái', '14-01-2021', '100', '100000', '4', '18', 'confirm');
INSERT INTO `pthttt`.`hoa_don_nhap` (`donvi`, `ngay_nhap`, `so_luong`, `tongtien`, `nhacungcaps_id`, `nvls_id`, `trang_thai`) VALUES ('Cái', '14-01-2021', '50', '1000000', '4', '19', 'confirm');
INSERT INTO `pthttt`.`hoa_don_nhap` (`donvi`, `ngay_nhap`, `so_luong`, `tongtien`, `nhacungcaps_id`, `nvls_id`, `trang_thai`) VALUES ('Cuộn', '14-01-2021', '100', '70000000', '3', '20', 'confirm');
INSERT INTO `pthttt`.`hoa_don_nhap` (`donvi`, `ngay_nhap`, `so_luong`, `tongtien`, `nhacungcaps_id`, `nvls_id`, `trang_thai`) VALUES ('Cuộn', '14-01-2021', '300', '16500000', '3', '21', 'confirm');
    

#Hoa Don Xuat
INSERT INTO `pthttt`.`hoa_don_xuat` (`id`, `donvi`, `ngay_xuat`, `so_luong`, `tongtien`, `bophans_id`, `nvls_id`, `trang_thai`) VALUES ('1', 'Cái', '15-01-2021', '30', '105000', '3', '1', 'confirm');
INSERT INTO `pthttt`.`hoa_don_xuat` (`id`, `donvi`, `ngay_xuat`, `so_luong`, `tongtien`, `bophans_id`, `nvls_id`, `trang_thai`) VALUES ('2', 'Cái', '15-01-2021', '30', '3000', '4', '2', 'confirm');
INSERT INTO `pthttt`.`hoa_don_xuat` (`id`, `donvi`, `ngay_xuat`, `so_luong`, `tongtien`, `bophans_id`, `nvls_id`, `trang_thai`) VALUES ('3', 'Cuộn', '15-01-2021', '150', '3000000', '3', '3', 'confirm');
INSERT INTO `pthttt`.`hoa_don_xuat` (`id`, `donvi`, `ngay_xuat`, `so_luong`, `tongtien`, `bophans_id`, `nvls_id`, `trang_thai`) VALUES ('4', 'Cuộn', '15-01-2021', '30', '750000', '3', '5', 'confirm');
INSERT INTO `pthttt`.`hoa_don_xuat` (`id`, `donvi`, `ngay_xuat`, `so_luong`, `tongtien`, `bophans_id`, `nvls_id`, `trang_thai`) VALUES ('5', 'Cuộn', '15-01-2021', '50', '2500000', '3', '6', 'confirm');
INSERT INTO `pthttt`.`hoa_don_xuat` (`id`, `donvi`, `ngay_xuat`, `so_luong`, `tongtien`, `bophans_id`, `nvls_id`, `trang_thai`) VALUES ('6', 'Cuộn', '15-01-2021', '100', '5000000', '3', '7', 'confirm');
INSERT INTO `pthttt`.`hoa_don_xuat` (`id`, `donvi`, `ngay_xuat`, `so_luong`, `tongtien`, `bophans_id`, `nvls_id`, `trang_thai`) VALUES ('7', 'Cuộn', '15-01-2021', '100', '5500000', '3', '21', 'confirm');
INSERT INTO `pthttt`.`hoa_don_xuat` (`id`, `donvi`, `ngay_xuat`, `so_luong`, `tongtien`, `bophans_id`, `nvls_id`, `trang_thai`) VALUES ('15', 'Cái', '16-01-2021', '30', '150000', '4', '9', 'confirm');
INSERT INTO `pthttt`.`hoa_don_xuat` (`id`, `donvi`, `ngay_xuat`, `so_luong`, `tongtien`, `bophans_id`, `nvls_id`, `trang_thai`) VALUES ('16', 'Cái ', '16-01-2021', '5', '25000', '2', '9', 'confirm');
INSERT INTO `pthttt`.`hoa_don_xuat` (`id`, `donvi`, `ngay_xuat`, `so_luong`, `tongtien`, `bophans_id`, `nvls_id`, `trang_thai`) VALUES ('17', 'Cái', '16-01-2021', '10', '50000', '3', '9', 'confirm');
INSERT INTO `pthttt`.`hoa_don_xuat` (`id`, `donvi`, `ngay_xuat`, `so_luong`, `tongtien`, `bophans_id`, `nvls_id`, `trang_thai`) VALUES ('11', 'Cái', '20-01-2021', '200', '1000000', '4', '13', 'confirm');
INSERT INTO `pthttt`.`hoa_don_xuat` (`id`, `donvi`, `ngay_xuat`, `so_luong`, `tongtien`, `bophans_id`, `nvls_id`, `trang_thai`) VALUES ('12', 'Cái', '20-01-2021', '200', '40000', '4', '14', 'confirm');
INSERT INTO `pthttt`.`hoa_don_xuat` (`id`, `donvi`, `ngay_xuat`, `so_luong`, `tongtien`, `bophans_id`, `nvls_id`, `trang_thai`) VALUES ('13', 'Cái', '01-03-2021', '500', '250000', '6', '15', 'confirm');
INSERT INTO `pthttt`.`hoa_don_xuat` (`id`, `donvi`, `ngay_xuat`, `so_luong`, `tongtien`, `bophans_id`, `nvls_id`, `trang_thai`) VALUES ('14', 'Cái', '01-03-2021', '700', '700000', '6', '16', 'confirm');
INSERT INTO `pthttt`.`hoa_don_xuat` (`id`, `donvi`, `ngay_xuat`, `so_luong`, `tongtien`, `bophans_id`, `nvls_id`, `trang_thai`) VALUES ('10', 'Cái', '15-01-2021', '40', '400000', '3', '17', 'confirm');
INSERT INTO `pthttt`.`hoa_don_xuat` (`id`, `donvi`, `ngay_xuat`, `so_luong`, `tongtien`, `bophans_id`, `nvls_id`, `trang_thai`) VALUES ('9', 'Cái', '15-01-2021', '30', '600000', '3', '19', 'confirm');
INSERT INTO `pthttt`.`hoa_don_xuat` (`id`, `donvi`, `ngay_xuat`, `so_luong`, `tongtien`, `bophans_id`, `nvls_id`, `trang_thai`) VALUES ('8', 'Cuộn', '15-01-2021', '100', '7000000', '3', '20', 'confirm');

#bao_cao_ton_kho
INSERT INTO `pthttt`.`bao_cao_ton_kho` (`soluong_nhap`, `soluong_xuat`, `tong_hang_ton`, `nhanviens_id`, `nvls_id`) VALUES ('100', '30', '70', '3', '5');
INSERT INTO `pthttt`.`bao_cao_ton_kho` (`soluong_nhap`, `soluong_xuat`, `tong_hang_ton`, `nhanviens_id`, `nvls_id`) VALUES ('200', '50', '150', '3', '6');
INSERT INTO `pthttt`.`bao_cao_ton_kho` (`soluong_nhap`, `soluong_xuat`, `tong_hang_ton`, `nhanviens_id`, `nvls_id`) VALUES ('200', '100', '100', '3', '7');
INSERT INTO `pthttt`.`bao_cao_ton_kho` (`soluong_nhap`, `soluong_xuat`, `tong_hang_ton`, `nhanviens_id`, `nvls_id`) VALUES ('240', '0', '240', '3', '8');
INSERT INTO `pthttt`.`bao_cao_ton_kho` (`soluong_nhap`, `soluong_xuat`, `tong_hang_ton`, `nhanviens_id`, `nvls_id`) VALUES ('100', '100', '0', '3', '20');
INSERT INTO `pthttt`.`bao_cao_ton_kho` (`soluong_nhap`, `soluong_xuat`, `tong_hang_ton`, `nhanviens_id`, `nvls_id`) VALUES ('300', '100', '200', '3', '21');

#bao_cao_thanh_pham
INSERT INTO `pthttt`.`bao_cao_thanh_pham` (`danhgia`, `nhanviens_id`, `thanhphams_id`) VALUES ('Tốt', 3, '1');
INSERT INTO `pthttt`.`bao_cao_thanh_pham` (`danhgia`, `nhanviens_id`, `thanhphams_id`) VALUES ('Tốt', 3, '2');
INSERT INTO `pthttt`.`bao_cao_thanh_pham` (`danhgia`, `nhanviens_id`, `thanhphams_id`) VALUES ('Tốt', 3, '3');

/*
select *from pthttt.ban_thanh_pham b, pthttt.quy_trinh q
where b.quytrinhs_id = q.id
and q.ten like 'may'
*/


