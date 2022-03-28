package com.sofkau.challengepreguntas.entities;

import org.springframework.data.annotation.Id;

public class Category {
    @Id
    private Long id;
    private String name;
    private Integer level;
}
