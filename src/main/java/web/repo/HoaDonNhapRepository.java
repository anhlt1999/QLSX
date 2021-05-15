package web.repo;

import org.springframework.data.repository.CrudRepository;

import web.entity.HoaDonNhap;

import java.util.List;

public interface HoaDonNhapRepository extends CrudRepository<HoaDonNhap, Long>{

    List<HoaDonNhap> findAllByTrangThaiContaining(String request);
}
