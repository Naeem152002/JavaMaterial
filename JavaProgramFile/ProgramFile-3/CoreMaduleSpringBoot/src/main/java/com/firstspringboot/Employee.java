package com.firstspringboot;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")

public class Employee 
{
private String name;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public Address getAdr() {
	return adr;
}
public void setAdr(Address adr) {
	this.adr = adr;
}
private int age;
@Autowired
private Address adr;


}

