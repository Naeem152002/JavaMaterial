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

import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.MalformedJwtException;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@Component
public class JwtAuthenticationFilter extends OncePerRequestFilter{
	
	
	private Logger logger=LoggerFactory.getLogger(OncePerRequestFilter.class);
	
	@Autowired
	JwtTokenHelper jwtTokenHelper;
	
	@Autowired
	private UserDetailsService userDetailsService;
	

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
                String requestHeader=request.getHeader("Authorization");
                logger.info(" Header: {} ",requestHeader);
                String username=null;
                String token=null;
                
                if(requestHeader!=null&& requestHeader.startsWith("Bearer")) {
                	
                	token=requestHeader.substring(7);
                	try {
                		username=jwtTokenHelper.getUsernameFromToken(token);
                	}catch(IllegalArgumentException e) {
                		 logger.info("Illegal Argument while fetching the username !!");
                         e.printStackTrace();	
                	
                }catch(ExpiredJwtException e) {
                	logger.info("Given jwt token is expired !!");
                    e.printStackTrace();
                }catch (MalformedJwtException e) {
                    logger.info("Some changed has done in token !! Invalid Token");
                    e.printStackTrace();
                }
                	catch(Exception e) {
                	e.printStackTrace();
                }}
                	 else {
                         logger.info("Invalid Header Value !! ");
                     }
                
                if(username!=null&&SecurityContextHolder.getContext().getAuthentication()==null) {
                	UserDetails userDetails=userDetailsService.loadUserByUsername(username);
                	boolean validateToken=this.jwtTokenHelper.validateToken(token, userDetails);
                	
                	
                	if(validateToken) {
                		UsernamePasswordAuthenticationToken upa=new UsernamePasswordAuthenticationToken(token,null, userDetails.getAuthorities());
                	upa.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
                	SecurityContextHolder.getContext().setAuthentication(upa);
                	
                	}else {
                		logger.info("Validation fails");
                	}
                }

                filterChain.doFilter(request, response);
                }
	

                }


