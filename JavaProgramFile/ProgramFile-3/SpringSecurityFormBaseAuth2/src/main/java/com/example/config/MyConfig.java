package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class MyConfig 
{
	@Bean
	public UserDetailsService getuserDetails()
	{
		InMemoryUserDetailsManager detailsManager=new InMemoryUserDetailsManager();
		  
		 UserDetails userDetails = User.withUsername("naeem")
		        .password("baba@123")
		        .build();
		  
		detailsManager.createUser(userDetails);
		
		return detailsManager;	
	}
	
	@Bean
	public PasswordEncoder passwordEncode()
	{
		return NoOpPasswordEncoder.getInstance();
	}

	
	
	
	
	
	
	

}

