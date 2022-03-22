package main;

public class EnchantedWall extends Wall {
    EnchantedWall() {
        _enchantedWallNr = _enchantedWallCnt++;
        System.out.println("creating EnchantedWall #" + new Integer(_enchantedWallNr).toString());
    }

    public String toString() {
        return "EnchantedWall #" + new Integer(_enchantedWallNr).toString();
    }

    private int _enchantedWallNr;
    private static int _enchantedWallCnt = 1;
}
