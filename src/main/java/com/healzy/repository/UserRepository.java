package com.healzy.repository;

import java.util.List;
import com.healzy.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, Long> {
    User findByEmail(String email);

    boolean existsByEmail(String email);

    List<User> findByNameContainingIgnoreCase (String name);
}