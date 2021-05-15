package web.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

import java.sql.Date;


@Entity
@Data
public class NVL {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private Date ngayNhap;
	private String ten;
	private int soLuong;
	private double gia;

}
