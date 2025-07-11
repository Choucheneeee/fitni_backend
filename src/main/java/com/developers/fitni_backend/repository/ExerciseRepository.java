package com.developers.fitni_backend.repository;

import com.developers.fitni_backend.model.Exercises;
import jakarta.activation.MailcapRegistry;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ExerciseRepository extends MongoRepository<Exercises , String> {

}
