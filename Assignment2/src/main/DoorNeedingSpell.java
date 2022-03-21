package main;

public class DoorNeedingSpell extends Door {
    DoorNeedingSpell(Room r1, Room r2) {
        super(r1, r2);
        System.out.println("creating a DoorNeedingSpell #" + _doorNr + " between " + r1 + " and " + r2);
    }
}
