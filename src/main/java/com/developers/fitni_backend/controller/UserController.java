package com.developers.fitni_backend.controller;

import com.developers.fitni_backend.model.User;
import com.developers.fitni_backend.service.UserService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService userService;
    @PostMapping("/register")
    public User register(@Valid @RequestBody User user) {
        return userService.adduser(user);
    }

    @GetMapping("/allUsers")
    public List<User> getAllUsers() {
        return userService.getAllusers();
    }



    @GetMapping("/me")
    public User getMyProfile(HttpServletRequest request) {
        String token = extractTokenFromHeader(request);
        if (token == null) {
            throw new RuntimeException("Token invalid");
        }

        User user = userService.getUserFromToken(token);
        if (user == null) {
            throw new RuntimeException("User not found");
        }

        return user;
    }
    private String extractTokenFromHeader(HttpServletRequest request) {
        String authHeader = request.getHeader("Authorization");
        if (authHeader != null && authHeader.startsWith("Bearer ")) {
            return authHeader.substring(7);
        }
        return null;
    }


}
