package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class MySecurityConfig {

    @Bean
    SecurityFilterChain formLoginFilterChain(HttpSecurity http) throws Exception {
    	return http
                .csrf(csrf -> csrf.disable()) // Disable CSRF protection
                .authorizeHttpRequests(authorize -> authorize
                        .requestMatchers("/loginPage").permitAll()
                        .requestMatchers("/public/**").hasRole("NORMAL")
                        .requestMatchers("/api/**").hasRole("USER")
                        .requestMatchers("/my/home").permitAll()
                        .anyRequest().authenticated()).// Ensure all other requests are authenticated
                formLogin(login -> login
                        .loginPage("/loginPage") // Specify the custom login page URL
                        .loginProcessingUrl("/doLogin") // Specify the URL to submit the credentials to
                        .defaultSuccessUrl("/api/all") // Specify the default URL after a successful login
                        ) // Allow everyone to access the login page
                .build();
                
    }

    @Bean
    public UserDetailsService userDetailsService(PasswordEncoder passwordEncoder) {

        // InMemoryUserDetailsManager
        UserDetails admin = User.withUsername("Naeem")
                .password(passwordEncoder.encode("1234"))
                .roles("ROLE_NORMAL")
                .build();

        UserDetails user = User.withUsername("Gufran")
                .password(passwordEncoder.encode("4567"))
                .roles("ROLE_USER")
                .build();

        return new InMemoryUserDetailsManager(admin, user);
    }

    @Bean
    PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder(10);
    }
}
