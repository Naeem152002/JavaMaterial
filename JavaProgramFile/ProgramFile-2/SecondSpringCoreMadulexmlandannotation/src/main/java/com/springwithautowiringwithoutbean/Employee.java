package com.springwithautowiringwithoutbean;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import lombok.Data;


@Component(value="emp")//bean ke liye use hota
public class Employee 
{
private String name;
private int age;
@Autowired//inject object
private Address adr;
public String getName() {
	return name;
}
@Override
public String toString() {
	return "Employee [name=" + name + ", age=" + age + ", adr=" + adr + "]";
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


}

