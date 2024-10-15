package com.springwithautowiringwithannotationbyconstructor;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import lombok.Data;

@Data
public class Employee 
{
private String name;
private int age;
private Address adr;
@Autowired
public Employee(Address adr) {
	super();
	this.adr = adr;
}

}

