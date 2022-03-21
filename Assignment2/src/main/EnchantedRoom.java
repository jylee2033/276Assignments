package main;

class EnchantedRoom extends Room {
    EnchantedRoom(Spell s) {
        super();
    }

    public String toString() {
        return ("enchanted " + super.toString());
    }
}