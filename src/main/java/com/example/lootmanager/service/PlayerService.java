package com.example.lootmanager.service;

import com.example.lootmanager.dto.PlayerRequestDTO;
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

    // CREATE via DTO
    public Player create(PlayerRequestDTO dto) {
        Player player = new Player();
        player.setName(dto.getName());
        player.setClasse(dto.getClasse());
        player.setSpec(dto.getSpec());
        player.setBisObtidos(dto.getBisObtidos());
        player.setBisTotal(dto.getBisTotal());

        return playerRepository.save(player);
    }

    // LIST
    public List<Player> findAll() {
        return playerRepository.findAll();
    }
}
