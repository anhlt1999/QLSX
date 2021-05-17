package web.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class BanThanhPham {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String mota;
	private String ngayBD;
	private int soluong;
	private String name;
	
	


	public BanThanhPham(Long id, String mota, String ngayBD, int soluong, String name, QuyTrinh quytrinhs) {
		this.id = id;
		this.mota = mota;
		this.ngayBD = ngayBD;
		this.soluong = soluong;
		this.name = name;
		this.quytrinhs = quytrinhs;
	}

	public BanThanhPham() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMota() {
		return mota;
	}

	public void setMota(String mota) {
		this.mota = mota;
	}

	public String getNgayBD() {
		return ngayBD;
	}

	public void setNgayBD(String ngayBD) {
		this.ngayBD = ngayBD;
	}

	public int getSoluong() {
		return soluong;
	}

	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}

	public QuyTrinh getQuytrinhs() {
		return quytrinhs;
	}

	public void setQuytrinhs(QuyTrinh quytrinhs) {
		this.quytrinhs = quytrinhs;
	}


	@ManyToOne(targetEntity = QuyTrinh.class, fetch = FetchType.LAZY)
	private QuyTrinh quytrinhs;
}
