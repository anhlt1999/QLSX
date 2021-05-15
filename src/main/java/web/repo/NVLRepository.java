package web.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import web.entity.NVL;

public interface NVLRepository extends CrudRepository<NVL, Long>{
	
	List<NVL> findAllByTenContaining(String keyword);
	
	List<NVL> findAllByNgayNhapContaining(String keyword);
}
