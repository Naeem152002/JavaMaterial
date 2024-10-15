package com.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="user24")
public class User  {
	@Id
	private String name;
	private String password,email,mobile,role;
	public User(String name, String password, String email, String mobile) {
		super();
		this.name = name;
		this.password = password;
		this.email = email;
		this.mobile = mobile;
	}
	

}
