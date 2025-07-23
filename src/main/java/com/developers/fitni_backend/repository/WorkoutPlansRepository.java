package com.developers.fitni_backend.repository;

import com.developers.fitni_backend.model.WorkoutPlans;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface WorkoutPlansRepository extends MongoRepository<WorkoutPlans, String> {
}
