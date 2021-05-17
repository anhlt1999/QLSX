package web.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import web.entity.Donhang;

public interface DonhangRepository extends CrudRepository<Donhang, Long>{
	List<Donhang> findAllByMotaContaining(String keyword);
}
