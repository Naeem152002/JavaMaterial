package com.fourthhiberante.emp;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import lombok.Data;

@Data
@Entity
public class Emp {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int empId;
	@Temporal(TemporalType.DATE)
	//private Date date;
	@Transient//isko likhane per database main main iski entry nahi hogi
	private String name;
	private String email,password,mobile;
public Emp() {
		
	}
	public Emp(String name, String email, String password, String mobile) {
		this.name = name;
		this.email = email;
		this.password = password;
		this.mobile = mobile;
	}
	public Emp(int empId, String name, String email, String password, String mobile) {
		this.empId = empId;
		this.name = name;
		this.email = email;
		this.password = password;
		this.mobile = mobile;
	}
	
}

