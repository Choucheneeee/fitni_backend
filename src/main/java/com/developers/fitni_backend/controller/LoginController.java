package com.developers.fitni_backend.controller;
import com.developers.fitni_backend.model.User;
import com.developers.fitni_backend.service.LoginService;
import com.developers.fitni_backend.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/auth")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping("/login")
    public String login(@RequestBody User user)
    {return loginService.login(user);}


    }
