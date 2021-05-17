package web.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import web.entity.HoaDonXuat;
import web.entity.NVL;
import web.repo.HoaDonXuatRepository;
import web.repo.NVLRepository;

@Controller
@RequestMapping("/hdx")
public class HoaDonXuat_Controller {
	private final HoaDonXuatRepository hdxRepo;
	private final NVLRepository nvlRepo;
	
	@Autowired
	private EntityManager entitymanager;

	@Autowired
	public HoaDonXuat_Controller(HoaDonXuatRepository hdxRepo, NVLRepository nvlRepo) {
		this.hdxRepo = hdxRepo;
		this.nvlRepo = nvlRepo;
	}
	
	@GetMapping("/getAll")
	public String getAll(Model model) {
		model.addAttribute("hdx", hdxRepo.findAllByTrangThaiContaining("confirm"));
		return "qlk/hdx";
	}

	@GetMapping("/add")
	public String addHDX(Model model) {
		model.addAttribute("hdx", new HoaDonXuat());
		return "qlk/formHDX_add";
	}
	
	@GetMapping("/edit/{id}")
	public String edit(Model model, @PathVariable Long id) {
		model.addAttribute("hdx", hdxRepo.findById(id).get());
		return "qlk/formHDX_edit";
	}

	@GetMapping("/delete/{id}")
	public String deletehdx(Model model, @PathVariable Long id) {
		hdxRepo.deleteById(id);;
		return "redirect:/hdx/getAll";
	}
	
	@GetMapping("/search")
	public String searchHDN(@Param("keyword_from") String keyword_from, @Param("keyword_to") String keyword_to, Model model) throws ParseException {
		// hql with relationship
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd-MM-yyyy");
		String bd, kt;
		if(keyword_from != "" && keyword_to != "") {
			bd = sdf2.format(sdf1.parse(keyword_from));
			kt = sdf2.format(sdf1.parse(keyword_to));

			Query q = entitymanager.createQuery("SELECT hdx FROM HoaDonXuat AS hdx WHERE hdx.ngayXuat BETWEEN :x AND :y");
			q.setParameter("x", bd);
			q.setParameter("y", kt);
			
			List<HoaDonXuat> list = (List<HoaDonXuat>) q.getResultList();
			model.addAttribute("hdx", list);
		}
		else if(keyword_from != "" && keyword_to == "") {
			bd = sdf2.format(sdf1.parse(keyword_from));
			Query q = entitymanager.createQuery("SELECT hdx FROM HoaDonXuat AS hdx WHERE hdx.ngayXuat >= :x ");
			q.setParameter("x", bd);
			
			List<HoaDonXuat> list = (List<HoaDonXuat>) q.getResultList();
			model.addAttribute("hdx", list);
		}
		else if(keyword_from == "" && keyword_to != "") {
			kt = sdf2.format(sdf1.parse(keyword_to));
			Query q = entitymanager.createQuery("SELECT hdx FROM HoaDonXuat AS hdx WHERE hdx.ngayXuat <= :x ");
			q.setParameter("x", kt);
			
			List<HoaDonXuat> list = (List<HoaDonXuat>) q.getResultList();
			model.addAttribute("hdx", list);
		}
		
		else return "redirect:/hdx/getAll";
		
		return "qlk/hdx";
	}
	
//	@PostMapping("/save_add")
//	public String addHDX(HoaDonXuat hdx) {
//		NVL nvl = new NVL();
//		nvl = nvlRepo.findById(hdx.getNvls().getId()).get();
//		if(nvl.getSoLuong() >= hdx.getSoLuong()) {
//			nvl.setSoLuong(nvl.getSoLuong() - hdx.getSoLuong());
//			nvlRepo.save(nvl);
//			
//			hdx.setTongtien(hdx.getSoLuong()*nvl.getGia());
//			hdxRepo.save(hdx);
//		}
//		else {
//			return "qlk/formHDX_error";
//		}
//		
//		return "redirect:/hdx/getAll";
//	}
	@PostMapping("/save_add")
	public String addHDX(HoaDonXuat hdx) {
		NVL nvl = nvlRepo.findById(hdx.getNvls().getId()).get();
		if(nvl.getSoLuong() >= hdx.getSoLuong()) {
			hdx.setTrangThai("request");
			hdx.setTongtien(hdx.getSoLuong()*nvl.getGia());
			hdxRepo.save(hdx);
		}
		else {
			return "qlk/formHDX_error";
		}
		
		return "redirect:/hdx/getAll";
	}
	
	@PostMapping("/save_edit")
	public String editHDX(HoaDonXuat hdx) {
		NVL nvl = nvlRepo.findById(hdx.getNvls().getId()).get();
		hdx.setTongtien(hdx.getSoLuong()*nvl.getGia());
		hdxRepo.save(hdx);
		return "redirect:/hdx/getAll";
	}
	
}