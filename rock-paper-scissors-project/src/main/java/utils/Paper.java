package utils;

public class Paper implements Move {
    @Override
    public String detName() {
        return "paper";
    }
    @Override
    public boolean beats(Move move){
        return move instanceof Rock;
    }
}