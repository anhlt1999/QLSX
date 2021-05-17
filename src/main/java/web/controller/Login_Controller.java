package web.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import web.entity.TaiKhoan;
import web.repo.TaiKhoanRepository;

@Controller
@RequestMapping("/tk")
public class Login_Controller {
	private final TaiKhoanRepository tkRepo;
	
	@Autowired
	public Login_Controller(TaiKhoanRepository tkRepo) {
		this.tkRepo = tkRepo;
	}


	@GetMapping("/login")
	public String Login(HttpSession session, @Param("username") String username, @Param("password") String password) {
		TaiKhoan tk = (TaiKhoan) tkRepo.findByUsernameAndPassword(username, password);
		
		if(tk != null) {
			session.setAttribute("userLogin", tk);
			
			switch (tk.getNhanviens().getVaitro()) {
			case "qlsx":
				return "redirect:/btp/getAll";
			case "qldh":
				return "redirect:/donhang/getAll";
			case "nvtk":
				return "redirect:/bm/getAll";
			case "qlk":
				return "redirect:/nvl/getAll";
			case "qtv":
				return "redirect:/nv/getAll";
			default:
				break;
			}
			
		}
		return "redirect:/";
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.setAttribute("userLogin", null);
		return "redirect:/";
	}

}
