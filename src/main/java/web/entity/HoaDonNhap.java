package web.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class HoaDonNhap {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String ngayNhap;
	private int soLuong;
	private String donvi;
	private String trangThai;
	
	@Column(nullable = true)
	private double tongtien;
	
	public HoaDonNhap(Long id, String ngayNhap, int soLuong, String donvi, String trangThai, double tongtien,
			NhaCungCap nhacungcaps, NVL nvls) {
		this.id = id;
		this.ngayNhap = ngayNhap;
		this.soLuong = soLuong;
		this.donvi = donvi;
		this.trangThai = trangThai;
		this.tongtien = tongtien;
		this.nhacungcaps = nhacungcaps;
		this.nvls = nvls;
	}


	public HoaDonNhap() {

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


	public String getNgayNhap() {
		return ngayNhap;
	}


	public void setNgayNhap(String ngayNhap) {
		this.ngayNhap = ngayNhap;
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


	public double getTongtien() {
		return tongtien;
	}


	public void setTongtien(double tongtien) {
		this.tongtien = tongtien;
	}


	public NhaCungCap getNhacungcaps() {
		return nhacungcaps;
	}


	public void setNhacungcaps(NhaCungCap nhacungcaps) {
		this.nhacungcaps = nhacungcaps;
	}


	public NVL getNvls() {
		return nvls;
	}


	public void setNvls(NVL nvls) {
		this.nvls = nvls;
	}



	@ManyToOne(targetEntity = NhaCungCap.class)
	private NhaCungCap nhacungcaps;
	
	@ManyToOne(targetEntity = NVL.class)
	private NVL nvls;
}
