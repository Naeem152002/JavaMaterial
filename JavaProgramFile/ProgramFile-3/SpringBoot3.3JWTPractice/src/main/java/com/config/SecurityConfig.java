package com.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.security.JwtAuthenticationEntryPoint;
import com.security.JwtAuthenticationFilter;

@Configuration
public class SecurityConfig {
	
	 @Autowired
	    private JwtAuthenticationEntryPoint point;
	   
	    @Autowired
	    private JwtAuthenticationFilter filter;
	
	@Bean
	SecurityFilterChain getSecurity(HttpSecurity http) throws Exception {
		 http.csrf(csrf->csrf.disable()).
		authorizeHttpRequests(authorize->authorize.
				requestMatchers("/auth/login").permitAll().
			requestMatchers("/api/**").hasAnyRole("ADMIN","NORMAL").
				anyRequest().authenticated()).exceptionHandling(ex -> ex.authenticationEntryPoint(point))
        .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
http.addFilterBefore(filter, UsernamePasswordAuthenticationFilter.class);
return http.build();
	}
	
	@Bean
	AuthenticationManager authenticationManager(AuthenticationConfiguration builder) throws Exception {
		return builder.getAuthenticationManager();
	}
	
	@Bean
	PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder(10);
	}
	
	
}
