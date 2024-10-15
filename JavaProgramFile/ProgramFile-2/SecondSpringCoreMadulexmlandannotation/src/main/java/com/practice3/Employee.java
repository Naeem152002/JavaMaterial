package com.practice3;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component//bean ke liye use hota
public class Employee 
{
private String name;
private int age;
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

@Autowired//inject object
private Address adr;

public void show() {
	System.out.println("how are you");
}

@Override
public String toString() {
	return "Employee [name=" + name + ", age=" + age + ", adr=" + adr + "]";
}


}

