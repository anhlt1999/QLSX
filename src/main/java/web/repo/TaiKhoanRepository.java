package web.repo;

import org.springframework.data.repository.CrudRepository;

import web.entity.TaiKhoan;

public interface TaiKhoanRepository extends CrudRepository<TaiKhoan, Long>{
	TaiKhoan findByUsernameAndPassword(String username, String password);
}
