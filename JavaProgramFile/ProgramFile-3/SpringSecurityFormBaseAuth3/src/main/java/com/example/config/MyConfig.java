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

	@Configuration
	public class Config 
	{
		
		@Bean
		public UserDetailsService users() 
		{
			UserDetails user = User.builder()
				.username("surya")
				.password("surya123")
				.roles("USER")
				.build();
			
			UserDetails admin = User.builder()
					.username("admin")
					.password("admin123")
					.roles("USER", "ADMIN")
					.build();
			
			return new InMemoryUserDetailsManager(user,admin);
		}
		
		@Bean
		public PasswordEncoder passwordEncode()
		{
		return NoOpPasswordEncoder.getInstance();	
		}
		

	
	
	
	
	
	}
}
