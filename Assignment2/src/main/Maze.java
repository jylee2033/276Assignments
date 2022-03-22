package main;
import java.util.*;

class Maze {
    Maze() { /* System.out.println("creating a Maze"); */ }

    Maze createMaze() {
        Maze maze = new Maze();
        System.out.println("creating a Maze");
        return maze;
    }

    void addRoom(Room r) {
        if (!_rooms.contains(r)) {
            _rooms.add(r);
        }
    }
    private Set<Room> _rooms = new HashSet<Room>();
}