package com.sofkau.challengepreguntas.services;

import com.sofkau.challengepreguntas.entities.Question;
import com.sofkau.challengepreguntas.repositories.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

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

    @Override
    public List<Question> findByLevel(Integer level) {
        List<Question> sameLevel = new Stack<>();
        List<Question> questions = findAll();
        for (Question question : questions) {
            if(level.equals(question.getLevel())){
                sameLevel.add(question);
            }
        }
        return sameLevel;
    }
}
