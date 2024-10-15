package com.firstspringboot.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.firstspringboot.address.Address;

import lombok.Data;

@Component
@Data
public class Employee {
	private String name,age;
	@Autowired
	Address addr;

}
