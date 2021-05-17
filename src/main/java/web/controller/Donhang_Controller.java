package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import web.entity.Donhang;
import web.entity.NVL;
import web.repo.DonhangRepository;

import java.util.List;

@Controller
@RequestMapping("/donhang")
public class Donhang_Controller {
	private final DonhangRepository donhangRepo;
	
	@Autowired
	public Donhang_Controller(DonhangRepository donhangRepo) {
		this.donhangRepo = donhangRepo;
	}
	
	@GetMapping("/getAll")
	public String getAll(Model model){
		model.addAttribute("donhang",donhangRepo.findAll());
		return "qldh/donhang";
	}
	
	@GetMapping("/add")
	public String addDonhang(Model model){
		model.addAttribute("donhang",new Donhang());
		return "qldh/formDonhang";
	}
	
	@GetMapping("/edit/{id}")
	public String editDonhang(Model model, @PathVariable Long id){
		model.addAttribute("donhang",donhangRepo.findById(id).get());
		return "qldh/formDonhang";
	}
	
	@GetMapping("/delete/{id}")
	public String deleteDh(Model model, @PathVariable Long id){
		donhangRepo.deleteById(id);
		return "redirect:/donhang/getAll";
	}
	
	@GetMapping("/search")
	public String searchDonhang(@Param("keyword") String keyword, Model model) {
			List<Donhang> list = (List<Donhang>) donhangRepo.findAllByMotaContaining(keyword);
			model.addAttribute("donhang", list);
		return "qldh/donhang";
	}
	
	@PostMapping("/save")
	public String addDonhang(Donhang dh){
		donhangRepo.save(dh);
		return "redirect:/donhang/getAll";
	}
}
