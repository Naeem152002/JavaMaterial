package com.security;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
@Component
public class JwtTokenHelper {

	
	public static final long JWT_TOKEN_VALIDITY=5*60*60;
	
	public String secret="adsdfdsfdsfdsfdsfdsfdsffdfdfddkdkdkdkkdkkdkkdkdfefefjdfdfjedfdjfdkfjdkfjdfjkdfdjkfdjkjkfkdfjk";
	
	
	private Claims getAllClaimsFromToken(String token) {
		return Jwts.parser().setSigningKey(secret).parseClaimsJws(token).getBody();
	}
	
	public <T> T getClaimFromToken(String token,Function<Claims, T>claimResolver) {
		final Claims claim=getAllClaimsFromToken(token);
		return claimResolver.apply(claim);
	}
	public String getUsernameFromToken(String token) {
		return getClaimFromToken(token, Claims::getSubject);
	}
	public Date geteExpritationDateFromToken(String token) {
		 return getClaimFromToken(token, Claims::getExpiration);
	}
	private boolean isTokenExpire(String token) {
		final Date de=geteExpritationDateFromToken(token);
		return de.before(new Date());
	}
boolean validateToken(String token ,UserDetails userDetails) {
	String s=getUsernameFromToken(token);
	return (s.equals(userDetails.getUsername())&&isTokenExpire(token));
}
private String doGenerateToken(Map<String,Object>claims,String subject) {
	return Jwts.builder().setClaims(claims).setSubject(subject).setIssuedAt(new Date(System.currentTimeMillis()))
			.setExpiration(new Date(System.currentTimeMillis()+JWT_TOKEN_VALIDITY*1000))
			.signWith(SignatureAlgorithm.HS512,secret).compact();
}

public String generateToken(UserDetails userDetails) {
Map<String,Object>claims=new HashMap<>();	
return doGenerateToken(claims, userDetails.getUsername());
}
}
