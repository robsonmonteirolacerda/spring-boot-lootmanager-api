package com.example.lootmanager.controller;

import com.example.lootmanager.model.Player;
import com.example.lootmanager.service.PlayerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/loot")
public class LootRestController {

    private final PlayerService playerService;

    public LootRestController(PlayerService playerService) {
        this.playerService = playerService;
    }

    // CREATE PLAYER
    @PostMapping("/player")
    public Player createPlayer(@RequestBody Player player) {
        return playerService.save(player);
    }

    // LIST PLAYERS
    @GetMapping("/players")
    public List<Player> listPlayers() {
        return playerService.findAll();
    }
}
