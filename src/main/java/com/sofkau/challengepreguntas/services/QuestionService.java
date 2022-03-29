package com.sofkau.challengepreguntas.services;


import com.sofkau.challengepreguntas.entities.Question;

import java.util.List;

public interface QuestionService {
    List<Question> findAll();
    void save(Question question);
    Question findById(String id);
    void delete(String id);
}
