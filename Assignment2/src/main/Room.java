package main;

class Room extends MapSite {
    Room() {
        _roomNr = _roomCnt++;
        System.out.println("creating Room #" + _roomNr);
    }

    void setSide(Direction d, MapSite site) {
        switch (d) {
            case North:
                _northSide = site;
            case South:
                _southSide = site;
            case East:
                _eastSide = site;
            case West:
                _westSide = site;
        }
        System.out.println("setting " + d.toString() + " side of " + this.toString() + " to " + site.toString());
    }

    MapSite getSide(Direction d) {
        MapSite result = null;
        switch(d) {
            case North:
                result = _northSide;
            case South:
                result = _southSide;
            case East:
                result = _eastSide;
            case West:
                result = _westSide;
        }
        return result;
    }
    public String toString() {
        return "Room #" + new Integer(_roomNr).toString();
    }

    protected int _roomNr;
    protected static int _roomCnt = 1;
    protected MapSite _northSide;
    protected MapSite _southSide;
    protected MapSite _eastSide;
    protected MapSite _westSide;
}