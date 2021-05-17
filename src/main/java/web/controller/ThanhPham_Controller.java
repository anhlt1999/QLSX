package web.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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

import web.entity.ThanhPham;
import web.repo.ThanhPhamRepository;


@Controller
@RequestMapping("/tp")
public class ThanhPham_Controller {
	private final ThanhPhamRepository tpRepo;
	
	@Autowired
	private EntityManager entitymanager;

	@Autowired
	public ThanhPham_Controller(ThanhPhamRepository tpRepo) {
		this.tpRepo = tpRepo;
	}
	
	@GetMapping("/getAll")
	public String getAll(Model model) {
		model.addAttribute("tp", tpRepo.findAll());
		return "qlk/tp";
	}

	@GetMapping("/add")
	public String addTP(Model model) {
		model.addAttribute("tp", new ThanhPham());
		return "qlk/formTP";
	}
	
	@GetMapping("/edit/{id}")
	public String edit(Model model, @PathVariable Long id) {
		model.addAttribute("tp", tpRepo.findById(id).get());
		return "qlk/formTP";
	}

	@GetMapping("/delete/{id}")
	public String deleteTP(Model model, @PathVariable Long id) {
		tpRepo.deleteById(id);;
		return "redirect:/tp/getAll";
	}
		
	@GetMapping("/search")
	public String searchtTP(@Param("keyword") String keyword, Model model) throws ParseException {
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd-MM-yyyy");
		String kt = sdf2.format(sdf1.parse(keyword));
		if(kt=="") {
			return "redirect:/tp/getAll";
		} else if(!kt.matches("\\d{2}-\\d{2}-\\d{4}")) {
			// hql with relationship
			Query q = entitymanager.createQuery("select tp from ThanhPham as tp where ten = :x");
			q.setParameter("x", kt);
			
			List<ThanhPham> list = (List<ThanhPham>) q.getResultList();
			model.addAttribute("tp", list);		
		} else {
			List<ThanhPham> list = tpRepo.findAllByNgayKTContaining(keyword);
			model.addAttribute("tp", list);
		}
		
		return "qlk/tp";
	}
	
	@PostMapping("/save")
	public String addTP(ThanhPham tp) {
		tpRepo.save(tp);
		return "redirect:/tp/getAll";
	}
	

}
