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
public class QuyTrinh {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String maymoc;
	private String ten;
	
	
	public QuyTrinh(Long id, String maymoc, String ten, BoPhan bophans) {
		this.id = id;
		this.maymoc = maymoc;
		this.ten = ten;
		this.bophans = bophans;
	}


	public QuyTrinh() {

	}

	


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getMaymoc() {
		return maymoc;
	}


	public void setMaymoc(String maymoc) {
		this.maymoc = maymoc;
	}


	public String getTen() {
		return ten;
	}


	public void setTen(String ten) {
		this.ten = ten;
	}


	public BoPhan getBophans() {
		return bophans;
	}


	public void setBophans(BoPhan bophans) {
		this.bophans = bophans;
	}


	@ManyToOne(targetEntity = BoPhan.class, fetch = FetchType.LAZY)
	private BoPhan bophans;
}
