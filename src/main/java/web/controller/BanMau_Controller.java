package web.controller;

import java.util.Optional;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import web.entity.Banmau;
import web.entity.Nhanvien;
import web.entity.TaiKhoan;
import web.repo.BanMauRepository;
import web.repo.NhanvienRepository;

@Controller
@RequestMapping("/bm")
public class BanMau_Controller {
	private final BanMauRepository bmRepo;
	private final NhanvienRepository nvRepo;
	
	@Autowired
	public BanMau_Controller(BanMauRepository bmRepo, NhanvienRepository nvRepo) {
		super();
		this.bmRepo = bmRepo;
		this.nvRepo = nvRepo;
	}
	
	@GetMapping("/getAll")
	public String getAll(Model model) {
		model.addAttribute("bm", bmRepo.findAll());
		return "nvtk/banmau";
	}
	
	
	@GetMapping("/add")
	public String addNVL(Model model, HttpSession session) {
		TaiKhoan tk = (TaiKhoan) session.getAttribute("userLogin");
		Optional<Nhanvien> opNV = nvRepo.findById(tk.getId());
		Nhanvien nv = opNV.get();
		
		Banmau bm = new Banmau();
		bm.setNhanviens(nv);
		
		model.addAttribute("bm", bm);
		return "nvtk/formBanmau";
	}
	
	@GetMapping("/edit/{id}")
	public String edit(Model model, @PathVariable Long id) {
		model.addAttribute("bm", bmRepo.findById(id).get());
		return "nvtk/formBanmau";
	}

	@GetMapping("/delete/{id}")
	public String deleteBTP(Model model, @PathVariable Long id) {
		bmRepo.deleteById(id);;
		return "redirect:/bm/getAll";
	}
	
	@PostMapping("/save")
	public String addNVL(Banmau bm) {
		bmRepo.save(bm);
		return "redirect:/bm/getAll";
	}
}
