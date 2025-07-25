// This model represents a high-level workout plan created for an athlete.
// It defines the overall program structure such as its goal, difficulty level, duration, etc.
// A workout plan is made up of multiple exercises distributed across days.

package com.developers.fitni_backend.model;


import jakarta.persistence.ManyToOne;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "workoutPlans")
@Data
public class WorkoutPlans {
    @Id
    private String id;

    private String title;
    private String level;
    private Integer durationWeeks;
    private String goal;
    private Boolean createdByAi;
}
