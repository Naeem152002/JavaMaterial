package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled=true)
public class MySecurity extends WebSecurityConfigurerAdapter{
	
	
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse())
        .and()
        .authorizeRequests()
        .antMatchers("/signin").permitAll()
         .antMatchers("/public/**").hasRole("NORMAL")
         .antMatchers("/users/**").hasRole("ADMIN")
         .anyRequest().authenticated().
         and().formLogin()
         .loginPage("/signin")
         .loginProcessingUrl("/doLogin")
         .defaultSuccessUrl("/users/");
    }
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
    	
    	auth.inMemoryAuthentication().withUser("johan").password(this.passwordEncoder().encode("durgesh")).roles("NORMAL");
    	auth.inMemoryAuthentication().withUser("rosani").password(this.passwordEncoder().encode("abc")).roles("ADMIN");
    
    }
   
    
    @Bean
public PasswordEncoder passwordEncoder() {
	return new BCryptPasswordEncoder();
 
	
    }}

