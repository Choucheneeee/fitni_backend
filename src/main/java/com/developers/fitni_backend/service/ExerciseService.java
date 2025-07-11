package com.developers.fitni_backend.service;


import com.developers.fitni_backend.model.Exercises;
import com.developers.fitni_backend.repository.ExerciseRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExerciseService {

    @Autowired
    private ExerciseRepository exerciseRepository;

    public Exercises createExercise(Exercises exercise) {
        return exerciseRepository.save(exercise);
    }

    public Boolean deleteExercise(String id) {
        if (exerciseRepository.existsById(id)) {
            exerciseRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public Exercises getExercise(String id) {
            return exerciseRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Exercise not found ! "));

    }

    public List<Exercises> getAllExercises() {
        return exerciseRepository.findAll();
    }

    public Exercises updateExercise(Exercises exercise) {
        if(!(exerciseRepository.existsById(exercise.getId()))){
            throw new EntityNotFoundException("Exercise not found!");

        }
        return exerciseRepository.save(exercise);
    }

}
