package com.developers.fitni_backend.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "coach_offer")
@Data
public class CoachOffers {

    @Id
    private String id;

    private Coach coachId;
    private String title;
    private String description;
    private Double price;
    private String duration;
    private Boolean isActive;
    private String offerType;
    private Date createdAt;


}
