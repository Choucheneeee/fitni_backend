package com.developers.fitni_backend.controller;

import com.developers.fitni_backend.model.User;
import com.developers.fitni_backend.service.AthleteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/athletes")
public class AthleteController {

    @Autowired
    private AthleteService athleteService;

    @PostMapping
    public User createAthlete(@RequestBody User athlete) {
        return athleteService.addAthlete(athlete);
    }

    @GetMapping
    public List<User> getAllAthletes() {
        return athleteService.getAllAthletes();
    }
}
