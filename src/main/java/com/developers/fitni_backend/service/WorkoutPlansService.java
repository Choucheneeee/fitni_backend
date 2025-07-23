package com.developers.fitni_backend.service;

import com.developers.fitni_backend.model.Exercises;
import com.developers.fitni_backend.model.WorkoutPlans;
import com.developers.fitni_backend.repository.UserRepository;
import com.developers.fitni_backend.repository.WorkoutPlansRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.developers.fitni_backend.model.User;

import java.util.List;
import java.util.Optional;

@Service
public class WorkoutPlansService {

    @Autowired
    private WorkoutPlansRepository workoutPlansRepository;

    @Autowired
    private UserRepository userRepository;

    public WorkoutPlans createPlan(WorkoutPlans dto) {

        return workoutPlansRepository.save(dto);
    }

    public List<WorkoutPlans> getAllPlans() {
        return workoutPlansRepository.findAll();
    }
    public Boolean deletePlan(String id) {
        if (workoutPlansRepository.existsById(id)) {
            workoutPlansRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public WorkoutPlans getPlan(String id) {
        return workoutPlansRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Workout Plan not found ! "));

    }

    public WorkoutPlans updateplan(WorkoutPlans plan) {
        if(!(workoutPlansRepository.existsById(plan.getId()))){
            throw new EntityNotFoundException("Plan not found!");

        }
        return workoutPlansRepository.save(plan);
    }

}
