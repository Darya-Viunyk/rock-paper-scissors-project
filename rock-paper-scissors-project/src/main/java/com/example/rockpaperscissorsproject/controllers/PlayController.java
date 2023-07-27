package com.example.rockpaperscissorsproject.controllers;

import ch.qos.logback.core.model.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class PlayController {
    @GetMapping("/play")
    public String playMain(Model model){
return "play";
    }
    @GetMapping("/play/add")
    public String playAdd( org.springframework.ui.Model model) {
        model.addAttribute("title", "Home page");
        return "result";
    }

}
