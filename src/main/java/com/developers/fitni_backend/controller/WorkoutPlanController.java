package com.developers.fitni_backend.controller;


import com.developers.fitni_backend.model.Exercises;
import com.developers.fitni_backend.model.WorkoutPlans;
import com.developers.fitni_backend.service.WorkoutPlansService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/workoutPlan")
public class WorkoutPlanController {

    @Autowired
    private WorkoutPlansService workoutPlansService;

    @PostMapping("/create")
    public WorkoutPlans createPlan(@Valid @RequestBody WorkoutPlans dto) {
        return workoutPlansService.createPlan(dto);
    }

    @GetMapping("/all")
    public List<WorkoutPlans> getAllPlans() {
        return workoutPlansService.getAllPlans();
    }

    @DeleteMapping("/delete/{id}")
    public String deletePlan(@PathVariable String id) {
        if(workoutPlansService.deletePlan(id)){
            return "Workout Plan deleted successfully";
        };
        return "Workout Plan not found";
    }


    @GetMapping("/get/{id}")
    public WorkoutPlans getPlan(@PathVariable String id) {
        return workoutPlansService.getPlan(id);
    }

    @PutMapping("/update")
    public WorkoutPlans updateplan(@Valid @RequestBody WorkoutPlans plan) {
        return workoutPlansService.updateplan(plan);
    }

}

