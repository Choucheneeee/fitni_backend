package com.developers.fitni_backend.model;

import jakarta.persistence.ManyToOne;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class WorkoutPlanExercisesDTO {
    @Id
    private String id;

    private String workoutPlan;

    private String exercise;

    private Integer dayNumber;
    private Integer sets;
    private Integer reps;
    private Integer orderInDay;
    private String notes;
}
