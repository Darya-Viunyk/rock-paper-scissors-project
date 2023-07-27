package com.example.rockpaperscissorsproject;

import models.Player;
import utils.Move;

public class RockPaperScissorsGame {
    private Player player1;
    private Player player2;

    public RockPaperScissorsGame(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }




    public void play(){
        Move move1 = player1.move();
        Move move2 = player2.move();

        System.out.println(player1.name() + "chose" + move1.detName());
        System.out.println(player2.name() + "chose" + move2.detName());

        if (move1.beats(move2)){
            System.out.println(player1.name() + " wins!");
        } else if (move2.beats(move1)) {
            System.out.println(player2.name() + " wins!");

        }else {
            System.out.println("It is a draw! Let's play again.");
        }
    }
}
