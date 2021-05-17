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

import web.entity.BanThanhPham;
import web.entity.HoaDonNhap;
import web.entity.NVL;
import web.entity.ThanhPham;
import web.repo.HoaDonNhapRepository;
import web.repo.NVLRepository;

@Controller
@RequestMapping("/hdn")
public class HoaDonNhap_Controller {
	private final HoaDonNhapRepository hdnRepo;
	private final NVLRepository nvlRepo;
	
	@Autowired
	private EntityManager entitymanager;

	@Autowired
	public HoaDonNhap_Controller(HoaDonNhapRepository hdnRepo, NVLRepository nvlRepo) {
		super();
		this.hdnRepo = hdnRepo;
		this.nvlRepo = nvlRepo;
	}

// qlsx
	@GetMapping("/create")
	public String create(Model model) {
		model.addAttribute("hdn", new HoaDonNhap());
		return "qlsx/formHDN";
	}
	
	@PostMapping("/save")
	public String save(HoaDonNhap hdn) {
		Date date = new Date();
		String currentDate = new SimpleDateFormat("dd-MM-yyyy").format(date);
		
		hdn.setTrangThai("request");
		hdn.setNgayNhap(currentDate);
		
		hdnRepo.save(hdn);
		return "redirect:/btp/getAll";
	}
	
	
// qlk
	@GetMapping("/getAll")
	public String getAll(Model model) {
		model.addAttribute("hdn", hdnRepo.findAllByTrangThaiContaining("confirm"));
		return "qlk/hdn";
	}
	
	@GetMapping("/add")
	public String addHDN(Model model) {
		model.addAttribute("hdn", new HoaDonNhap());
		return "qlk/formHDN_add";
	}
	
	@GetMapping("/edit/{id}")
	public String edit(Model model, @PathVariable Long id) {
		model.addAttribute("hdn", hdnRepo.findById(id).get());
		return "qlk/formHDN_edit";
	}
	
	@GetMapping("/delete/{id}")
	public String deleteHDN(Model model, @PathVariable Long id) {
		hdnRepo.deleteById(id);;
		return "redirect:/hdn/getAll";
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
			Query q = entitymanager.createQuery("SELECT hdn FROM HoaDonNhap AS hdn WHERE (hdn.ngayNhap BETWEEN :x AND :y) AND hdn.trangThai = 'confirm' ");
			q.setParameter("x", bd);
			q.setParameter("y", kt);
			
			List<HoaDonNhap> list = (List<HoaDonNhap>) q.getResultList();
			model.addAttribute("hdn", list);
		}
		else if(keyword_from != "" && keyword_to == "") {
			bd = sdf2.format(sdf1.parse(keyword_from));
			Query q = entitymanager.createQuery("SELECT hdn FROM HoaDonNhap AS hdn WHERE hdn.ngayNhap >= :x AND hdn.trangThai = 'confirm' ");
			q.setParameter("x", bd);
			
			List<HoaDonNhap> list = (List<HoaDonNhap>) q.getResultList();
			model.addAttribute("hdn", list);
		}
		else if(keyword_from == "" && keyword_to != "") {
			kt = sdf2.format(sdf1.parse(keyword_to));
			Query q = entitymanager.createQuery("SELECT hdn FROM HoaDonNhap AS hdn WHERE hdn.ngayNhap <= :x AND hdn.trangThai = 'confirm' ");
			q.setParameter("x", kt);
			
			List<HoaDonNhap> list = (List<HoaDonNhap>) q.getResultList();
			model.addAttribute("hdn", list);
		}
		else return "redirect:/hdn/getAll";
		
		return "qlk/hdn";
	}
	
//	@PostMapping("/save_add")
//	public String addHDN(HoaDonNhap hdn) {
//		NVL nvl = new NVL();
//		nvl = nvlRepo.findById(hdn.getNvls().getId()).get();
//		nvl.setSoLuong(nvl.getSoLuong() + hdn.getSoLuong());
//		nvlRepo.save(nvl);
//		
//		hdn.setTrangThai("confirm");
//		hdn.setTongtien(hdn.getSoLuong()*nvl.getGia());
//		hdnRepo.save(hdn);
//		return "redirect:/hdn/getAll";
//	}
	@PostMapping("/save_add")
	public String addHDN(HoaDonNhap hdn) {
		NVL nvl = nvlRepo.findById(hdn.getNvls().getId()).get();
		hdn.setTrangThai("request");
		hdn.setTongtien(hdn.getSoLuong()*nvl.getGia());
		hdnRepo.save(hdn);
		return "redirect:/hdn/getAll";
	}
	
	@PostMapping("/save_edit")
	public String editHDN(HoaDonNhap hdn) {
		NVL nvl = nvlRepo.findById(hdn.getNvls().getId()).get();
		hdn.setTongtien(hdn.getSoLuong()*nvl.getGia());
		hdnRepo.save(hdn);
		return "redirect:/hdn/getAll";
	}
}
