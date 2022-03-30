package main;

public class Main {
    public static void main(String[] args) {
        MazeFactory enchantedFactory = new EnchantedMazeFactory();
        MazeGame enchantedGame = new MazeGame();
        enchantedGame.createMaze(enchantedFactory);
    }
}