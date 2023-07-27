package utils;

public interface Move {
    String detName();
    boolean beats(Move move);
}
