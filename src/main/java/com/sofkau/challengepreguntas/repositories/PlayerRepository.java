package com.sofkau.challengepreguntas.repositories;

import com.sofkau.challengepreguntas.entities.Player;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository extends MongoRepository<Player, Long> {
}
