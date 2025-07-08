package com.developers.fitni_backend.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Document(collection = "progress_tracking")
public class ProgressTracking {
    @Id
    private String id;

    private User athlete;
    private Float weight;
    private Float bodyFatPercent;
    private Float muscleMass;
    private String notes;
    private Date recordedAt;
}

