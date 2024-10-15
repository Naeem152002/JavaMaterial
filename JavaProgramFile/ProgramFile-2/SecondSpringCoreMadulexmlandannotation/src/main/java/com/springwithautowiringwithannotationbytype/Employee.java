package com.springwithautowiringwithannotationbytype;



import org.springframework.beans.factory.annotation.Autowired;

import lombok.Data;

@Data
public class Employee 
{
private String name;
private int age;
@Autowired//by default by type use krta hain
private Address adr2;

}

