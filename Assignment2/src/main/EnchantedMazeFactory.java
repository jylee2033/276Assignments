package main;

public class EnchantedMazeFactory extends MazeFactory {
    public Maze makeMaze(){ return new Maze(); }
    public EnchantedRoom makeRoom(){ return new EnchantedRoom(new Spell()); }
    public Wall makeWall(){ return new Wall(); }
    public DoorNeedingSpell makeDoor(Room r1, Room r2){ return new DoorNeedingSpell(r1, r2); }
}
