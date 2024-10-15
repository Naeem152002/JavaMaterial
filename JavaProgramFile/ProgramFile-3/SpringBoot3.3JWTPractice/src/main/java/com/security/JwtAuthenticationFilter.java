package com.security;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@Component
public class JwtAuthenticationFilter extends OncePerRequestFilter{
	
	
	@Autowired
	private UserDetailsService userDetailsService;
	
	@Autowired
	private JwtTokenHelper jwtTokenHelper;
	
	
	 private Logger logger=LoggerFactory.getLogger(OncePerRequestFilter.class);
	 
	

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		String getHeader=request.getHeader("Authorization");
		logger.info(" Header:{} ",getHeader);
		
		String username=null;
		String token=null;
		
		if(getHeader!=null&&getHeader.startsWith("Bearer")) {
			token=getHeader.substring(7);
		try {
			username=jwtTokenHelper.getUsernameFromToken(token);
	}catch(Exception e) {
		e.printStackTrace();	
	}}
else {
	logger.info("Invalid Header Value !!");
}
		if(username!=null&&SecurityContextHolder.getContext().getAuthentication()==null) {
			UserDetails userDetails=this.userDetailsService.loadUserByUsername(username);
			boolean validate=this.jwtTokenHelper.validateToken(token,userDetails);
			
			if(validate) {
				UsernamePasswordAuthenticationToken up=new UsernamePasswordAuthenticationToken(token, null,userDetails.getAuthorities());
				up.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
				SecurityContextHolder.getContext().setAuthentication(up);
			}else {
				logger.info("validation fails!!");
			}
			
		}
		filterChain.doFilter(request, response);
	}}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
