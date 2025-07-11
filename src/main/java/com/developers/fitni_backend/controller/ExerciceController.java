package com.developers.fitni_backend.controller;


import com.developers.fitni_backend.model.Exercises;
import com.developers.fitni_backend.service.ExerciseService;
import com.developers.fitni_backend.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/exercise")
public class ExerciceController {

    @Autowired
    private ExerciseService exerciseService;

    @PostMapping("/create")
    public Exercises createExercise(@Valid @RequestBody Exercises exercise) {
        return exerciseService.createExercise(exercise);
    }
    @GetMapping("/all")
    public List<Exercises> getAllExercises() {
        return exerciseService.getAllExercises();
    }

    @DeleteMapping("/delete/{id}")
    public String deleteExercise(@PathVariable String id) {
        if(exerciseService.deleteExercise(id)){
            return "Exercise deleted successfully";
        };
        return "Exercise not found";
    }
    @GetMapping("/get/{id}")
    public Exercises getExercise(@PathVariable String id) {
        return exerciseService.getExercise(id);
    }

    @PutMapping("/update")
    public Exercises updateExercise(@Valid @RequestBody Exercises exercise) {
        return exerciseService.updateExercise(exercise);
    }



}
