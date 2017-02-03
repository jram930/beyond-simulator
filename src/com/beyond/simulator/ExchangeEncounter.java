package com.beyond.simulator;

/**
 * Created by Jared on 2/3/2017.
 */
public class ExchangeEncounter extends Encounter {

    private Resource _gainType;

    private Resource _lose1Type;

    private Resource _lose2Type;

    private Die _gainDie;

    private Die _loseDie;

    public ExchangeEncounter(boolean planet, Die gainDie, Die loseDie, Resource gainType, Resource loseType) {
        super(planet);
        _gainType = gainType;
        _lose1Type = loseType;
        _lose2Type = null;
        _gainDie = gainDie;
        _loseDie = loseDie;
    }

    public ExchangeEncounter(boolean planet, Die gainDie, Die loseDie, Resource gainType, Resource lose1Type, Resource lose2Type) {
        super(planet);
        _gainType = gainType;
        _lose1Type = lose1Type;
        _lose2Type = lose2Type;
        _gainDie = gainDie;
        _loseDie = loseDie;
    }

    public boolean execute(ResourcePool resources) {

        int gainAmount = _gainDie.roll();
        int lose1Amount = _loseDie.roll();
        int lose2Amount = _loseDie.roll();

        gainResource(gainAmount, resources);
        loseResource(_lose1Type, lose1Amount, resources);
        if (_lose2Type != null) {
            loseResource(_lose2Type, lose2Amount, resources);
        }

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

    private void loseResource(Resource type, int loseAmount, ResourcePool resources) {
        switch (type) {
            case HULL:
                resources.decreaseHull(loseAmount);
                break;
            case FUEL:
                resources.decreaseFuel(loseAmount);
                break;
            case MONEY:
                resources.decreaseMoney(loseAmount);
                break;
            case FOOD:
                resources.decreaseFood(loseAmount);
                break;
            case WATER:
                resources.decreaseWater(loseAmount);
                break;
            case OXYGEN:
                resources.decreaseOxygen(loseAmount);
                break;
        }
    }

    public Die getGainDie() {
        return _gainDie;
    }

    public Die getLoseDie() {
        return _loseDie;
    }

    public Resource getGainType() {
        return _gainType;
    }

    public Resource getLose1Type() {
        return _lose1Type;
    }

    public Resource getLose2Type() {
        return _lose2Type;
    }

    public boolean costsTwoResources() {
        return _lose1Type != null && _lose2Type != null;
    }
}
