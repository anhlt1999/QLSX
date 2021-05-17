package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import web.entity.Nhanvien;
import web.repo.NhanvienRepository;

@Controller
@RequestMapping("/nv")
public class NhanVien_Controller {
	private final NhanvienRepository nvRepo;

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
	
	@PostMapping("/save")
	public String addNVL(Nhanvien nv) {
		nvRepo.save(nv);
		return "redirect:/nv/getAll";
	}
}
