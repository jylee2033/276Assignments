package main;

public class DoorNeedingSpell extends Door {
    DoorNeedingSpell(Room r1, Room r2) {
        super(r1, r2);
        _doorNr = _doorCnt++;
        System.out.println("creating a DoorNeedingSpell #" + _doorNr + " between " + r1 + " and " + r2);
        _room1 = r1;
        _room2 = r2;
    }

    private static int _doorCnt = 1;
    private int _doorNr;
    private Room _room1;
    private Room _room2;
}
