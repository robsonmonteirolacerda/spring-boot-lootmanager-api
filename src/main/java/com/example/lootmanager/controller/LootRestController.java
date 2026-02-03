package com.example.lootmanager.controller;

import org.springframework.web.bind.annotation.*;

import com.example.lootmanager.model.Loot;
import com.example.lootmanager.service.LootService;

import java.util.List;

@RestController
@RequestMapping("/api/loots")
public class LootRestController {

    private final LootService lootService;

    public LootRestController(LootService lootService) {
        this.lootService = lootService;
    }

    @PostMapping
    public Loot create(@RequestBody Loot loot) {
        return lootService.save(loot);
    }

    @GetMapping
    public List<Loot> list() {
        return lootService.findAll();
    }

    @GetMapping("/{id}")
    public Loot getById(@PathVariable Long id) {
        return lootService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        lootService.delete(id);
    }
}
