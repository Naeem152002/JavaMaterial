package com.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserMapper {

@Bean
public static ModelMapper modelMapper()
{
	return new ModelMapper();
}
	

}
