package com.springwithautowiringwithoutbeanandxml;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component(value="emp")//bean ke liye use hota
public class Employee 
{
private String name;
private int age;
@Autowired
private Address adr;


}

