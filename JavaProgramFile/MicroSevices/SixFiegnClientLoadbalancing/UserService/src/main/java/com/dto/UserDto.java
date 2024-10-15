package com.dto;

import java.util.ArrayList;
import java.util.List;

import com.entities.Rating;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDto {
	
	
	private int userId;
	private String name;
	private String email;
	private String about;
	

	private List<Rating>ratings=new ArrayList<>();

}
