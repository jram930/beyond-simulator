package com.beyond.simulator;

import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import static org.junit.Assert.*;

/**
 * Created by Jared on 2/3/2017.
 */
public class EncounterCardCollectionTest {

    @Test
    public void generateCardsCountsTest() {
        EncounterCardCollection target = new EncounterCardCollection();
        assertEquals(72, target.getDrawPile().size());
        int goodCount = 0;
        int badCount = 0;
        for (EncounterCard card : target.getDrawPile()) {

            if (card.isGood()) {
                goodCount++;
            } else {
                badCount++;
            }
        }
        assertEquals(36, goodCount);
        assertEquals(36, badCount);
    }

    @Test
    public void drawCardTest() {
        EncounterCardCollection target = new EncounterCardCollection();
        int counter = 0;
        while(target.getDrawPile().size() > 0) {
            EncounterCard card = target.drawCard();
            counter++;
        }
        assertEquals(72, counter);
    }
}