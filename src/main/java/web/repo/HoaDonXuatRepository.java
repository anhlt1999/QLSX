package web.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import web.entity.HoaDonXuat;

public interface HoaDonXuatRepository extends CrudRepository<HoaDonXuat, Long>{
	List<HoaDonXuat> findAllByTrangThaiContaining(String request);
}
