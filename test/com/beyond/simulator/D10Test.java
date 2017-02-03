package com.beyond.simulator;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by Jared on 2/3/2017.
 */
public class D10Test {

    @Test
    public void rollTest() {

        D10 die = new D10();

        int counter = 0;
        while(counter++ < 1000) {
            int num = die.roll();
            assertTrue(num > 0 && num < 11);
        }
    }
}