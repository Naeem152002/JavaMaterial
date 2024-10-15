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
    	System.out.println(cutUDe);
    	return http
                .csrf(csrf -> csrf.disable()) // Disable CSRF protection
                .authorizeHttpRequests(authorize -> authorize
                        .requestMatchers("/loginPage").permitAll()
                        .requestMatchers("/public/**").hasRole("NORMAL")
                        .requestMatchers("/api/**").hasRole("ADMIN")
                        .requestMatchers("/my/home").permitAll()
                        .anyRequest().authenticated()).
                formLogin(login -> login
                        .loginPage("/loginPage")
                        .loginProcessingUrl("/doLogin") // Specify the URL to submit the credentials to
                        .defaultSuccessUrl("/api/all") // Specify the default URL after a successful login
                        ) 
                .httpBasic(withDefaults()) 
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
