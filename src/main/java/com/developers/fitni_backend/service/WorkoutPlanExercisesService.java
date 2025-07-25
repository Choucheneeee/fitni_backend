package com.developers.fitni_backend.service;


import com.developers.fitni_backend.model.Exercises;
import com.developers.fitni_backend.model.WorkoutPlanExercises;
import com.developers.fitni_backend.model.WorkoutPlanExercisesDTO;
import com.developers.fitni_backend.model.WorkoutPlans;
import com.developers.fitni_backend.repository.ExerciseRepository;
import com.developers.fitni_backend.repository.WorkoutPlanExercisesRepository;
import com.developers.fitni_backend.repository.WorkoutPlansRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkoutPlanExercisesService {

    @Autowired
    private WorkoutPlanExercisesRepository workoutPlanExercisesRepository;

    @Autowired
    private WorkoutPlansRepository workoutPlansRepository;

    @Autowired
    private ExerciseRepository exercisesRepository;

    public WorkoutPlanExercises createPlanExercice(WorkoutPlanExercisesDTO dto) {
        WorkoutPlans workoutPlan = workoutPlansRepository.findById(dto.getWorkoutPlan())
                .orElseThrow(() -> new RuntimeException("Workout plan not found"));

        Exercises exercise = exercisesRepository.findById(dto.getExercise())
                .orElseThrow(() -> new RuntimeException("Exercise not found"));

        WorkoutPlanExercises entity = new WorkoutPlanExercises();
        entity.setWorkoutPlan(workoutPlan);
        entity.setExercise(exercise);
        entity.setDayNumber(dto.getDayNumber());
        entity.setSets(dto.getSets());
        entity.setReps(dto.getReps());
        entity.setOrderInDay(dto.getOrderInDay());
        entity.setNotes(dto.getNotes());

        return workoutPlanExercisesRepository.save(entity);
    }

    public List<WorkoutPlanExercises> getAllPlansExercice() {
        return workoutPlanExercisesRepository.findAll();
    }

    public WorkoutPlanExercises getPlanExerciceById(String id) {
        return workoutPlanExercisesRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("WorkoutPlanExercises not found with id: " + id));
    }

    public WorkoutPlanExercises updatePlanExercice(String id, WorkoutPlanExercisesDTO dto) {
        WorkoutPlanExercises existing = getPlanExerciceById(id);

        WorkoutPlans workoutPlan = workoutPlansRepository.findById(dto.getWorkoutPlan())
                .orElseThrow(() -> new RuntimeException("Workout plan not found"));

        Exercises exercise = exercisesRepository.findById(dto.getExercise())
                .orElseThrow(() -> new RuntimeException("Exercise not found"));

        existing.setWorkoutPlan(workoutPlan);
        existing.setExercise(exercise);
        existing.setDayNumber(dto.getDayNumber());
        existing.setSets(dto.getSets());
        existing.setReps(dto.getReps());
        existing.setOrderInDay(dto.getOrderInDay());
        existing.setNotes(dto.getNotes());

        return workoutPlanExercisesRepository.save(existing);
    }

    public void deletePlanExercice(String id) {
        WorkoutPlanExercises existing = getPlanExerciceById(id);
        workoutPlanExercisesRepository.delete(existing);
    }
    public List<WorkoutPlanExercises> getExercisesByWorkoutPlanId(String workoutPlanId) {
        return workoutPlanExercisesRepository.findByWorkoutPlan_Id(workoutPlanId);
    }
}