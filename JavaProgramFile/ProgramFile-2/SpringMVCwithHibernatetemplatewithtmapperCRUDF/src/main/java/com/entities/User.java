package com.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
@Id
@GeneratedValue(strategy =GenerationType.IDENTITY )
private int id;
private String name,email,password,mobile;

public User(String name,String email) {
	this.name=name;
	this.email=email;
}}