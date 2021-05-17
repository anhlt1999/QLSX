package web.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import web.entity.HoaDonNhap;

public interface HoaDonNhapRepository extends CrudRepository<HoaDonNhap, Long>{
	List<HoaDonNhap> findAllByTrangThaiContaining(String request);
}
