package com.healzy.model;

import java.util.List;
import com.healzy.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<String> getSuggestions(String query) {
        return userRepository.findByNameContainingIgnoreCase(query)
                .stream()
                .map(User::getName)
                .collect(Collectors.toList());
    }
}

