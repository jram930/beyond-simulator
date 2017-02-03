package com.beyond.simulator;

import java.util.Date;
import java.util.Random;

/**
 * Created by Jared on 2/3/2017.
 */
public abstract class Die {

    protected static Random _random = new Random(new Date().getTime());

    protected int _sides;

    protected Die(int sides) {
        _sides = sides;
    }

    public int roll() {
        return _random.nextInt(_sides) + 1;
    }

    public int getNumSides() {
        return _sides;
    }
}
