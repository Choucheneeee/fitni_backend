package com.developers.fitni_backend.controller;


import com.developers.fitni_backend.model.Exercises;
import com.developers.fitni_backend.model.WorkoutPlanExercises;
import com.developers.fitni_backend.model.WorkoutPlanExercisesDTO;
import com.developers.fitni_backend.model.WorkoutPlans;
import com.developers.fitni_backend.service.WorkoutPlanExercisesService;
import com.developers.fitni_backend.service.WorkoutPlansService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/workoutPlanExercice")
public class WorkoutPlanExercisesController {
    @Autowired
    private WorkoutPlanExercisesService workoutPlanExercisesService;

    @PostMapping("/create")
    public WorkoutPlanExercises createPlanExercice(@Valid @RequestBody WorkoutPlanExercisesDTO dto) {
        return workoutPlanExercisesService.createPlanExercice(dto);
    }

    @GetMapping("/all")
    public List<WorkoutPlanExercises> getAllPlansExercice() {
        return workoutPlanExercisesService.getAllPlansExercice();
    }

    // Get a single WorkoutPlanExercises by ID
    @GetMapping("/{id}")
    public WorkoutPlanExercises getPlanExerciceById(@PathVariable String id) {
        return workoutPlanExercisesService.getPlanExerciceById(id);
    }

    // Update WorkoutPlanExercises by ID
    @PutMapping("/update/{id}")
    public WorkoutPlanExercises updatePlanExercice(@PathVariable String id,
                                                   @Valid @RequestBody WorkoutPlanExercisesDTO dto) {
        return workoutPlanExercisesService.updatePlanExercice(id, dto);
    }

    // Delete WorkoutPlanExercises by ID
    @DeleteMapping("/{id}")
    public void deletePlanExercice(@PathVariable String id) {
        workoutPlanExercisesService.deletePlanExercice(id);
    }

    @GetMapping("/by-workoutPlan/{workoutPlanId}")
    public List<WorkoutPlanExercises> getExercisesByWorkoutPlanId(@PathVariable String workoutPlanId) {
        return workoutPlanExercisesService.getExercisesByWorkoutPlanId(workoutPlanId);
    }
}