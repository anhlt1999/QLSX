package web.repo;

import org.springframework.data.repository.CrudRepository;

import web.entity.Donhang;

import java.util.List;

public interface DonhangRepository extends CrudRepository<Donhang, Long>{

    List<Donhang> findAllByMotaContaining(String keyword);
}
