package com.sofkau.challengepreguntas.services;

import com.sofkau.challengepreguntas.entities.Player;
import com.sofkau.challengepreguntas.repositories.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PlayerServiceImpl implements PlayerService{

    @Autowired
    private PlayerRepository playerRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Player> findAll() {
        return playerRepository.findAll();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void save(Player player) {
        playerRepository.save(player);
    }

    @Override
    @Transactional(readOnly = true)
    public Player findById(String id) {
        return playerRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void delete(String id) {
        playerRepository.deleteById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public boolean existingPlayer(String name) {
        Boolean isPlayer = false;
        List<Player> players = findAll();
        for (Player player: players) {
            if (name.equals(player.getName())) {
                isPlayer = true;
                break;
            } else {
                isPlayer = false;
            }
        }
        return isPlayer;
    }

    @Override
    @Transactional(readOnly = true)
    public String getIdByName(String name) {
        String id = "";
        List<Player> players = findAll();
        for (Player player : players) {
            if (name.equals(player.getName())) {
                id = player.getId();
                break;
            } else {
                id = "Not found";
            }
        }
        return id;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void updateScore(Player player) {
        playerRepository.save(player);
    }
}
