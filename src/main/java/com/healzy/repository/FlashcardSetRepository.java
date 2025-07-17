package com.healzy.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.healzy.model.FlashcardSet;


public interface FlashcardSetRepository extends MongoRepository<FlashcardSet, String> {
}