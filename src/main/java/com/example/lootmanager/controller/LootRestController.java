package com.example.lootmanager.controller;

import com.example.lootmanager.dto.PlayerRequestDTO;
import com.example.lootmanager.model.Player;
import com.example.lootmanager.service.PlayerService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/players")
public class LootRestController {

    private final PlayerService playerService;

    public LootRestController(PlayerService playerService) {
        this.playerService = playerService;
    }

    // CREATE PLAYER
    @PostMapping
    public Player createPlayer(@RequestBody @Valid PlayerRequestDTO dto) {
        return playerService.create(dto);
    }

    // LIST PLAYERS
    @GetMapping
    public List<Player> listPlayers() {
        return playerService.findAll();
    }
}
