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

    @ManyToOne
    private User athlete;

    private String title;
    private String level;
    private Integer durationWeeks;
    private String goal;
    private Boolean createdByAi;
}
