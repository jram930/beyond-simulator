package com.beyond.simulator;

/**
 * Created by Jared on 2/4/2017.
 */
public class LossEncounter extends Encounter {

    private Resource _lose1Type;

    private Resource _lose2Type;

    private Die _loseDie;

    public LossEncounter(boolean planet, Die loseDie, Resource loseType) {
        super(planet);
        _lose1Type = loseType;
        _lose2Type = null;
        _loseDie = loseDie;
    }

    public LossEncounter(boolean planet, Die loseDie, Resource lose1Type, Resource lose2Type) {
        super(planet);
        _lose1Type = lose1Type;
        _lose2Type = lose2Type;
        _loseDie = loseDie;
    }

    public boolean execute(ResourcePool resources) {

        int lose1Amount = _loseDie.roll();
        int lose2Amount = _loseDie.roll();

        loseResource(_lose1Type, lose1Amount, resources);
        if (_lose2Type != null) {
            loseResource(_lose2Type, lose2Amount, resources);
        }

        return resources.enoughToLive();
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

    public Die getLoseDie() {
        return _loseDie;
    }

    public Resource getLose1Type() {
        return _lose1Type;
    }

    public Resource getLose2Type() {
        return _lose2Type;
    }

    public boolean loseTwoResources() {
        return _lose1Type != null && _lose2Type != null;
    }
}
