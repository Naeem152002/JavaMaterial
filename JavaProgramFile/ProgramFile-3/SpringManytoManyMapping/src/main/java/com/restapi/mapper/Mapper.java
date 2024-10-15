package com.restapi.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Mapper {
	@Bean
	public static
	 ModelMapper getMapper() {
		return new ModelMapper();
		
	}

}
