package com.developers.fitni_backend.model;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "exercise")
@Data
public class Exercises {
    @Id
    private String id;

    @NotBlank(message = "Name is required.")
    private String name;
    private String description;

    @NotBlank(message = "muscle Group is required.")
    private String muscleGroup;

    private String image;
    private String video;

    private Boolean equipmentNeeded;

}
