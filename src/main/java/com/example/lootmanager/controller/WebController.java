package com.example.lootmanager.controller;

import com.example.lootmanager.service.PlayerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    private final PlayerService playerService;

    public WebController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("players", playerService.findAll());
        return "index";
    }
}
