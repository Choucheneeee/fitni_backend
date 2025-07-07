package com.developers.fitni_backend.repository;

import com.developers.fitni_backend.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AthleteRepository extends MongoRepository<User, String> {

    boolean existsByEmail(String email);
}
