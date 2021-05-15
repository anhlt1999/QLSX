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
public class BaoCaoTonKho {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private int soluongNhap;
	private int soluongXuat;
	private int tongHangTon;
	
	@ManyToOne(targetEntity = Nhanvien.class)
	private Nhanvien nhanviens;
	
	@ManyToOne(targetEntity = NVL.class)
	private NVL nvls;
}
