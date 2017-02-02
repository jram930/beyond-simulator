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
}