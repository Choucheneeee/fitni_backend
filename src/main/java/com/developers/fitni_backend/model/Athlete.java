package com.developers.fitni_backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Athlete {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String firstname;
    private String lastname;
    private String email;
    private String tel;
    private String address;
    private String password;
    private String age;
    private String gender;
    private Float weight;
    private Float height;
    private String profilePicture;
    private String activity_level;


}



