package com.sofkau.challengepreguntas.services;

import com.sofkau.challengepreguntas.entities.Player;

import java.util.List;

public interface PlayerService {

    List<Player> findAll();
    void save(Player player);
    Player findById(Long id);
    void delete(Long id);
}
