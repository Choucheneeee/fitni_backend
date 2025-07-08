package com.developers.fitni_backend.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user")
@Data
public class User {

    @Id
    private String id;

    // Required fields
    @NotBlank(message = "First name is required and cannot be blank.")
    private String firstname;

    @NotBlank(message = "Last name is required and cannot be blank.")
    private String lastname;

    @NotBlank(message = "Email address is required.")
    @Email(message = "Please provide a valid email address.")
    private String email;

    @NotBlank(message = "Phone number is required.")
    private String tel;

    @NotBlank(message = "Address is required.")
    private String address;

    @NotBlank(message = "Password is required.")
    private String password;

    @NotNull(message = "Age is required.")
    @Min(value = 0, message = "Age must be a positive number.")
    private Integer age;

    @NotBlank(message = "Gender is required.")
    private String gender;

    private String profilePicture;

    @NotBlank(message = "User role is required.")
    private String role;

    // Optional fields for athlete users
    private Float weight;
    private Float height;
    private String activityLevel;

    // Optional fields for coach users
    private String bio;
    private String certification;
    private String specialities;
    private String price;
}
