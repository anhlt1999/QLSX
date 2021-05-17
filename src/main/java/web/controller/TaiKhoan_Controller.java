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

import web.entity.BanThanhPham;
import web.entity.TaiKhoan;
import web.entity.ThanhPham;
import web.repo.TaiKhoanRepository;

@Controller
@RequestMapping("/tk")
public class TaiKhoan_Controller {
	private final TaiKhoanRepository tkRepo;

	@Autowired
	private EntityManager entitymanager;
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
	@GetMapping("/search")
	public String searchtTK(@Param("keyword") String keyword, Model model) throws ParseException {
		if(keyword=="") {
			return "redirect:/tk/getAll";
		} else {
			// hql with relationship
			Query q = entitymanager.createQuery("select tk from TaiKhoan as tk join tk.nhanviens as nv where nv.ten like :x");
			q.setParameter("x", "%"+keyword+"%");
			
			List<TaiKhoan> list = (List<TaiKhoan>) q.getResultList();
			model.addAttribute("tk", list);		
		}
		
		return "qtv/taikhoan";
	}
	
	@PostMapping("/save")
	public String addNVL(TaiKhoan tk) {
		tkRepo.save(tk);
		return "redirect:/tk/getAll";
	}
}
