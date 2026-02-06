package com.example.lootmanager.controller;

import com.example.lootmanager.dto.PlayerRequestDTO;
import com.example.lootmanager.model.Player;
import com.example.lootmanager.service.PlayerService;
import jakarta.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.lootmanager.response.ApiSuccessResponse;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;

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
    public ResponseEntity<ApiSuccessResponse<Player>> createPlayer(
            @RequestBody @Valid PlayerRequestDTO dto,
            HttpServletRequest request
    ) {
        Player player = playerService.create(dto);

        ApiSuccessResponse<Player> response = new ApiSuccessResponse<>(
                "Player criado com sucesso",
                player,
                request.getRequestURI()
        );

        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    // LIST PLAYERS
    @GetMapping("/players")
    public ResponseEntity<ApiSuccessResponse<List<Player>>> listPlayers(
            HttpServletRequest request
    ) {
        List<Player> players = playerService.findAll();

        ApiSuccessResponse<List<Player>> response = new ApiSuccessResponse<>(
                "Lista de players carregada com sucesso",
                players,
                request.getRequestURI()
        );

        return ResponseEntity.ok(response);
    }
}

