package utils;

public class Rock implements Move {
    @Override
    public String detName() {
        return "rock";
    }
    @Override
    public boolean beats(Move move){
        return move instanceof Scissors;
    }
}
