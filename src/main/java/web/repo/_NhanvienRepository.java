package web.repo;

import web.entity.Nhanvien;
import web.entity.TaiKhoan;

public interface _NhanvienRepository {
	public Long saveAndReturnId(Nhanvien nhanvien);
	public TaiKhoan save(TaiKhoan taikhoan, Long nhanviens_id);
}