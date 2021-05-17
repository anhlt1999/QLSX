package web;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;

public class Test_Query {
	
	
	public static void main(String[] args) {
		Date date = new Date();
		
		String s = new SimpleDateFormat("dd-MM-yyyy").format(date);
		System.out.println(s);
		
		System.out.println("Date: "+ new SimpleDateFormat("dd-MM-yyyy").format(date));
	}
}
