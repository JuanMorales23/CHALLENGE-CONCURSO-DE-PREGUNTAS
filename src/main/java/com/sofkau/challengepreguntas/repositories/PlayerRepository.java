package com.sofkau.challengepreguntas.repositories;

import com.sofkau.challengepreguntas.entities.Player;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface PlayerRepository extends MongoRepository<Player, Long> {
    List<Player> findAll();
}
