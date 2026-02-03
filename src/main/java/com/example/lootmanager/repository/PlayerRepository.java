package com.example.lootmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.lootmanager.model.Player;

public interface PlayerRepository extends JpaRepository<Player, Long> {
}

