package com.springwithautowiringwithannotationbyname;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import lombok.Data;

@Data
public class Employee 
{
private String name;
private int age;
@Autowired

//yahi field injection hota hain

private Address adr1;

}

