package com.beyond.simulator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jared on 2/3/2017.
 */
public class EncounterCardCollection {

    List<EncounterCard> _drawPile = new ArrayList<>();

    public EncounterCardCollection() {
        generateGoodEncounters();
        generateBadEncounters();
    }

    private void generateGoodEncounters() {

    }

    private void generateBadEncounters() {

    }

    public List<EncounterCard> getDrawPile() {
        return _drawPile;
    }
}
