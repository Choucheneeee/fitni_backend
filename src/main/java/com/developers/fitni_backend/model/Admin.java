package com.developers.fitni_backend.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "admin")

@Data
public class Admin {
    @Id
    private String id;

    private String nom;
    private String prenom;
    private String email;
    private String password;
}
