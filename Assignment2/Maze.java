class Maze {
    Maze() {
        System.out.println("creating a Maze");
    }
    void addRoom(Room r) {
        if (!_rooms.contains(r)) {
            _rooms.add(r);
        }
    }
    private Set<Room> _rooms = new HashSet<Room>();
}

public abstract class MapSite {
    // enter() method omitted
}

public enum Direction {
    North, South, East, West
}