package main;

public class EnchantedMazeFactory extends MazeFactory {
    public Room makeRoom(){ return new EnchantedRoom(spell); }
    public Door makeDoor(Room r1, Room r2){ return new DoorNeedingSpell(r1, r2, spell); }

    Spell spell = new Spell();
}
