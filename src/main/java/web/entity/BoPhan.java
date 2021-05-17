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
public class BoPhan {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String ten;
	

	public BoPhan(Long id, String ten, Nhanvien nhanviens) {
		this.id = id;
		this.ten = ten;
		this.nhanviens = nhanviens;
	}

	public BoPhan() {

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

	public Nhanvien getNhanviens() {
		return nhanviens;
	}

	public void setNhanviens(Nhanvien nhanviens) {
		this.nhanviens = nhanviens;
	}


	@ManyToOne(targetEntity = Nhanvien.class, fetch = FetchType.LAZY)
	private Nhanvien nhanviens;
	
}
