package com.developers.fitni_backend.model;

import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "nutritionEntries")
@Data
public class NutritionEntries {
    @Id
    private String id;

    @ManyToOne
    private User athlete;

    private String foodName;
    private Integer calories;
    private Float protein;
    private Float carbs;
    private Float fat;
    private String mealType;


    @Temporal(TemporalType.DATE)
    private Date date;
}
