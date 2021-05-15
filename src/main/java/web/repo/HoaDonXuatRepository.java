package web.repo;

import org.springframework.data.repository.CrudRepository;

import web.entity.HoaDonXuat;

import java.util.List;

public interface HoaDonXuatRepository extends CrudRepository<HoaDonXuat, Long>{

    List<HoaDonXuat> findAllByTrangThaiContaining(String request);
}
