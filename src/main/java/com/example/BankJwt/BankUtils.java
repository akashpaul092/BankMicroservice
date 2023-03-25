package com.example.BankJwt;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.example.BankSecurity.BankUserDetails;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Component
public class BankUtils implements Serializable{

	
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String key1;
private final String secret="s6v9y$B&E)H@McQfTjWmZq4t7w!z%C*F-JaNdRgUkXp2s5u8x/A?D(G+KbPeShVm";
	
	public String generatetoken(BankUserDetails detail) {
        Map<String, Object> claims = new HashMap<>();
        
        return Jwts.builder().setClaims(claims)
        		.setSubject(detail.getUsername())
        		.setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + 60*60*5*1000))
        		.signWith(SignatureAlgorithm.HS512, secret)
        		.compact();
	}
	
	public String getUsername(String token) {
		return Jwts.parser().setSigningKey(secret).parseClaimsJws(token).getBody().getSubject();
	}
	
	
}
