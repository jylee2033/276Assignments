package main;

public class DoorNeedingSpell extends Door {
    DoorNeedingSpell(Room r1, Room r2, Spell s) {
        super(r1, r2);
        System.out.println("Door needs a spell : " + s.getSpell());
    }

}
