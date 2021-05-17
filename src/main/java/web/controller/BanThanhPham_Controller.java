package web.controller;

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

import web.entity.BanThanhPham;
import web.entity.ThanhPham;
import web.repo.BanThanhPhamRepository;
import web.repo.ThanhPhamRepository;


@Controller
@RequestMapping("/btp")
public class BanThanhPham_Controller {
	private final BanThanhPhamRepository btpRepo;
	private final ThanhPhamRepository tpRepo;
	
	@Autowired
	private EntityManager entitymanager;

	@Autowired
	public BanThanhPham_Controller(BanThanhPhamRepository btpRepo, ThanhPhamRepository tpRepo) {
		this.btpRepo = btpRepo;
		this.tpRepo = tpRepo;
	}
	
	@GetMapping("/getAll")
	public String getAll(Model model) {
		model.addAttribute("btp", btpRepo.findAll());
		return "qlsx/btp";
	}


	@GetMapping("/add")
	public String addNVL(Model model) {
		model.addAttribute("btp", new BanThanhPham());
		return "qlsx/formBTP";
	}
	
	@GetMapping("/edit/{id}")
	public String edit(Model model, @PathVariable Long id) {
		model.addAttribute("btp", btpRepo.findById(id).get());
		return "qlsx/formBTP";
	}

	@GetMapping("/delete/{id}")
	public String deleteBTP(Model model, @PathVariable Long id) {
		btpRepo.deleteById(id);;
		return "redirect:/btp/getAll";
	}
	
	
	@GetMapping("/search")
	public String searchBTP(@Param("keyword") String keyword, Model model) {
	 	if(keyword==""){
	 		return "redirect:/btp/getAll";
		}
		else if(!keyword.matches("\\d{2}-\\d{2}-\\d{4}")) {
			// hql with relationship
			Query q = entitymanager.createQuery("select b from BanThanhPham as b where b.name like :x");
			q.setParameter("x", "%"+keyword+"%");

			List<BanThanhPham> list = (List<BanThanhPham>) q.getResultList();
			model.addAttribute("btp", list);		
		}else {
			List<BanThanhPham> list = btpRepo.findAllByNgayBDContaining(keyword);
			model.addAttribute("btp", list);
		}
		
		return "qlsx/btp";
	}
	
	@GetMapping("/confirm/{id}")
	public String confirm(@PathVariable Long id) {
		BanThanhPham b = (BanThanhPham) btpRepo.findById(id).get();
		
		ThanhPham tp = new ThanhPham();
		tp = tpRepo.getByTen(b.getName());
		
		if(tp == null) {
			// neu chua co thi` them moi
			ThanhPham tp2 = new ThanhPham();
			
			Date date = new Date();
			String currentDate = new SimpleDateFormat("dd-MM-yyyy").format(date);
			tp2.setSoluong(b.getSoluong());
			tp2.setNgayKT(currentDate);
			tp2.setTen(b.getName());
			tp2.setGia(0);
			
			tpRepo.save(tp2);
		}else {
			// neu co r update so luong
			tp.setSoluong(tp.getSoluong() + b.getSoluong());
			tpRepo.save(tp);
		}
		
		btpRepo.deleteById(id);
		
		
		return "redirect:/btp/getAll";
	}
	
	@PostMapping("/save")
	public String addNVL(BanThanhPham btp) {
		btpRepo.save(btp);
		return "redirect:/btp/getAll";
	}
	

}
