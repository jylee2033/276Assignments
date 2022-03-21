package main;

public class MazeGame {
    // Class MazeGame has a method createMaze() for creating a Maze
    public Maze createMaze(MazeFactory factory) {
        // Should create a template Maze using factory methods
        Maze maze = factory.makeMaze();
        Wall wall = factory.makeWall();
        Room r1 = factory.makeRoom();
        Room r2 = factory.makeRoom();
        Door door = factory.makeDoor(r1, r2);

        maze.addRoom(r1);
        maze.addRoom(r2);

        r1.setSide(Direction.North, wall);
        r1.setSide(Direction.East, door);
        r1.setSide(Direction.South, wall);
        r1.setSide(Direction.West, wall);

        r2.setSide(Direction.North, wall);
        r2.setSide(Direction.East, wall);
        r2.setSide(Direction.South, wall);
        r2.setSide(Direction.West, door);

        return maze;
    }
}