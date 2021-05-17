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
public class BaoCaoThanhPham {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String danhgia;
	
	
	public BaoCaoThanhPham() {
		
	}

	public BaoCaoThanhPham(Long id, String danhgia, Nhanvien nhanviens, ThanhPham thanhphams) {

		this.id = id;
		this.danhgia = danhgia;
		this.nhanviens = nhanviens;
		this.thanhphams = thanhphams;
	}


	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDanhgia() {
		return danhgia;
	}

	public void setDanhgia(String danhgia) {
		this.danhgia = danhgia;
	}

	public Nhanvien getNhanviens() {
		return nhanviens;
	}

	public void setNhanviens(Nhanvien nhanviens) {
		this.nhanviens = nhanviens;
	}

	public ThanhPham getThanhphams() {
		return thanhphams;
	}

	public void setThanhphams(ThanhPham thanhphams) {
		this.thanhphams = thanhphams;
	}



	@ManyToOne(targetEntity = Nhanvien.class)
	private Nhanvien nhanviens;
	
	@ManyToOne(targetEntity = ThanhPham.class)
	private ThanhPham thanhphams;
}
