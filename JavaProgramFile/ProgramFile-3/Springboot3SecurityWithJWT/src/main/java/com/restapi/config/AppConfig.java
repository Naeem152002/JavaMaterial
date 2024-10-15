package com.restapi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
@Configuration
public class AppConfig {
	 @Bean
	    public UserDetailsService userDetailsService(PasswordEncoder passwordEncoder) {

	        // InMemoryUserDetailsManager
	        UserDetails admin = User.withUsername("Naeem")
	                .password(passwordEncoder.encode("1234"))
	                .roles("NORMAL")
	                .build();

	        UserDetails user = User.withUsername("Gufran")
	                .password(passwordEncoder.encode("4567"))
	                .roles("USER")
	                .build();
	        return new InMemoryUserDetailsManager(admin, user);
	    }
	    
	    @Bean
	    public BCryptPasswordEncoder passwordEncoder() {
	        return new BCryptPasswordEncoder();
	    }

	    @Bean
	    public AuthenticationManager authenticationManager(AuthenticationConfiguration builder) throws Exception {
	        return builder.getAuthenticationManager();
	    }
	}




