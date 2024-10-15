package com.bean;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
@Entity
@DiscriminatorValue(value = "employee")
public class Employee extends Person{
	private String job;
	private int salary;
}
