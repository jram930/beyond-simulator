package com.beyond.simulator;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Jared on 2/3/2017.
 */
public class ExchangeEncounterTest {

    @Test
    public void constructor1Test() {
        boolean planet = true;
        Die gainDie = new D10();
        Die loseDie = new D6();
        Resource gainType = Resource.FOOD;
        Resource loseType = Resource.OXYGEN;
        ExchangeEncounter target = new ExchangeEncounter(planet, gainDie, loseDie, gainType, loseType);
        assertTrue(target.isPlanetEncounter());
        assertEquals(10, target.getGainDie().getNumSides());
        assertEquals(6, target.getLoseDie().getNumSides());
        assertEquals(Resource.FOOD, target.getGainType());
        assertFalse(target.costsTwoResources());
        assertEquals(Resource.OXYGEN, target.getLose1Type());
        assertNull(target.getLose2Type());
    }

    @Test
    public void constructor2Test() {
        boolean planet = false;
        Die gainDie = new D20();
        Die loseDie = new D10();
        Resource gainType = Resource.FUEL;
        Resource lose1Type = Resource.WATER;
        Resource lose2Type = Resource.MONEY;
        ExchangeEncounter target = new ExchangeEncounter(planet, gainDie, loseDie, gainType, lose1Type, lose2Type);
        assertFalse(target.isPlanetEncounter());
        assertEquals(20, target.getGainDie().getNumSides());
        assertEquals(10, target.getLoseDie().getNumSides());
        assertEquals(Resource.FUEL, target.getGainType());
        assertTrue(target.costsTwoResources());
        assertEquals(Resource.WATER, target.getLose1Type());
        assertEquals(Resource.MONEY, target.getLose2Type());
    }

    @Test
    public void gainFoodLoseMoneyAliveTest() {
        boolean planet = true;
        Die gainDie = new D10();
        Die loseDie = new D6();
        Resource gainType = Resource.FOOD;
        Resource loseType = Resource.MONEY;
        ResourcePool resources = new ResourcePool(10, 10, 10, 10, 10, 10);
        ExchangeEncounter target = new ExchangeEncounter(planet, gainDie, loseDie, gainType, loseType);
        boolean alive = target.execute(resources);
        assertTrue(alive);
        int food = resources.getFood();
        assertTrue(food > 10 && food < 21);
        int money = resources.getMoney();
        assertTrue(money < 10 && money > 3);
    }

    @Test
    public void gainWaterLoseOxygenFoodAliveTest() {
        boolean planet = true;
        Die gainDie = new D20();
        Die loseDie = new D6();
        Resource gainType = Resource.WATER;
        Resource lose1Type = Resource.OXYGEN;
        Resource lose2Type = Resource.FOOD;
        ResourcePool resources = new ResourcePool(10, 10, 10, 10, 10, 10);
        ExchangeEncounter target = new ExchangeEncounter(planet, gainDie, loseDie, gainType, lose1Type, lose2Type);
        boolean alive = target.execute(resources);
        assertTrue(alive);
        int water = resources.getWater();
        assertTrue(water > 10 && water < 31);
        int oxygen = resources.getOxygen();
        assertTrue(oxygen < 10 && oxygen > 3);
        int food = resources.getFood();
        assertTrue(food < 10 && food > 3);
    }
}