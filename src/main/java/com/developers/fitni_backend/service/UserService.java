package com.developers.fitni_backend.service;

import com.developers.fitni_backend.model.User;
import com.developers.fitni_backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User adduser(User user) {
        if (userRepository.existsByEmail(user.getEmail())) {
            throw new RuntimeException("Email already registered.");
        }

        return userRepository.save(user);
    }

    public List<User> getAllusers () {
        return userRepository.findAll();
    }
}
