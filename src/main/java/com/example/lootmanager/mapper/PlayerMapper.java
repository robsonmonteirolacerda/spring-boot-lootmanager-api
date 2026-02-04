package com.example.lootmanager.mapper;

import com.example.lootmanager.dto.PlayerRequestDTO;
import com.example.lootmanager.dto.PlayerResponseDTO;
import com.example.lootmanager.model.Player;

public class PlayerMapper {

    public static Player toEntity(PlayerRequestDTO dto) {
        Player p = new Player();
        p.setName(dto.getName());
        p.setClasse(dto.getClasse());
        p.setSpec(dto.getSpec());
        p.setBisObtidos(dto.getBisObtidos());
        p.setBisTotal(dto.getBisTotal());
        return p;
    }

    public static PlayerResponseDTO toResponse(Player p) {
        PlayerResponseDTO dto = new PlayerResponseDTO();
        dto.setId(p.getId());
        dto.setName(p.getName());
        dto.setClasse(p.getClasse());
        dto.setSpec(p.getSpec());
        dto.setBisObtidos(p.getBisObtidos());
        dto.setBisTotal(p.getBisTotal());

        double progress = (double) p.getBisObtidos() / p.getBisTotal() * 100;
        dto.setProgress(progress);

        return dto;
    }
}
