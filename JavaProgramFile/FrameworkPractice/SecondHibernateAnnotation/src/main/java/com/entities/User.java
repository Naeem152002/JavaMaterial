package com.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table
@Entity
public class User {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY )
	private int id;
	private String name,email;

}
