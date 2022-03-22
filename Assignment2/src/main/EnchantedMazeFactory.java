package main;

public class EnchantedMazeFactory extends MazeFactory {
    public EnchantedMaze makeMaze(){ return new EnchantedMaze(); }
    public EnchantedRoom makeRoom(){ return new EnchantedRoom(new Spell()); }
    public EnchantedWall makeWall(){ return new EnchantedWall(); }
    public DoorNeedingSpell makeDoor(Room r1, Room r2){ return new DoorNeedingSpell(r1, r2); }
}
