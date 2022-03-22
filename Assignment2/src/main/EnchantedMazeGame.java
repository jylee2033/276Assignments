package main;

class EnchantedMazeGame extends MazeGame {
    public EnchantedMaze makeMaze(){ return new EnchantedMaze(); }

    public Room makeRoom() {
        return new EnchantedRoom(castSpell());
    }

    public Door makeDoor(Room r1, Room r2) {
        return new DoorNeedingSpell(r1, r2);
    }

    private Spell castSpell() {
        return new Spell();
    }
}