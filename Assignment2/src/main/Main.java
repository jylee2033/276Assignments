package main;

public class Main {
    public static void main(String[] args) {
        MazeFactory factory = new MazeFactory();
        MazeGame game = new MazeGame();
        game.createMaze(factory);

        System.out.println("==============================");

        EnchantedMazeFactory enchantedFactory = new EnchantedMazeFactory();
        MazeGame enchantedGame = new EnchantedMazeGame();
        enchantedGame.createMaze(enchantedFactory);
    }
}