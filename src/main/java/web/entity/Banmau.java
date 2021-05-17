package web.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class Banmau {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String ten;
	private String mota;
	private String thanhPhan;
		
	public Banmau() {

	}
	
	public Banmau(Long id, String ten, String mota, String thanhPhan, Nhanvien nhanviens, Donhang donhangs) {
		this.id = id;
		this.ten = ten;
		this.mota = mota;
		this.thanhPhan = thanhPhan;
		this.nhanviens = nhanviens;
		this.donhangs = donhangs;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getMota() {
		return mota;
	}

	public void setMota(String mota) {
		this.mota = mota;
	}

	public String getThanhPhan() {
		return thanhPhan;
	}

	public void setThanhPhan(String thanhPhan) {
		this.thanhPhan = thanhPhan;
	}

	public Nhanvien getNhanviens() {
		return nhanviens;
	}

	public void setNhanviens(Nhanvien nhanviens) {
		this.nhanviens = nhanviens;
	}

	public Donhang getDonhangs() {
		return donhangs;
	}

	public void setDonhangs(Donhang donhangs) {
		this.donhangs = donhangs;
	}




	@ManyToOne(targetEntity = Nhanvien.class, fetch = FetchType.LAZY)
	private Nhanvien nhanviens;
	
	@ManyToOne(targetEntity = Donhang.class, fetch = FetchType.LAZY)
	private Donhang donhangs;
}
