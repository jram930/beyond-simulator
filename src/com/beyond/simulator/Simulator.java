package com.beyond.simulator;

import java.util.ArrayList;
import java.util.List;

public class Simulator {

    private Board _board;

    private SpaceTileCollection _spaceTiles;

    private EncounterCardCollection _encounterCards;

    public void runSimulation() {
        setUpGame();
    }

    private void setUpGame() {
        try {
            Thread.sleep(1000);
        } catch(Exception e) {}

        _board = new Board();

        try {
            Thread.sleep(1000);
        } catch(Exception e) {}

        _spaceTiles = new SpaceTileCollection();

        try {
            Thread.sleep(1000);
        } catch(Exception e) {}

        _encounterCards = new EncounterCardCollection();
    }
}
