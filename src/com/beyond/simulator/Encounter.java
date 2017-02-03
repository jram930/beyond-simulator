package com.beyond.simulator;

/**
 * Created by Jared on 1/31/2017.
 */
public abstract class Encounter {

    protected boolean _planetEncounter;

    protected Encounter(boolean planetEncounter) {
        _planetEncounter = planetEncounter;
    }

    public boolean isPlanetEncounter() {
        return _planetEncounter;
    }

    /**
     * Executes the encounter on the resouce pool.
     * @param pool the resource pool
     * @return true if the crew still has enough resources to live, false if not
     */
    public abstract boolean execute(ResourcePool pool);
}
