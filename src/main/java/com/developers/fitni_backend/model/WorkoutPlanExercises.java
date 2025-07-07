package com.developers.fitni_backend.model;

import jakarta.persistence.ManyToOne;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "workoutPlanExercises")
@Data
public class WorkoutPlanExercises {
    @Id
    private String id;

    @ManyToOne
    private WorkoutPlans workoutPlan;

    @ManyToOne
    private Exercises exercise;

    private Integer dayNumber;
    private Integer sets;
    private Integer reps;
    private Integer orderInDay;
    private String notes;
}
