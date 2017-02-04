package com.beyond.simulator;

/**
 * Created by Jared on 2/4/2017.
 */
public class GiftEncounter extends Encounter {

    private Resource _gainType;

    private Die _gainDie;

    public GiftEncounter(boolean planet, Die gainDie, Resource gainType) {
        super(planet);
        _gainType = gainType;
        _gainDie = gainDie;
    }

    public boolean execute(ResourcePool resources) {

        int gainAmount = _gainDie.roll();
        gainResource(gainAmount, resources);

        return resources.enoughToLive();
    }

    private void gainResource(int gainAmount, ResourcePool resources) {
        switch (_gainType) {
            case HULL:
                resources.increaseHull(gainAmount);
                break;
            case FUEL:
                resources.increaseFuel(gainAmount);
                break;
            case MONEY:
                resources.increaseMoney(gainAmount);
                break;
            case FOOD:
                resources.increaseFood(gainAmount);
                break;
            case WATER:
                resources.increaseWater(gainAmount);
                break;
            case OXYGEN:
                resources.increaseOxygen(gainAmount);
                break;
        }
    }

    public Die getGainDie() {
        return _gainDie;
    }

    public Resource getGainType() {
        return _gainType;
    }
}
