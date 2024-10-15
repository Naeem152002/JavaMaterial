package com.springwithautowiringwithannotationbytype1;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import lombok.Data;

@Data
public class Employee 
{
private String name;
private int age;
@Autowired
@Qualifier(value="adr2")
//yahi field injection hota hain

private Address adr;

}

