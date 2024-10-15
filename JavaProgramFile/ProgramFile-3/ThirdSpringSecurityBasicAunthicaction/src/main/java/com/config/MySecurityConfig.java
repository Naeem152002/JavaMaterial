package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import static org.springframework.security.config.Customizer.withDefaults;
@Configuration
public class MySecurityConfig  {
	
	  @Bean
	    SecurityFilterChain formLoginFilterChain(HttpSecurity http) throws Exception {
	           return http.csrf(csrf -> csrf.disable())
                       .authorizeHttpRequests(authorize -> authorize.requestMatchers("/public/***").hasRole("NORMAL").
                    		   requestMatchers("/api/***").hasRole("USER").
                    		  requestMatchers("/my/home").permitAll().
                       anyRequest(). authenticated()).
                   formLogin(login -> login.permitAll()
                          ).
                     
                       build();
	  }
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
	    PasswordEncoder passwordEncoder() {
	    return new BCryptPasswordEncoder(10);
	    
	}
	 
	  
}
		


