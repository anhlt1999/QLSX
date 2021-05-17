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
public class HoaDonXuat {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String ngayXuat;
	private double tongtien;
	private int soLuong;
	private String donvi;
	private String trangThai;
	
	public HoaDonXuat(Long id, String ngayXuat, double tongtien, int soLuong, String donvi, String trangThai,
			BoPhan bophans, NVL nvls) {
		this.id = id;
		this.ngayXuat = ngayXuat;
		this.tongtien = tongtien;
		this.soLuong = soLuong;
		this.donvi = donvi;
		this.trangThai = trangThai;
		this.bophans = bophans;
		this.nvls = nvls;
	}

	public HoaDonXuat() {
	
	}
	
	

	public String getTrangThai() {
		return trangThai;
	}

	public void setTrangThai(String trangThai) {
		this.trangThai = trangThai;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNgayXuat() {
		return ngayXuat;
	}

	public void setNgayXuat(String ngayXuat) {
		this.ngayXuat = ngayXuat;
	}

	public double getTongtien() {
		return tongtien;
	}

	public void setTongtien(double tongtien) {
		this.tongtien = tongtien;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public String getDonvi() {
		return donvi;
	}

	public void setDonvi(String donvi) {
		this.donvi = donvi;
	}

	public BoPhan getBophans() {
		return bophans;
	}

	public void setBophans(BoPhan bophans) {
		this.bophans = bophans;
	}

	public NVL getNvls() {
		return nvls;
	}

	public void setNvls(NVL nvls) {
		this.nvls = nvls;
	}


	@ManyToOne(targetEntity = BoPhan.class)
	private BoPhan bophans;
	
//	@ManyToOne(targetEntity = HoaDon.class)
//	private List<HoaDon> hoadons;
	@ManyToOne(targetEntity = NVL.class)
	private NVL nvls;
}
