package com.config;

import static org.springframework.security.config.Customizer.withDefaults;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class MySecurityConfig {
	

	
	@Bean
	SecurityFilterChain getSecurity(HttpSecurity http) throws Exception {
		return http.csrf(csrf->csrf.disable())
				.authorizeHttpRequests(authorize->authorize.
						requestMatchers("/admin/").permitAll().
						requestMatchers("/api/register").permitAll().
						requestMatchers(HttpMethod.DELETE).hasAnyRole("NORMAL","ADMIN").
						requestMatchers(HttpMethod.PUT).hasAnyRole("NORMAL","ADMIN").
						requestMatchers("/api/**").hasRole("ADMIN").
						anyRequest().authenticated()
						).httpBasic(withDefaults()).build();
						
	}
	
	@Bean
	PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}


	
}
