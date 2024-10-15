package com.restapi.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.restapi.security.JwtAuthenticationEntryPoint;
import com.restapi.security.JwtAuthenticationFilter;
import com.restapi.services.CustomUserDetailsService;


@Configuration
public class SecurityConfig {

	
//	@Autowired
//	private CustomUserDetailsService  customUserDetailService;
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;


    @Autowired
    private JwtAuthenticationEntryPoint point;
   
    @Autowired
    private JwtAuthenticationFilter filter;

	@Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

		  http.csrf(csrf -> csrf.disable())
		  .cors(cors->cors.disable())
          .authorizeHttpRequests(authorize -> authorize
        		  .requestMatchers("/auth/login").permitAll()
                        .anyRequest()
                        .authenticated()).exceptionHandling(ex -> ex.authenticationEntryPoint(point))
                .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
http.addFilterBefore(filter, UsernamePasswordAuthenticationFilter.class);
return http.build();
    }
//	@Bean
//	DaoAuthenticationProvider   authenticationProvider() {
//			DaoAuthenticationProvider authenticationProvider = new DaoAuthenticationProvider();
//			authenticationProvider.setUserDetailsService(customUserDetailService);
//			authenticationProvider.setPasswordEncoder(passwordEncoder);
//			return authenticationProvider;
//		}
//	

}
