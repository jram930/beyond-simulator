package com.beyond.simulator;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 * Created by Jared on 2/3/2017.
 */
public class EncounterCardCollectionTest {

    @Test
    public void constructorTest() {
        //EncounterCardCollection target = new EncounterCardCollection();
        //

    }

    @Test
    public void helpCreateEncounterCards() {

        List<Integer> goodPlanets = new ArrayList<>();
        List<Integer> goodStations = new ArrayList<>();
        List<Integer> badPlanets = new ArrayList<>();
        List<Integer> badStations = new ArrayList<>();

        int i = 2;
        for (i = 2; i <= 34; i++) {
            goodPlanets.add(i);
        }
        goodPlanets.add(2);
        goodPlanets.add(3);
        goodPlanets.add(4);

        for (i = 35; i <= 52; i++) {
            badPlanets.add(i);
        }
        for (i = 35; i <= 52; i++) {
            badPlanets.add(i);
        }

        for (i = 53; i <= 85; i++) {
            goodStations.add(i);
        }
        goodStations.add(53);
        goodStations.add(54);
        goodStations.add(55);

        for (i = 86; i <= 103; i++) {
            badStations.add(i);
        }
        for (i = 86; i <= 103; i++) {
            badStations.add(i);
        }

        Random random = new Random(new Date().getTime());

        // Generate good cards.
        for (i = 0; i < 36; i++) {
            int goodPlanetIndex = random.nextInt(goodPlanets.size());
            int goodStationIndex = random.nextInt(goodStations.size());
            int goodPlanetRow = goodPlanets.remove(goodPlanetIndex);
            int goodStationRow = goodStations.remove(goodStationIndex);
            System.out.println("Good card, rows " + goodPlanetRow + " and " + goodStationRow);
        }

        System.out.println();

        // Generate bad cards.
        for (i = 0; i < 36; i++) {
            int badPlanetIndex = random.nextInt(badPlanets.size());
            int badStationIndex = random.nextInt(badStations.size());
            int badPlanetsRow = badPlanets.remove(badPlanetIndex);
            int badStationsRow = badStations.remove(badStationIndex);
            System.out.println("Bad card, rows " + badPlanetsRow + " and " + badStationsRow);
        }
    }
}