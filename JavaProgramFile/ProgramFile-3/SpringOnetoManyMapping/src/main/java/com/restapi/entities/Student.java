package com.restapi.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int studentId;
	private String name;
	
	
	
	//(mappedBy="student",cascade = CascadeType.ALL)//unidirctional krne ke liye both side krna padta hain and cascade mean jo operation parent per kroge wo child per bhi hoga
	@ManyToMany
	private List<Address> address;

}
