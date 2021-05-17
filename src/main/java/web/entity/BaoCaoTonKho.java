package web.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class BaoCaoTonKho {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private int soluongNhap;
	private int soluongXuat;
	private int tongHangTon;
	
	
	public BaoCaoTonKho(Long id, int soluongNhap, int soluongXuat, int tongHangTon, Nhanvien nhanviens, NVL nvls) {
		this.id = id;
		this.soluongNhap = soluongNhap;
		this.soluongXuat = soluongXuat;
		this.tongHangTon = tongHangTon;
		this.nhanviens = nhanviens;
		this.nvls = nvls;
	}
	
	public BaoCaoTonKho() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getSoluongNhap() {
		return soluongNhap;
	}

	public void setSoluongNhap(int soluongNhap) {
		this.soluongNhap = soluongNhap;
	}

	public int getSoluongXuat() {
		return soluongXuat;
	}

	public void setSoluongXuat(int soluongXuat) {
		this.soluongXuat = soluongXuat;
	}

	public int getTongHangTon() {
		return tongHangTon;
	}

	public void setTongHangTon(int tongHangTon) {
		this.tongHangTon = tongHangTon;
	}

	public Nhanvien getNhanviens() {
		return nhanviens;
	}

	public void setNhanviens(Nhanvien nhanviens) {
		this.nhanviens = nhanviens;
	}

	public NVL getNvls() {
		return nvls;
	}

	public void setNvls(NVL nvls) {
		this.nvls = nvls;
	}




	@ManyToOne(targetEntity = Nhanvien.class)
	private Nhanvien nhanviens;
	
	@ManyToOne(targetEntity = NVL.class)
	private NVL nvls;
}
