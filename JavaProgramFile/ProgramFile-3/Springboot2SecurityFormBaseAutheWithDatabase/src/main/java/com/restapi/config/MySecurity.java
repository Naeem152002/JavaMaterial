package com.restapi.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;
import org.springframework.security.web.server.csrf.CookieServerCsrfTokenRepository;

import com.restapi.services.CustomUserDetailService;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled=true)
public class MySecurity extends WebSecurityConfigurerAdapter{
	
	@Autowired
	private CustomUserDetailService cutUDe; 
	
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
    	auth.userDetailsService(cutUDe).passwordEncoder(passwordEncoder());
    	
   }
    @Bean
public BCryptPasswordEncoder passwordEncoder() {
	
	return new BCryptPasswordEncoder(10);
}
	

}

