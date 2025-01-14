package com.androjava.mvc.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="abcd")
@Entity
public class User {	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String name,email,mobile,pass;	

}
