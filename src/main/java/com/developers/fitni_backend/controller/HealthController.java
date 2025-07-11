package com.developers.fitni_backend.controller;

import com.developers.fitni_backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/health")
public class HealthController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/db")
    public String checkDatabaseConnection() {
        try {
            // Try a simple query (e.g., count documents)
            long count = userRepository.count();
            return "✅ Connected to MongoDB. User count: " + count;
        } catch (Exception e) {
            return "❌ Failed to connect to MongoDB: " + e.getMessage();
        }
    }
}
