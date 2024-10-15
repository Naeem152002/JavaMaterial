package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.entities.CustomUserDetail;
import com.entities.User;
import com.repo.UserRepo;

@Service
public class CustomUserDetailService implements UserDetailsService {

	@Autowired
	private UserRepo userRepo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		User user=this.userRepo.findByUserName(username);
		System.out.println(username);
		
		if(user==null) {
			throw new UsernameNotFoundException("NO User");
		}
		
	return new CustomUserDetail(user);
	}

}
