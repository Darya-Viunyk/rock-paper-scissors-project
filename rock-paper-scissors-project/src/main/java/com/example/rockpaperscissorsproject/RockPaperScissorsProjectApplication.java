package com.example.rockpaperscissorsproject;

import models.ComputerPlayer;
import models.HumanPlayer;
import models.Player;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import utils.Move;

import java.io.InputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class RockPaperScissorsProjectApplication {

	private final Player player1;
	private final Player player2;

	@Autowired
	public RockPaperScissorsProjectApplication(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
	}


	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("title", "Home page");
		return "home";
	}

	@GetMapping("/play")
	public String play(Model model) {
		model.addAttribute("play", "play");

		InputStream inputStream = System.in;
		Player humanPlayer = new HumanPlayer("Player 1", inputStream);
		Player computerPlayer = new ComputerPlayer("Computer");
		RockPaperScissorsGame game = new RockPaperScissorsGame(humanPlayer, computerPlayer);
		game.play();

		model.addAttribute("game", game);
		return "result";
	}

	@GetMapping("/support")
	public String support(Model model) {
		model.addAttribute("title", "Support page");
		return "support";
	}

	public static void main(String[] args) {
		SpringApplication.run(RockPaperScissorsProjectApplication.class, args);
	}
}