package com.developers.fitni_backend.repository;

import com.developers.fitni_backend.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.Optional;

public interface UserRepository extends MongoRepository<User, String> {

    boolean existsByEmail(String email);
    boolean existsById (String id);
    User findByEmail(String email);
    Optional<User> findById(String id);
}
