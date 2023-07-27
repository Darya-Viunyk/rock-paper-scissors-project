package models;

import utils.Move;
import utils.Rock;
import utils.Scissors;
import utils.Paper;

import java.io.InputStream;
import java.util.Scanner;



    public class HumanPlayer implements Player {
        private String name;
        private Scanner scanner;

        public HumanPlayer(String name, InputStream inputStream) {
            this.name = name;
            this.scanner = new Scanner(inputStream);
        }

        @Override
        public String name() {
            return name;
        }

        @Override
        public Move move() {
            while (true) {
                System.out.print("Enter your move (rock/paper/scissors): ");
                String input = scanner.nextLine().toLowerCase();
                if (input.equals("rock")) {
                    return new Rock();
                } else if (input.equals("paper")) {
                    return new Paper();
                } else if (input.equals("scissors")) {
                    return new Scissors();
                } else {
                    System.out.println("Invalid move. Please try again.");
                }
            }
        }
    }
