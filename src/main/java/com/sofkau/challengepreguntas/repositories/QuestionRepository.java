package com.sofkau.challengepreguntas.repositories;

import com.sofkau.challengepreguntas.entities.Question;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRepository extends MongoRepository<Question, String> {
}
