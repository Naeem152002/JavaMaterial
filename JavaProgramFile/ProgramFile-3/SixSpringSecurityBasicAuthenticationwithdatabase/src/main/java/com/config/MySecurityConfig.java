 package com.config;

import static org.springframework.security.config.Customizer.withDefaults;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import com.service.CustomUserDetailService;



@Configuration
public class MySecurityConfig {
	
	@Autowired
	private CustomUserDetailService cutUDe; 
	

    @Bean
    SecurityFilterChain formLoginFilterChain(HttpSecurity http) throws Exception {
    	return http
    		    .csrf(csrf -> csrf.disable()) // Disable CSRF protection
    		    .authorizeHttpRequests(authorize -> authorize
    		        .requestMatchers("/loginPage").permitAll() // Allow everyone to access the login page in this mean NORMAL and ADMIN
    		        .requestMatchers("/public/**").hasRole("NORMAL") // Only users with role NORMAL can access /public/**
    		        .requestMatchers("/api/**").hasRole("ADMIN") // Only users with role ADMIN can access /api/**
    		        .requestMatchers("/my/home").permitAll() // Allow everyone to access /my/home
    		        .anyRequest().authenticated()) // Any other request must be authenticated
    		    .httpBasic(withDefaults()) // Enable HTTP Basic authentication
    		    .build();

    }
//    @Bean
//	DaoAuthenticationProvider   authenticationProvider() {
//			DaoAuthenticationProvider authenticationProvider = new DaoAuthenticationProvider();
//			authenticationProvider.setUserDetailsService(cutUDe);
//			authenticationProvider.setPasswordEncoder(passwordEncoder());
//			return authenticationProvider;
//		}

    @Bean
    PasswordEncoder passwordEncoder() {
    	return NoOpPasswordEncoder.getInstance();
        //return new BCryptPasswordEncoder(10);
    }
}
