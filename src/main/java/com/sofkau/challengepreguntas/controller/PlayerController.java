package com.sofkau.challengepreguntas.controller;

import com.sofkau.challengepreguntas.entities.Player;
import com.sofkau.challengepreguntas.services.PlayerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/player")
@CrossOrigin
public class PlayerController {

    public PlayerService playerService;

    @GetMapping
    public List<Player> findAll(){
        return playerService.findAll();
    }

    @PostMapping()
    public void save(@RequestBody Player player){
        playerService.save(player);
    }

    @GetMapping("/{id}")
    public Player findById(@PathVariable("id") Long id){
        return playerService.findById(id);
    }

    @DeleteMapping("/save/{id}")
    public void delete(@PathVariable("id") Long id){
        playerService.delete(id);
    }
}
