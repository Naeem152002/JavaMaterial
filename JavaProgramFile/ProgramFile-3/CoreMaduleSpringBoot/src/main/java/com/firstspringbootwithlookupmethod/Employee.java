package com.firstspringbootwithlookupmethod;


import org.springframework.beans.factory.annotation.Lookup;
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
@Lookup
public Address getAdr() {
	return null;
}
private int age;
private Address adr;


}

