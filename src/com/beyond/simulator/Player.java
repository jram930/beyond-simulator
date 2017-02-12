package com.beyond.simulator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jared on 2/12/2017.
 */
public class Player {

    private String _name;
    private List<EncounterCard> _encounterCards = new ArrayList<>();
    private List<SpaceTile> _spaceTiles = new ArrayList<>();

    public Player(String name) {
        _name = name;
    }
}
