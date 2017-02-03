package com.beyond.simulator;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Jared on 2/1/2017.
 */
public class SpaceTileCollectionTest {

    @Test
    public void constructorTest() {
        SpaceTileCollection target = new SpaceTileCollection();
        assertTrue(target.getStartTile().isStart());
        assertTrue(target.getStopTile().isStop());
        assertEquals(46, target.getDrawPile().size());
    }

    @Test
    public void planetCountTest() {
        SpaceTileCollection target = new SpaceTileCollection();
        int count = 0;
        for (SpaceTile tile : target._drawPile) {
            if (tile.hasPlanet()) {
                count++;
            }
        }
        assertEquals(23, count);
    }

    @Test
    public void stationCountTest() {
        SpaceTileCollection target = new SpaceTileCollection();
        int count = 0;
        for (SpaceTile tile : target._drawPile) {
            if (tile.hasStation()) {
                count++;
            }
        }
        assertEquals(23, count);
    }

    @Test
    public void shipCountTest() {
        SpaceTileCollection target = new SpaceTileCollection();
        int count = 0;
        for (SpaceTile tile : target._drawPile) {
            if (tile.hasShip()) {
                count++;
            }
        }
        assertEquals(16, count);
    }

    @Test
    public void planetShipCountTest() {
        SpaceTileCollection target = new SpaceTileCollection();
        int count = 0;
        for (SpaceTile tile : target._drawPile) {
            if (tile.hasShip() && tile.hasPlanet()) {
                count++;
            }
        }
        assertEquals(8, count);
    }

    @Test
    public void stationShipCountTest() {
        SpaceTileCollection target = new SpaceTileCollection();
        int count = 0;
        for (SpaceTile tile : target._drawPile) {
            if (tile.hasShip() && tile.hasStation()) {
                count++;
            }
        }
        assertEquals(8, count);
    }

    @Test
    public void exit2Test() {
        SpaceTileCollection target = new SpaceTileCollection();
        int count = 0;
        for (SpaceTile tile : target._drawPile) {
            if (!tile.hasTwoExits() && tile.getExit1() == 2) {
                count++;
            }
        }
        assertEquals(3, count);
    }

    @Test
    public void exit3Test() {
        SpaceTileCollection target = new SpaceTileCollection();
        int count = 0;
        for (SpaceTile tile : target._drawPile) {
            if (!tile.hasTwoExits() && tile.getExit1() == 3) {
                count++;
            }
        }
        assertEquals(3, count);
    }

    @Test
    public void exit4Test() {
        SpaceTileCollection target = new SpaceTileCollection();
        int count = 0;
        for (SpaceTile tile : target._drawPile) {
            // This one is 4 because there are two version of the ship straight path
            if (!tile.hasTwoExits() && tile.getExit1() == 4) {
                count++;
            }
        }
        assertEquals(4, count);
    }

    @Test
    public void exit5Test() {
        SpaceTileCollection target = new SpaceTileCollection();
        int count = 0;
        for (SpaceTile tile : target._drawPile) {
            if (!tile.hasTwoExits() && tile.getExit1() == 5) {
                count++;
            }
        }
        assertEquals(3, count);
    }

    @Test
    public void exit6Test() {
        SpaceTileCollection target = new SpaceTileCollection();
        int count = 0;
        for (SpaceTile tile : target._drawPile) {
            if (!tile.hasTwoExits() && tile.getExit1() == 6) {
                count++;
            }
        }
        assertEquals(3, count);
    }

    @Test
    public void exit23Test() {
        SpaceTileCollection target = new SpaceTileCollection();
        int count = 0;
        for (SpaceTile tile : target._drawPile) {
            if (tile.hasTwoExits() && tile.getExit1() == 2 && tile.getExit2() == 3) {
                count++;
            }
        }
        assertEquals(3, count);
    }

    @Test
    public void exit24Test() {
        SpaceTileCollection target = new SpaceTileCollection();
        int count = 0;
        for (SpaceTile tile : target._drawPile) {
            if (tile.hasTwoExits() && tile.getExit1() == 2 && tile.getExit2() == 4) {
                count++;
            }
        }
        assertEquals(3, count);
    }

    @Test
    public void exit25Test() {
        SpaceTileCollection target = new SpaceTileCollection();
        int count = 0;
        for (SpaceTile tile : target._drawPile) {
            if (tile.hasTwoExits() && tile.getExit1() == 2 && tile.getExit2() == 5) {
                count++;
            }
        }
        assertEquals(3, count);
    }

    @Test
    public void exit26Test() {
        SpaceTileCollection target = new SpaceTileCollection();
        int count = 0;
        for (SpaceTile tile : target._drawPile) {
            if (tile.hasTwoExits() && tile.getExit1() == 2 && tile.getExit2() == 6) {
                count++;
            }
        }
        assertEquals(3, count);
    }

    @Test
    public void exit34Test() {
        SpaceTileCollection target = new SpaceTileCollection();
        int count = 0;
        for (SpaceTile tile : target._drawPile) {
            if (tile.hasTwoExits() && tile.getExit1() == 3 && tile.getExit2() == 4) {
                count++;
            }
        }
        assertEquals(3, count);
    }

    @Test
    public void exit35Test() {
        SpaceTileCollection target = new SpaceTileCollection();
        int count = 0;
        for (SpaceTile tile : target._drawPile) {
            if (tile.hasTwoExits() && tile.getExit1() == 3 && tile.getExit2() == 5) {
                count++;
            }
        }
        assertEquals(3, count);
    }

    @Test
    public void exit36Test() {
        SpaceTileCollection target = new SpaceTileCollection();
        int count = 0;
        for (SpaceTile tile : target._drawPile) {
            if (tile.hasTwoExits() && tile.getExit1() == 3 && tile.getExit2() == 6) {
                count++;
            }
        }
        assertEquals(3, count);
    }

    @Test
    public void exit45Test() {
        SpaceTileCollection target = new SpaceTileCollection();
        int count = 0;
        for (SpaceTile tile : target._drawPile) {
            if (tile.hasTwoExits() && tile.getExit1() == 4 && tile.getExit2() == 5) {
                count++;
            }
        }
        assertEquals(3, count);
    }

    @Test
    public void exit46Test() {
        SpaceTileCollection target = new SpaceTileCollection();
        int count = 0;
        for (SpaceTile tile : target._drawPile) {
            if (tile.hasTwoExits() && tile.getExit1() == 4 && tile.getExit2() == 6) {
                count++;
            }
        }
        assertEquals(3, count);
    }

    @Test
    public void exit56Test() {
        SpaceTileCollection target = new SpaceTileCollection();
        int count = 0;
        for (SpaceTile tile : target._drawPile) {
            if (tile.hasTwoExits() && tile.getExit1() == 5 && tile.getExit2() == 6) {
                count++;
            }
        }
        assertEquals(3, count);
    }
}