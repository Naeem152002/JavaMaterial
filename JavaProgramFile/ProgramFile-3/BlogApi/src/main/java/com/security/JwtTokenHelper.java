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
	
	private String secret="assddfdkfdjfjdfdjfdkfdfkjdfjkdfddfjdfkjdkfkdfkdfjkdfjdjfjkkdwrierjieriueriueirueuirieureoureoureuieroiuueiuieruiuir";
	
	public Claims getAllClaimsFromToken(String token) {
		return Jwts.parser().setSigningKey(secret).parseClaimsJws(token).getBody();
	}

	private <T>T getClaimFromToken(String token,Function<Claims, T>claimsResolver){
		final Claims claim=getAllClaimsFromToken(token);
		return claimsResolver.apply(claim);
	}
	public String getUsernameFromToken(String token) {
		return getClaimFromToken(token, Claims::getSubject);
	}
	public Date getExpirationDate(String token) {
		return getClaimFromToken(token, Claims::getExpiration);
	}
	private boolean isTokenExpire(String token) {
		final Date dx=getExpirationDate(token);
		return dx.before(new Date());
	}
	
	public boolean validateToken(String token,UserDetails userDetails) {
		final String s=getUsernameFromToken(token);
		return (s.equals(userDetails.getUsername())&&!isTokenExpire(token));
	}
	private String doGenerateToken(Map<String ,Object>claims,String subject) {
		return Jwts.builder().setClaims(claims).setSubject(subject).setIssuedAt(new Date(System.currentTimeMillis())).
		setExpiration(new Date(System.currentTimeMillis()+JWT_TOKEN_VALIDITY*1000)).
		signWith(SignatureAlgorithm.HS512,secret).compact();
	}
	public String generateToken(UserDetails userDetails) {
		Map<String ,Object>claims=new HashMap<>();
		return this.doGenerateToken(claims,userDetails.getUsername());
	}
	
	
	
}
