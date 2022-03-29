package com.sofkau.challengepreguntas.entities;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "questions")
public class Question {
    @Id
    @Indexed
    private String id;
    private String category;
    private Integer level;
    private String question;
    private String correctAnswer;
    private String incorrect1;
    private String incorrect2;
    private String incorrect3;
}
