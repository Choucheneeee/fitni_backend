package com.developers.fitni_backend.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Data
@Document(collection = "coach")

public class Coach {
    @Id
    private String id;

    private String firstname;
    private String lastname;
    private String email;
    private String tel;
    private String address;
    private String password;
    private Integer age;
    private String gender;
    private String profilePicture;
    private String bio;
    private String certification;
    private String specialities;
    private String price;
}
