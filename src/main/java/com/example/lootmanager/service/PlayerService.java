package com.example.lootmanager.service;

import com.example.lootmanager.model.Player;
import com.example.lootmanager.repository.PlayerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {

    private final PlayerRepository playerRepository;

    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    // CREATE
    public Player save(Player player) {
        return playerRepository.save(player);
    }

    // READ ALL
    public List<Player> findAll() {
        return playerRepository.findAll();
    }

    // READ BY ID
    public Player findById(Long id) {
        return playerRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Player não encontrado"));
    }

    // DELETE
    public void delete(Long id) {
        playerRepository.deleteById(id);
    }
}
