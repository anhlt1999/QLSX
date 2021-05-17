package web.repo;


import java.util.List;

import org.springframework.data.repository.CrudRepository;

import web.entity.BanThanhPham;

public interface BanThanhPhamRepository extends CrudRepository<BanThanhPham, Long>{
	List<BanThanhPham> findAllByNgayBDContaining(String keyword);
}
