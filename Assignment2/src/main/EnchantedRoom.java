package main;

class EnchantedRoom extends Room {
    EnchantedRoom(Spell s) {
        super();
        if (s.getSpell() == "ABCDEFG") {
            _roomNr = _roomCnt++;
            System.out.println("creating EnchantedRoom #" + _roomNr);
        }
    }

    public String toString() { return ("enchanted " + super.toString()); }

    private int _roomNr;
    private static int _roomCnt = 1;
}