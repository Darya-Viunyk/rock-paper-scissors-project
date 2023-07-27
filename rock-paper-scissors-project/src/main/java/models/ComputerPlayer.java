package models;

import utils.Move;
import utils.Rock;
import utils.Scissors;

import utils.Paper;
import java.util.Random;

public class ComputerPlayer implements Player {
    private String name;
    private Random random;

    public ComputerPlayer(String name){
        this.name = name;
        this.random = new Random();
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public Move move() {
        int randomIndex = random.nextInt(3);
        if (randomIndex == 0) {
            return new Rock();
        } else if (randomIndex == 1) {
            return new Paper();
        } else {
            return new Scissors();
        }
    }
}