package com.developers.fitni_backend.config;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.crypto.spec.SecretKeySpec;
import java.security.Key;
import java.util.Base64;
import java.util.Date;

@Component
public class JwtUtil {

    @Value("${jwt.secret}")
    private String secret;

    private Key key;

    private final long EXPIRATION_TIME = 86400000; // 1 day

    // ⬇️ Initialiser la clé juste après l'injection de `secret`
    @PostConstruct
    public void init() {
        byte[] secretBytes = Base64.getEncoder().encode(secret.getBytes());
        this.key = new SecretKeySpec(secretBytes, SignatureAlgorithm.HS256.getJcaName());
    }

    public String generateToken(String userId, String role) {
        long nowMillis = System.currentTimeMillis();
        Date now = new Date(nowMillis);
        Date expiryDate = new Date(nowMillis + EXPIRATION_TIME);

        return Jwts.builder()
                .setSubject(userId)
                .claim("role", role)
                .setIssuedAt(now)
                .setExpiration(expiryDate)
                .signWith(key)
                .compact();
    }

    public String extractUserId(String token) {
        return Jwts.parserBuilder()
                .setSigningKey(key)
                .build()
                .parseClaimsJws(token)
                .getBody()
                .getSubject();
    }
    public String extractRole(String token) {
        return (String) Jwts.parserBuilder()
                .setSigningKey(key)
                .build()
                .parseClaimsJws(token)
                .getBody()
                .get("role");
    }
}
