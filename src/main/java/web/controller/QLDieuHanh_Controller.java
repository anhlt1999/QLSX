package web.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import web.entity.*;
import web.repo.BaoCaoTonKhoRepository;
import web.repo.HoaDonNhapRepository;
import web.repo.HoaDonXuatRepository;
import web.repo.NVLRepository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


@Controller
@CrossOrigin(origins = "https://qlsanxuat.herokuapp.com")
@RequestMapping("/dieuhanh")
public class QLDieuHanh_Controller {
    private final HoaDonNhapRepository hdnrepo;
    private final HoaDonXuatRepository hdxrepo;
    private final NVLRepository nvlrepo;
    private final BaoCaoTonKhoRepository bctkrepo;

    @Autowired
    private EntityManager entitymanager;
    @Autowired
    public QLDieuHanh_Controller(HoaDonNhapRepository hdnrepo, HoaDonXuatRepository hdxrepo,NVLRepository nvlrepo, BaoCaoTonKhoRepository bctkrepo){
        this.hdnrepo=hdnrepo;
        this.hdxrepo=hdxrepo;
        this.nvlrepo=nvlrepo;
        this.bctkrepo=bctkrepo;
    }
    @GetMapping("/nhapkho")
    public String getAll(Model model) {
        model.addAttribute("nhapkho", hdnrepo.findAllByTrangThaiContaining("request"));
        return "nhapkho";
    }

    @GetMapping("/nhapkho/{id}")
    public String nhapkho(@PathVariable Long id){
        HoaDonNhap hdn=hdnrepo.findById(id).get();
        NVL nvl=nvlrepo.findById(hdn.getNvls().getId()).get();
        nvl.setNgayNhap(hdn.getNgayNhap());
        nvl.setSoLuong(hdn.getSoLuong()+ nvl.getSoLuong());
        hdn.setTrangThai("confirm");
        nvlrepo.save(nvl);
        return "redirect:/dieuhanh/nhapkho";
    }
    @GetMapping("/xuatkho")
    public String HDXuatKho(Model model) {
        model.addAttribute("xuatkho", hdxrepo.findAllByTrangThaiContaining("request"));
        return "xuatkho";
    }
    @GetMapping("/xuatkho/{id}")
    public String xuatkho(@PathVariable Long id){
        HoaDonXuat hdx=hdxrepo.findById(id).get();
        NVL nvl=nvlrepo.findById(hdx.getNvls().getId()).get();
        BaoCaoTonKho bc=new BaoCaoTonKho();
        bc.setSoluongNhap(nvl.getSoLuong());
        bc.setSoluongXuat(hdx.getSoLuong());
        bc.setTongHangTon(nvl.getSoLuong()-hdx.getSoLuong());
        bc.setNhanviens(hdx.getBophans().getNhanviens());
        bc.setNvls(hdx.getNvls());
        bctkrepo.save(bc);
        nvl.setSoLuong(nvl.getSoLuong()-hdx.getSoLuong());
        hdx.setTrangThai("confirm");
        nvlrepo.save(nvl);
        return "redirect:/dieuhanh/xuatkho";
    }
    @GetMapping("/searchx")
    public String searchXK(@Param("keyword_from") String keyword_from, @Param("keyword_to") String keyword_to, Model model) throws ParseException {
        if(keyword_from!="" && keyword_to!="")
            {
            Date bd=new SimpleDateFormat("dd-MM-yyyy").parse(keyword_from);
            Date kt=new SimpleDateFormat("dd-MM-yyyy").parse(keyword_to);
            Query q= entitymanager.createQuery("select hdx from HoaDonXuat as hdx where (hdx.ngayXuat between :x and :y) and hdx.trangThai = 'request'");
            q.setParameter("x", bd);
            q.setParameter("y", kt);
            List<HoaDonXuat> list= (List<HoaDonXuat>) q.getResultList();
            model.addAttribute("xuatkho", list);
        }
        else{
                return "redirect:/dieuhanh/xuatkho";
            }

        return "xuatkho";
    }
    @GetMapping("/searchn")
    public String searchNK(@Param("keyword_from") String keyword_from, @Param("keyword_to") String keyword_to, Model model) throws ParseException {
        if(keyword_from!="" && keyword_to!="")
        {
            Date bd=new SimpleDateFormat("yyyy-MM-dd").parse(keyword_from);
            Date kt=new SimpleDateFormat("yyyy-MM-dd").parse(keyword_to);
            Query q= entitymanager.createQuery("select hdn from HoaDonNhap as hdn where (hdn.ngayNhap between :x and :y) and hdn.trangThai = 'request'");
            q.setParameter("x", bd);
            q.setParameter("y", kt);
            List<HoaDonNhap> list= (List<HoaDonNhap>) q.getResultList();
            model.addAttribute("nhapkho", list);
        }
        else{
            return "redirect:/dieuhanh/nhapkho";
        }

        return "nhapkho";
    }
}
