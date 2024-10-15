package com.springwithautowiringwithoutbean;

import org.springframework.stereotype.Component;

import lombok.Data;
@Component
@Data
public class Address {
private String city,state,country;

}

