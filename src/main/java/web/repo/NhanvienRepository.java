package web.repo;

import org.springframework.data.repository.CrudRepository;

import web.entity.Nhanvien;
import web.entity.TaiKhoan;

public interface NhanvienRepository extends CrudRepository<Nhanvien, Long>{

}