package com.sofkau.challengepreguntas.controller;

import com.sofkau.challengepreguntas.entities.Question;
import com.sofkau.challengepreguntas.services.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
@CrossOrigin
public class QuestionController {

    @Autowired
    public QuestionService questionService;

    @GetMapping
    public List<Question> findAll(){
        return questionService.findAll();
    }

    @PostMapping()
    public void save(@RequestBody Question question){
        questionService.save(question);
    }

    @GetMapping("/{id}")
    public Question findById(@PathVariable("id") String id){
        return questionService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") String id){
        questionService.delete(id);
    }

}
