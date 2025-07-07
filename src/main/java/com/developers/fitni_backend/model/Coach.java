package com.developers.fitni_backend.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Coach {
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
    private String profilePicture;
    private String bio;
    private String certification;
    private String specialities	;
    private String price;
}
