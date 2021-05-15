package web.entity;

import java.sql.Date;
import java.util.List;

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
	
	private Date ngayNhap;
	private int soLuong;
	private String donvi;
	private String trangThai;
	private double tongtien;
	
//	@ManyToOne(targetEntity = HoaDon.class)
//	private List<HoaDon> hoadons;
	
	@ManyToOne(targetEntity = NhaCungCap.class)
	private NhaCungCap nhacungcaps;
	
	@ManyToOne(targetEntity = NVL.class)
	private NVL nvls;
}
