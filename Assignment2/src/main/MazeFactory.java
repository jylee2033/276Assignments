package main;

public class MazeFactory {
    // Should have factory methods for creating a new Maze, Wall, Room, and Door
    public Maze makeMaze(){ return new Maze(); }
    public Room makeRoom(){ return new Room(); }
    public Wall makeWall(){ return new Wall(); }
    public Door makeDoor(Room r1, Room r2){ return new Door(r1, r2); }
}