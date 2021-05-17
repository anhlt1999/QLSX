package web.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import web.entity.ThanhPham;

public interface ThanhPhamRepository extends CrudRepository<ThanhPham, Long>{
	
	ThanhPham getByTen(String name);
	List<ThanhPham> findAllByNgayKTContaining(String keyword);
}
