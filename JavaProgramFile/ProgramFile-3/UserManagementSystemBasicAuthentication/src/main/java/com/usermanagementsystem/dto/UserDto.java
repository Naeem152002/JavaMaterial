package com.usermanagementsystem.dto;

import java.util.HashSet;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
	
	private int id;
	private String name;
	private String email;
	private String password;
	private String city;

	Set<RoleDto>roles=new HashSet<RoleDto>();

}
