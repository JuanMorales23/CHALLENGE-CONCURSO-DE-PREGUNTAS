package com.sofkau.challengepreguntas.services;

import com.sofkau.challengepreguntas.entities.Question;
import com.sofkau.challengepreguntas.repositories.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService{

    @Autowired
    private QuestionRepository questionRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Question> findAll() {
        return questionRepository.findAll();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void save(Question question) {
        questionRepository.save(question);
    }

    @Override
    @Transactional(readOnly = true)
    public Question findById(String id) {
        return questionRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void delete(String id) {
        questionRepository.deleteById(id);
    }
}
