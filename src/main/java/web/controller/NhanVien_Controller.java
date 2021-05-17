package web.controller;

import java.text.ParseException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import web.entity.Nhanvien;
import web.entity.TaiKhoan;
import web.repo.NhanvienRepository;

@Controller
@RequestMapping("/nv")
public class NhanVien_Controller {
	private final NhanvienRepository nvRepo;

	@Autowired
	private EntityManager entitymanager;
	@Autowired
	public NhanVien_Controller(NhanvienRepository nvRepo) {
		this.nvRepo = nvRepo;
	}
	
	@GetMapping("/getAll")
	public String getAll(Model model) {
		model.addAttribute("nv", nvRepo.findAll());
		return "qtv/nhanvien";
	}


	@GetMapping("/add")
	public String addNVL(Model model) {
		model.addAttribute("nv", new Nhanvien());
		return "qtv/formNV";
	}
	
	@GetMapping("/edit/{id}")
	public String edit(Model model, @PathVariable Long id) {
		model.addAttribute("nv", nvRepo.findById(id).get());
		return "qtv/formNV";
	}

	@GetMapping("/delete/{id}")
	public String deleteBTP(Model model, @PathVariable Long id) {
		nvRepo.deleteById(id);;
		return "redirect:/nv/getAll";
	}
	@GetMapping("/search")
	public String searchtTK(@Param("keyword") String keyword, Model model) throws ParseException {
		if(keyword=="") {
			return "redirect:/nv/getAll";
		} else {
			// hql with relationship
			Query q = entitymanager.createQuery("select nv from Nhanvien as nv where nv.ten like :x");
			q.setParameter("x", "%"+keyword+"%");
			
			List<Nhanvien> list = (List<Nhanvien>) q.getResultList();
			model.addAttribute("nv", list);		
		}
		
		return "qtv/nhanvien";
	}
	
	@PostMapping("/save")
	public String addNVL(Nhanvien nv) {
		nvRepo.save(nv);
		return "redirect:/nv/getAll";
	}
}
