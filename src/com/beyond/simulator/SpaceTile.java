package com.beyond.simulator;

public class SpaceTile {

    private boolean _planet = false;

    private boolean _station = false;

    private boolean _ship = false;

    private boolean _start = false;

    private boolean _stop = false;

    private int _exit1 = -1;

    private int _exit2 = -1;

    public SpaceTile(boolean planet, boolean station, boolean ship, int exit1) {
        _planet = planet;
        _station = station;
        _ship = ship;
        _start = false;
        _stop = false;
        _exit1 = exit1;
        _exit2 = -1;
    }

    public SpaceTile(boolean planet, boolean station, boolean ship, int exit1, int exit2) {
        _planet = planet;
        _station = station;
        _ship = ship;
        _start = false;
        _stop = false;
        _exit1 = exit1;
        _exit2 = exit2;
    }

    public SpaceTile(boolean start) {
        _start = start;
        _stop = !start;
    }

    public boolean hasShip() {
        return _ship;
    }

    public boolean hasPlanet() {
        return _planet;
    }

    public boolean hasStation() {
        return _station;
    }

    public boolean isStart() {
        return _start;
    }

    public boolean isStop() {
        return _stop;
    }

    public boolean hasTwoExits() {
        return (_exit1 > 0 && _exit2 > 0);
    }

    public int getExit1() {
        return _exit1;
    }

    public int getExit2() {
        return _exit2;
    }
}
