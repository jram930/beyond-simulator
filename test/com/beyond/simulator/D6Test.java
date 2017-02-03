package com.beyond.simulator;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Jared on 2/3/2017.
 */
public class D6Test {

    @Test
    public void rollTest() {

        D6 die = new D6();

        int counter = 0;
        while(counter++ < 1000) {
            int num = die.roll();
            assertTrue(num > 0 && num < 7);
        }
    }
}