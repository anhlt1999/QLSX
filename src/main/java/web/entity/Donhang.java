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
public class Donhang {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private int soluong;
	private String mota;
	
	
	public Donhang() {

	}

	
	public Donhang(Long id, int soluong, String mota, Khachhang khachhangs) {
		this.id = id;
		this.soluong = soluong;
		this.mota = mota;
		this.khachhangs = khachhangs;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public int getSoluong() {
		return soluong;
	}


	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}


	public String getMota() {
		return mota;
	}


	public void setMota(String mota) {
		this.mota = mota;
	}


	public Khachhang getKhachhangs() {
		return khachhangs;
	}


	public void setKhachhangs(Khachhang khachhangs) {
		this.khachhangs = khachhangs;
	}




	@ManyToOne(targetEntity = Khachhang.class)
	private Khachhang khachhangs;
}
