package com.developers.fitni_backend.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "exercise")
@Data
public class Exercises {
    @Id
    private String id;

    private String name;
    private String description;
    private String muscleGroup;
    private String image;
    private String video;
    private Boolean equipmentNeeded;

}
