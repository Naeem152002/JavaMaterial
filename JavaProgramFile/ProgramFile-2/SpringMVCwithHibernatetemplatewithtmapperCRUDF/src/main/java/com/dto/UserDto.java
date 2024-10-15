package com.dto;


import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
private int id;
private String name,email,password,mobile;

public UserDto(String name,String email) {
	this.name=name;
	this.email=email;
}}