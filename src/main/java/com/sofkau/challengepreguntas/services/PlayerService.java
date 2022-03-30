package com.sofkau.challengepreguntas.services;

import com.sofkau.challengepreguntas.entities.Player;

import java.util.List;

public interface PlayerService {

    List<Player> findAll();
    void save(Player player);
    Player findById(String id);
    void delete(String id);
    boolean existingPlayer(String name);
    String getIdByName(String name);
    void updateScore(Player player);
}
