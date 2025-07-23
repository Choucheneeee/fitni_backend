// This model represents the individual exercises assigned to a workout plan.
// It connects a specific exercise to a workout plan, including metadata like
// the day number, order of execution, sets, reps, and notes.
// Think of this as the detailed breakdown of what to do on each day within a plan.


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
