package com.entities;

import java.util.Collection;
import java.util.HashSet;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class CustomUserDetail implements UserDetails {
	
	private User user;
	
	
public CustomUserDetail(User user) {
	this.user=user;
}


@Override
public Collection<? extends GrantedAuthority> getAuthorities() {
	HashSet<SimpleGrantedAuthority>set=new HashSet<>();
	set.add(new SimpleGrantedAuthority(this.user.getRole()));
	return set;
}

@Override
public String getPassword() {
	return this.user.getPassword();
}

@Override
public String getUsername() {
	return this.user.getUserName();

}
}
	