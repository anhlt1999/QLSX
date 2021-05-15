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
public class BanThanhPham {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String mota;
	private String ngayBD;
	private int soluong;
	
	@ManyToOne(targetEntity = QuyTrinh.class)
	private List<QuyTrinh> quytrinhs;
}
