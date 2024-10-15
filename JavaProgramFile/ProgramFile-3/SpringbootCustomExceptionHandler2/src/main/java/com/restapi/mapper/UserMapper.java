package com.restapi.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;

public class UserMapper {

@Bean
public static ModelMapper modelMapper()
{
	return new ModelMapper();
}
	

}
