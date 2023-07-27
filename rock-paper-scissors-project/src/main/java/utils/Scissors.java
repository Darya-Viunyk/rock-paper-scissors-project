package utils;

public class Scissors implements Move {
    @Override
    public String detName() {
        return "scissors";
    }

    @Override
    public boolean beats(Move move){
        return move instanceof Paper;
    }
}