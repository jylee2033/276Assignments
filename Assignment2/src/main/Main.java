package main;

public class Main {
    public static void main(String[] args) {
        MazeFactory factory = new MazeFactory();
        MazeGame game = new MazeGame();
        game.createMaze(factory);

        EnchantedMazeFactory enchantedFactory = new EnchantedMazeFactory();
        EnchantedMazeGame enchantedGame = new EnchantedMazeGame();
        enchantedGame.createMaze(enchantedFactory);
    }
}