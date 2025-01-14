package com.config;

import static org.springframework.security.config.Customizer.withDefaults;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
@Configuration
public class MySecurityConfig  {
	
	  @Bean
	    SecurityFilterChain formLoginFilterChain(HttpSecurity http) throws Exception {
	           return http.csrf(csrf -> csrf.disable())
	             .authorizeHttpRequests(authorize -> 
	             authorize.
	             anyRequest(). authenticated())
	             .httpBasic(withDefaults())
	    		.build();
	    	}

}
