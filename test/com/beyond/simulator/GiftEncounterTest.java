package com.beyond.simulator;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Jared on 2/4/2017.
 */
public class GiftEncounterTest {

    @Test
    public void constructor1Test() {
        boolean planet = true;
        Die die = new D6();
        Resource type = Resource.FUEL;
        GiftEncounter target = new GiftEncounter(planet, die, type);
        assertTrue(target.isPlanetEncounter());
        assertEquals(6, target.getGainDie().getNumSides());
        assertEquals(Resource.FUEL, target.getGainType());
    }

    @Test
    public void constructor2Test() {
        boolean planet = false;
        Die die = new D10();
        Resource type = Resource.MONEY;
        GiftEncounter target = new GiftEncounter(planet, die, type);
        assertFalse(target.isPlanetEncounter());
        assertEquals(10, target.getGainDie().getNumSides());
        assertEquals(Resource.MONEY, target.getGainType());
    }

    @Test
    public void oxygenGiftTest() {
        boolean planet = true;
        Die die = new D6();
        Resource type = Resource.OXYGEN;
        GiftEncounter target = new GiftEncounter(planet, die, type);
        ResourcePool resources = new ResourcePool(10, 10, 10, 10, 10, 10);
        target.execute(resources);
        assertTrue(resources.getOxygen() > 10 && resources.getOxygen() < 17);
    }

    @Test
    public void fuelGiftTest() {
        boolean planet = true;
        Die die = new D10();
        Resource type = Resource.FUEL;
        GiftEncounter target = new GiftEncounter(planet, die, type);
        ResourcePool resources = new ResourcePool(10, 10, 10, 10, 10, 10);
        target.execute(resources);
        assertTrue(resources.getFuel() > 10 && resources.getFuel() < 21);
    }

    @Test
    public void waterGiftTest() {
        boolean planet = true;
        Die die = new D20();
        Resource type = Resource.WATER;
        GiftEncounter target = new GiftEncounter(planet, die, type);
        ResourcePool resources = new ResourcePool(10, 10, 10, 10, 10, 10);
        target.execute(resources);
        assertTrue(resources.getWater() > 10 && resources.getWater() < 31);
    }

    @Test
    public void foodGiftTest() {
        boolean planet = true;
        Die die = new D6();
        Resource type = Resource.FOOD;
        GiftEncounter target = new GiftEncounter(planet, die, type);
        ResourcePool resources = new ResourcePool(10, 10, 10, 10, 10, 10);
        target.execute(resources);
        assertTrue(resources.getFood() > 10 && resources.getFood() < 17);
    }

    @Test
    public void hullGiftTest() {
        boolean planet = true;
        Die die = new D10();
        Resource type = Resource.HULL;
        GiftEncounter target = new GiftEncounter(planet, die, type);
        ResourcePool resources = new ResourcePool(10, 10, 10, 10, 10, 10);
        target.execute(resources);
        assertTrue(resources.getHull() > 10 && resources.getHull() < 21);
    }
}