package com.developers.fitni_backend.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnvTestController {

    @Value("${spring.data.mongodb.uri}")
    private String mongoUri;

    @GetMapping("/mongo-uri")
    public String showMongoUri() {
        return mongoUri;
    }
}
