package com.beyond.simulator;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Jared on 1/31/2017.
 */
public class SpaceTileTest {

    @Test
    public void Constructor1_Trues_Test(){
        SpaceTile target = new SpaceTile(true, true, true, 4);
        assertTrue(target.hasPlanet());
        assertTrue(target.hasStation());
        assertTrue(target.hasShip());
        assertFalse(target.isStart());
        assertFalse(target.isStop());
        assertFalse(target.hasTwoExits());
        assertEquals(4, target.getExit1());
        assertEquals(-1, target.getExit2());
    }

    @Test
    public void Constructor1_Falses_Test(){
        SpaceTile target = new SpaceTile(false, false, false, 6);
        assertFalse(target.hasPlanet());
        assertFalse(target.hasStation());
        assertFalse(target.hasShip());
        assertFalse(target.isStart());
        assertFalse(target.isStop());
        assertFalse(target.hasTwoExits());
        assertEquals(6, target.getExit1());
        assertEquals(-1, target.getExit2());
    }

    @Test
    public void Constructor2_Trues_Test(){
        SpaceTile target = new SpaceTile(true, true, true, 4, 7);
        assertTrue(target.hasPlanet());
        assertTrue(target.hasStation());
        assertTrue(target.hasShip());
        assertFalse(target.isStart());
        assertFalse(target.isStop());
        assertTrue(target.hasTwoExits());
        assertEquals(4, target.getExit1());
        assertEquals(7, target.getExit2());
    }

    @Test
    public void Constructor2_Falses_Test(){
        SpaceTile target = new SpaceTile(false, false, false, 6, 8);
        assertFalse(target.hasPlanet());
        assertFalse(target.hasStation());
        assertFalse(target.hasShip());
        assertFalse(target.isStart());
        assertFalse(target.isStop());
        assertTrue(target.hasTwoExits());
        assertEquals(6, target.getExit1());
        assertEquals(8, target.getExit2());
    }

    @Test
    public void Constructor3_Start_Test(){
        SpaceTile target = new SpaceTile(true);
        assertTrue(target.isStart());
        assertFalse(target.isStop());
    }

    @Test
    public void Constructor3_Stop_Test(){
        SpaceTile target = new SpaceTile(false);
        assertFalse(target.isStart());
        assertTrue(target.isStop());
    }
}