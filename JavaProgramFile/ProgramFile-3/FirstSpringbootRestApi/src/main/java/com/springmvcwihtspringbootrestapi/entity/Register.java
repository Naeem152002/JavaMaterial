package com.springmvcwihtspringbootrestapi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Register {
private int id;
private String name,email,mobile,password;
}
