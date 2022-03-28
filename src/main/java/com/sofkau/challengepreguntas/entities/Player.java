package com.sofkau.challengepreguntas.entities;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "players")
public class Player {
    @Id
    @Indexed
    private String id;
    private String name;
    private Integer score;

}
