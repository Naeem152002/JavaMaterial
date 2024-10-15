package com.practice1;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component//bean ke liye use hota
public class Employee 
{
private String name;
private int age;
@Autowired//inject object
private Address adr;


}

