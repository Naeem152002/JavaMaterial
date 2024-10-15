package com.restapi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.restapi.entities.User;
import com.restapi.repository.UserRepo;

@Service
public class CustomUserDetailsService implements UserDetailsService {
    
	
	@Autowired
	private UserRepo userRepo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user=this.userRepo.findByEmail(username).orElseThrow(()-> new RuntimeException("User not found!!"));
		return user;
	}
	
}
