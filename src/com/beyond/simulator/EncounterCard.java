package com.beyond.simulator;

/**
 * Created by Jared on 2/3/2017.
 */
public class EncounterCard {

    private boolean _isGood;

    private Encounter _planetEncounter;

    private Encounter _stationEncounter;

    public EncounterCard(boolean good, Encounter planetEncounter, Encounter stationEncounter) {
        _isGood = good;
        _planetEncounter = planetEncounter;
        _stationEncounter = stationEncounter;
    }

    public boolean isGood() {
        return _isGood;
    }

    public Encounter getPlanetEncounter() {
        return _planetEncounter;
    }

    public Encounter getStationEncounter() {
        return _stationEncounter;
    }
}
