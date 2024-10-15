package com.springorm.SpringORM.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
@Data
@Entity
public class User {	
@Id	
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String name;
private String Address;
public User(int id, String name, String address) {
	this.id = id;
	this.name = name;
	Address = address;
}
public User() {
	
}

}


