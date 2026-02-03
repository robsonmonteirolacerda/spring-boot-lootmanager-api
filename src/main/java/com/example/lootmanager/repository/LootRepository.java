package com.example.lootmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.lootmanager.model.Loot;

public interface LootRepository extends JpaRepository<Loot, Long> {
    // aqui entram consultas customizadas depois
}