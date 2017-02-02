package com.beyond.simulator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jared on 2/1/2017.
 */
public class SpaceTileCollection {

    List<SpaceTile> _drawPile = new ArrayList<>();

    SpaceTile _startTile;

    SpaceTile _stopTile;

    public SpaceTileCollection() {
        generatePlanetOnlyTiles();
        generateStationOnlyTiles();
        generateShipTiles();
        generateStartTiles();
        generateStopTiles();
    }

    private void generatePlanetOnlyTiles() {
        _drawPile.add(new SpaceTile(true, false, false, 2));
        _drawPile.add(new SpaceTile(true, false, false, 3));
        _drawPile.add(new SpaceTile(true, false, false, 4));
        _drawPile.add(new SpaceTile(true, false, false, 5));
        _drawPile.add(new SpaceTile(true, false, false, 6));
        _drawPile.add(new SpaceTile(true, false, false, 2, 3));
        _drawPile.add(new SpaceTile(true, false, false, 2, 4));
        _drawPile.add(new SpaceTile(true, false, false, 2, 5));
        _drawPile.add(new SpaceTile(true, false, false, 2, 6));
        _drawPile.add(new SpaceTile(true, false, false, 3, 4));
        _drawPile.add(new SpaceTile(true, false, false, 3, 5));
        _drawPile.add(new SpaceTile(true, false, false, 3, 6));
        _drawPile.add(new SpaceTile(true, false, false, 4, 5));
        _drawPile.add(new SpaceTile(true, false, false, 4, 6));
        _drawPile.add(new SpaceTile(true, false, false, 5, 6));
    }

    private void generateStationOnlyTiles() {
        _drawPile.add(new SpaceTile(false, true, false, 2));
        _drawPile.add(new SpaceTile(false, true, false, 3));
        _drawPile.add(new SpaceTile(false, true, false, 4));
        _drawPile.add(new SpaceTile(false, true, false, 5));
        _drawPile.add(new SpaceTile(false, true, false, 6));
        _drawPile.add(new SpaceTile(false, true, false, 2, 3));
        _drawPile.add(new SpaceTile(false, true, false, 2, 4));
        _drawPile.add(new SpaceTile(false, true, false, 2, 5));
        _drawPile.add(new SpaceTile(false, true, false, 2, 6));
        _drawPile.add(new SpaceTile(false, true, false, 3, 4));
        _drawPile.add(new SpaceTile(false, true, false, 3, 5));
        _drawPile.add(new SpaceTile(false, true, false, 3, 6));
        _drawPile.add(new SpaceTile(false, true, false, 4, 5));
        _drawPile.add(new SpaceTile(false, true, false, 4, 6));
        _drawPile.add(new SpaceTile(false, true, false, 5, 6));
    }

    private void generateShipTiles() {
        _drawPile.add(new SpaceTile(true, false, true, 2));
        _drawPile.add(new SpaceTile(false, true, true, 3));
        _drawPile.add(new SpaceTile(true, false, true, 4));
        _drawPile.add(new SpaceTile(false, true, true, 4));
        _drawPile.add(new SpaceTile(true, false, true, 5));
        _drawPile.add(new SpaceTile(false, true, true, 6));
        _drawPile.add(new SpaceTile(true, false, true, 2, 3));
        _drawPile.add(new SpaceTile(false, true, true, 2, 4));
        _drawPile.add(new SpaceTile(true, false, true, 2, 5));
        _drawPile.add(new SpaceTile(false, true, true, 2, 6));
        _drawPile.add(new SpaceTile(true, false, true, 3, 4));
        _drawPile.add(new SpaceTile(false, true, true, 3, 5));
        _drawPile.add(new SpaceTile(true, false, true, 3, 6));
        _drawPile.add(new SpaceTile(false, true, true, 4, 5));
        _drawPile.add(new SpaceTile(true, false, true, 4, 6));
        _drawPile.add(new SpaceTile(false, true, true, 5, 6));
    }

    private void generateStartTiles() {
        _startTile = new SpaceTile(true);
    }

    private void generateStopTiles() {
        _stopTile = new SpaceTile(false);
    }

    public SpaceTile getStartTile() {
        return _startTile;
    }

    public SpaceTile getStopTile() {
        return _stopTile;
    }

    public List<SpaceTile> getDrawPile() {
        return _drawPile;
    }
}
