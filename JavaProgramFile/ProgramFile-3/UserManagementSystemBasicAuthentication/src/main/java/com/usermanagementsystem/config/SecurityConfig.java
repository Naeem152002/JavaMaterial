package com.usermanagementsystem.config;

import static org.springframework.security.config.Customizer.withDefaults;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import com.usermanagementsystem.services.CustomUserDetailsService;
@Configuration
public class SecurityConfig {
	
	@Autowired
	private CustomUserDetailsService customUserDetailsService;

	
	
	  @Bean
	    SecurityFilterChain formLoginFilterChain(HttpSecurity http) throws Exception {
	           return http.csrf(csrf -> csrf.disable())
	             .authorizeHttpRequests(authorize -> authorize
	            	// requestMatchers("/admin-user/**").hasAnyRole("ADMIN","NORMAL")
	            	// requestMatchers("/admin-user/**").permitAll() both are same isliye without username and password not work basic authentication then admin ya User hi hoga 
	            	 
	            	 .requestMatchers("/admin/**").hasRole("ADMIN").
	            		 anyRequest(). authenticated())
	             .httpBasic(withDefaults()) 
    		.build();
	    	}
	
     @Bean
	  PasswordEncoder passwordEncoder() {
		  return NoOpPasswordEncoder.getInstance();
	  }
	 
     @Bean
 	DaoAuthenticationProvider   authenticationProvider() {
 			DaoAuthenticationProvider authenticationProvider = new DaoAuthenticationProvider();
 			authenticationProvider.setUserDetailsService(customUserDetailsService);
 			authenticationProvider.setPasswordEncoder(passwordEncoder());
 			return authenticationProvider;
 		}
}
	  