package com.lcwd.rating.service.mappers;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserMapper {
	
	@Bean
	ModelMapper modelMapper() {
		return new ModelMapper();
	}

}