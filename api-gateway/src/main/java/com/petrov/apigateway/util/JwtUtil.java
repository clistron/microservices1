package com.petrov.apigateway.util;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import org.springframework.stereotype.Component;

import java.security.Key;

@Component
public class JwtUtil {

    public static final String SECRET = "1242357257612378078346769124707824756239586239864520374";

    public void validateToken(final String token){
        Jwts.parserBuilder().setSigningKey(getSignKey()).build().parseClaimsJws(token);
    }

    private Key getSignKey(){
       byte[] keyBytes = Decoders.BASE64.decode(SECRET);
       return Keys.hmacShaKeyFor(keyBytes);
    }
}
