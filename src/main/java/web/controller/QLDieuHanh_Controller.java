package web.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
        return "qldh/nhapkho";
    }

    @GetMapping("/nhapkho/{id}")
    public String nhapkho(@PathVariable Long id){
        HoaDonNhap hdn=hdnrepo.findById(id).get();
        NVL nvl=nvlrepo.findById(hdn.getNvls().getId()).get();
        nvl.setSoLuong(hdn.getSoLuong()+ nvl.getSoLuong());
        
        hdn.setTrangThai("confirm");
        hdn.setTongtien(hdn.getSoLuong()*nvl.getGia());
        Date date = new Date();
		String currentDate = new SimpleDateFormat("dd-MM-yyyy").format(date);
		hdn.setNgayNhap(currentDate);
		
        nvlrepo.save(nvl);
        hdnrepo.save(hdn);
        return "redirect:/dieuhanh/nhapkho";
    }
    @GetMapping("/deletenk/{id}")
    public String deleteNk(@PathVariable Long id){
        hdnrepo.deleteById(id);
        return "redirect:/dieuhanh/nhapkho";
    }
    
    @GetMapping("/xuatkho")
    public String HDXuatKho(Model model) {
        model.addAttribute("xuatkho", hdxrepo.findAllByTrangThaiContaining("request"));
        return "qldh/xuatkho";
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
        Date date = new Date();
        String currentDate = new SimpleDateFormat("dd-MM-yyyy").format(date);
        hdx.setNgayXuat(currentDate);
        nvlrepo.save(nvl);
        return "redirect:/dieuhanh/xuatkho";
    }
    @GetMapping("/deletexk/{id}")
    public String deleteXk(@PathVariable Long id){
        hdxrepo.deleteById(id);
        return "redirect:/dieuhanh/xuatkho";
    }
    //tim kiem hdx theo ten nvl
    @GetMapping("/searchx")
    public String searchXK(@Param("keyword") String keyword,  Model model)  {
        if(keyword!="" )
        {
            Query q= entitymanager.createQuery("select hdx from HoaDonXuat as hdx join hdx.nvls as nvl where nvl.ten = :x");
            q.setParameter("x", keyword);
            List<HoaDonXuat> list= (List<HoaDonXuat>) q.getResultList();
            model.addAttribute("xuatkho", list);
        }
        else{
            return "redirect:/dieuhanh/xuatkho";
        }

        return "qldh/xuatkho";
    }
    
    //tim kiem hdn theo ten nvl
    @GetMapping("/searchn")
    public String searchNK(@Param("keyword") String keyword,  Model model)  {
        if(keyword!="" )
        {
            Query q= entitymanager.createQuery("select hdn from HoaDonNhap as hdn join hdn.nvls as nvl where nvl.ten = :x");
            q.setParameter("x", keyword);
            List<HoaDonNhap> list= (List<HoaDonNhap>) q.getResultList();
            model.addAttribute("nhapkho", list);
        }
        else{
            return "redirect:/dieuhanh/nhapkho";
        }

        return "qldh/nhapkho";
    }
}
