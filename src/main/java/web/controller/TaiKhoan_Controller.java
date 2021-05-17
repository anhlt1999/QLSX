package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import web.entity.BanThanhPham;
import web.entity.TaiKhoan;
import web.repo.TaiKhoanRepository;

@Controller
@RequestMapping("/tk")
public class TaiKhoan_Controller {
	private final TaiKhoanRepository tkRepo;

	@Autowired
	public TaiKhoan_Controller(TaiKhoanRepository tkRepo) {
		this.tkRepo = tkRepo;
	}
	
	@GetMapping("/getAll")
	public String getAll(Model model) {
		model.addAttribute("tk", tkRepo.findAll());
		return "qtv/taikhoan";
	}


	@GetMapping("/add")
	public String addNVL(Model model) {
		model.addAttribute("tk", new TaiKhoan());
		return "qtv/formTK";
	}
	
	@GetMapping("/edit/{id}")
	public String edit(Model model, @PathVariable Long id) {
		model.addAttribute("tk", tkRepo.findById(id).get());
		return "qtv/formTK";
	}

	@GetMapping("/delete/{id}")
	public String deleteBTP(Model model, @PathVariable Long id) {
		tkRepo.deleteById(id);;
		return "redirect:/tk/getAll";
	}
	
	@PostMapping("/save")
	public String addNVL(TaiKhoan tk) {
		tkRepo.save(tk);
		return "redirect:/tk/getAll";
	}
}
