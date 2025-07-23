package com.developers.fitni_backend.repository;

import com.developers.fitni_backend.model.WorkoutPlanExercises;
import com.developers.fitni_backend.model.WorkoutPlanExercisesDTO;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
public interface WorkoutPlanExercisesRepository extends MongoRepository<WorkoutPlanExercises, String> {
    List<WorkoutPlanExercises> findByWorkoutPlan_Id(String workoutPlanId);

}
