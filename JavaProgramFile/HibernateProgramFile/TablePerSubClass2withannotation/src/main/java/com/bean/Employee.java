package com.bean;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
@Entity
@PrimaryKeyJoinColumn(name = "empId")
public class Employee extends Person{
	private String job;
	private int salary;
}
