package com.sofkau.challengepreguntas.services;

import com.sofkau.challengepreguntas.entities.Player;
import com.sofkau.challengepreguntas.repositories.PlayerRepository;
import lombok.AllArgsConstructor;
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
    public Player findById(Long id) {
        return playerRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void delete(Long id) {
        playerRepository.deleteById(id);
    }
}
