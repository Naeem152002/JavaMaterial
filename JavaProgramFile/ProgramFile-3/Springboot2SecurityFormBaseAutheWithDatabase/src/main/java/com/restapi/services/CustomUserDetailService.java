package com.restapi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.restapi.repo.UserRepo;
import com.restapi.entities.CustomUserDetail;
import com.restapi.entities.User;

@Service
public class CustomUserDetailService implements UserDetailsService {

	@Autowired
	private UserRepo userRepo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		System.out.println(username);
		
		User user=this.userRepo.findByUserName(username);
		System.out.println(user);
		
		if(user==null) {
			throw new UsernameNotFoundException("NO User");
		}
		
	return new CustomUserDetail(user);
	}

}
