package com.beyond.simulator;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Jared on 2/3/2017.
 */
public class ResourcePoolTest {

    @Test
    public void constructorTest() {
        ResourcePool target = new ResourcePool(1, 2, 3, 4, 5, 6);
        assertEquals(1, target.getHull());
        assertEquals(2, target.getFuel());
        assertEquals(3, target.getMoney());
        assertEquals(4, target.getFood());
        assertEquals(5, target.getWater());
        assertEquals(6, target.getOxygen());
    }

    @Test
    public void hullTest() {
        ResourcePool target = new ResourcePool(0, 1, 1, 1, 1, 1);
        assertFalse(target.enoughToLive());
        target.increaseHull(3);
        assertEquals(3, target.getHull());
        assertTrue(target.enoughToLive());
        target.decreaseHull(3);
        assertEquals(0, target.getHull());
        assertFalse(target.enoughToLive());
    }

    @Test
    public void fuelTest() {
        ResourcePool target = new ResourcePool(1, 0, 1, 1, 1, 1);
        assertFalse(target.enoughToLive());
        target.increaseFuel(3);
        assertEquals(3, target.getFuel());
        assertTrue(target.enoughToLive());
        target.decreaseFuel(3);
        assertEquals(0, target.getFuel());
        assertFalse(target.enoughToLive());
    }

    @Test
    public void foodTest() {
        ResourcePool target = new ResourcePool(1, 1, 1, 0, 1, 1);
        assertFalse(target.enoughToLive());
        target.increaseFood(3);
        assertEquals(3, target.getFood());
        assertTrue(target.enoughToLive());
        target.decreaseFood(3);
        assertEquals(0, target.getFood());
        assertFalse(target.enoughToLive());
    }

    @Test
    public void waterTest() {
        ResourcePool target = new ResourcePool(1, 1, 1, 1, 0, 1);
        assertFalse(target.enoughToLive());
        target.increaseWater(3);
        assertEquals(3, target.getWater());
        assertTrue(target.enoughToLive());
        target.decreaseWater(3);
        assertEquals(0, target.getWater());
        assertFalse(target.enoughToLive());
    }

    @Test
    public void oxygenTest() {
        ResourcePool target = new ResourcePool(1, 1, 1, 1, 1, 0);
        assertFalse(target.enoughToLive());
        target.increaseOxygen(3);
        assertEquals(3, target.getOxygen());
        assertTrue(target.enoughToLive());
        target.decreaseOxygen(3);
        assertEquals(0, target.getOxygen());
        assertFalse(target.enoughToLive());
    }

    @Test
    public void moneyTest() {
        ResourcePool target = new ResourcePool(1, 1, 0, 1, 1, 1);
        assertTrue(target.enoughToLive());
        target.increaseMoney(3);
        assertEquals(3, target.getMoney());
        assertTrue(target.enoughToLive());
        target.decreaseMoney(3);
        assertEquals(0, target.getMoney());
        assertTrue(target.enoughToLive());
    }
}