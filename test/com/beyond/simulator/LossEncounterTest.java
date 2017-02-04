package com.beyond.simulator;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Jared on 2/4/2017.
 */
public class LossEncounterTest {

    @Test
    public void constructor1Test() {
        boolean planet = true;
        Die die = new D6();
        Resource type = Resource.FUEL;
        LossEncounter target = new LossEncounter(planet, die, type);
        assertTrue(target.isPlanetEncounter());
        assertEquals(6, target.getLoseDie().getNumSides());
        assertFalse(target.loseTwoResources());
        assertEquals(Resource.FUEL, target.getLose1Type());
    }

    @Test
    public void constructor2Test() {
        boolean planet = false;
        Die die = new D10();
        Resource type1 = Resource.WATER;
        Resource type2 = Resource.FOOD;
        LossEncounter target = new LossEncounter(planet, die, type1, type2);
        assertFalse(target.isPlanetEncounter());
        assertEquals(10, target.getLoseDie().getNumSides());
        assertTrue(target.loseTwoResources());
        assertEquals(Resource.WATER, target.getLose1Type());
        assertEquals(Resource.FOOD, target.getLose2Type());
    }

    @Test
    public void fuelLossTest() {
        boolean planet = true;
        Die die = new D6();
        Resource type = Resource.FUEL;
        LossEncounter target = new LossEncounter(planet, die, type);
        ResourcePool resources = new ResourcePool(10, 10, 10, 10, 10, 10);
        boolean alive = target.execute(resources);
        assertTrue(alive);
        int result = resources.getFuel();
        assertTrue(result < 10 && result > 3);
    }

    @Test
    public void waterFoodLossTest() {
        boolean planet = true;
        Die die = new D6();
        Resource type1 = Resource.WATER;
        Resource type2 = Resource.FOOD;
        LossEncounter target = new LossEncounter(planet, die, type1, type2);
        ResourcePool resources = new ResourcePool(10, 10, 10, 1, 10, 10);
        boolean alive = target.execute(resources);
        assertFalse(alive);
        int result1 = resources.getFood();
        int result2 = resources.getWater();
        assertTrue(result1 < 1);
        assertTrue(result2 < 10 && result2 > 3);
    }
}