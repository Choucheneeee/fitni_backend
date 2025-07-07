package com.developers.fitni_backend.service;

import com.developers.fitni_backend.model.User;
import com.developers.fitni_backend.repository.AthleteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AthleteService {

    @Autowired
    private AthleteRepository athleteRepository;

    public User addAthlete(User athlete) {
        if (athleteRepository.existsByEmail(athlete.getEmail())) {
            throw new RuntimeException("Email already registered.");
        }

        return athleteRepository.save(athlete);
    }

    public List<User> getAllAthletes() {
        return athleteRepository.findAll();
    }
}
