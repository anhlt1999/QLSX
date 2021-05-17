package web.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class ThanhPham {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String ten;
	private int soluong;
	
	private double gia;
	
	private String ngayKT;

	public ThanhPham(Long id, String ten, int soluong, double gia, String ngayKT) {
		this.id = id;
		this.ten = ten;
		this.soluong = soluong;
		this.gia = gia;
		this.ngayKT = ngayKT;
	}

	public ThanhPham() {

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

	public int getSoluong() {
		return soluong;
	}

	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}

	public double getGia() {
		return gia;
	}

	public void setGia(double gia) {
		this.gia = gia;
	}

	public String getNgayKT() {
		return ngayKT;
	}

	public void setNgayKT(String ngayKT) {
		this.ngayKT = ngayKT;
	}
	
	
	
	
}
