package com.restapi.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
	@NotEmpty(message = "Name cannot be blank")
//	@Column(name = "name", nullable = false)
	private String name;
	
	@NotEmpty(message = "Email cannot be blank")
	@Pattern(regexp = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$",message = "Incorrect format of email")
	private String email;
	
	@NotEmpty(message = "Mobile cannot be blank")
	@Size(min = 10,max = 10,message = "Mobile must be of 10 digits")
	private String mobile;
	
	@NotEmpty(message = "Pass cannot be blank")
	private String password;
	
}
