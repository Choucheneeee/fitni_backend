package com.developers.fitni_backend.service;

import com.developers.fitni_backend.config.JwtUtil;
import com.developers.fitni_backend.model.User;
import com.developers.fitni_backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();


    @Autowired
    private UserRepository userRepository;

    @Autowired
    private JwtUtil jwtUtil;
    public User adduser(User user) {
        if (userRepository.existsByEmail(user.getEmail())) {
            throw new RuntimeException("Email already registered.");
        }
        user.setPassword(passwordEncoder.encode(user.getPassword()));

        return userRepository.save(user);
    }

    public List<User> getAllusers () {
        return userRepository.findAll();
    }

    public User getUserFromToken(String token) {
        System.out.println("token: " + token);
        if (userRepository.existsByEmail(jwtUtil.extractEmail(token))) {
            return userRepository.findByEmail(jwtUtil.extractEmail(token));
        }
        throw new RuntimeException("User not found.");

    }
}
