package com.config;

import static org.springframework.security.config.Customizer.withDefaults;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
@Configuration
public class MySecurityConfig  {
	
	  @Bean
	    SecurityFilterChain formLoginFilterChain(HttpSecurity http) throws Exception {
	           return http.csrf(csrf -> csrf.disable())
	             .authorizeHttpRequests(authorize -> authorize
	            		 .requestMatchers("/api/").permitAll().//ye allow kr diya h ain phir bhi user and password dalana padega
	            		 anyRequest(). authenticated())
             .httpBasic(withDefaults())
	    		.build();
	    	}
	  @Bean
	    public UserDetailsService userDetailsService() {

	        // InMemoryUserDetailsManager
	        UserDetails admin = User.withUsername("Naeem")
	                .password("1234")
	                .roles("NORMAL")
	                .build();

	        UserDetails user = User.withUsername("roshni")
	                .password("abc")
	                .roles("USER")
	                .build();
	        return new InMemoryUserDetailsManager(admin, user);
	    }
	    @Bean
	    PasswordEncoder passwordEncoder() {
	    return NoOpPasswordEncoder.getInstance();
	    
	}
	  
}
		


