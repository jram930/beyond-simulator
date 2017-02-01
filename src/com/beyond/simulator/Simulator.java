package com.beyond.simulator;

import java.util.ArrayList;
import java.util.List;

public class Simulator {

    private Board _board;

    private List<SpaceTile> _spaceTileDrawPile = new ArrayList<>();

    private List<Encounter> _encounterDrawPile = new ArrayList<>();

    public void runSimulation() {
        setUpGame();
    }

    private void setUpGame() {
        _board = new Board();
        createSpaceTiles();
    }

    private void createSpaceTiles() {

    }
}
