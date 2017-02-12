package com.beyond.simulator;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 * Created by Jared on 2/3/2017.
 */
public class EncounterCardCollection {

    /**
     * The first row of "good planet" encounters in my spreadsheet.
     */
    private static final int GOOD_PLANET = 2;

    /**
     * The first row of "good station" encounters in my spreadsheet.
     */
    private static final int GOOD_STATION = 53;

    /**
     * The first row of "bad planet" encounters in my spreadsheet.
     */
    private static final int BAD_PLANET = 35;

    /**
     * The first row of "bad station" encounters in my spreadsheet.
     */
    private static final int BAD_STATION = 86;

    private List<EncounterCard> _drawPile = new ArrayList<>();

    /**
     * The following collections are organized according to the spreadsheet I am maintaining in Google Docs so I can
     * make sense of them.
     */
    private Encounter[] _goodPlanetEncounters = new Encounter[33];
    private Encounter[] _goodStationEncounters = new Encounter[33];
    private Encounter[] _badPlanetEncounters = new Encounter[18];
    private Encounter[] _badStationEncounters = new Encounter[18];

    private List<Integer> _goodPlanetRows = new ArrayList<>();
    private List<Integer> _goodStationRows = new ArrayList<>();
    private List<Integer> _badPlanetRows = new ArrayList<>();
    private List<Integer> _badStationRows = new ArrayList<>();

    private Die _bigDie = new D10();
    private Die _smallDie = new D6();

    private static Random _random = new Random(new Date().getTime());

    public EncounterCardCollection() {
        generateEncounters();
        generateEncounterCards();
    }

    private void generateEncounters() {
        generateGoodEncounters();
        generateBadEncounters();
    }

    private void generateEncounterCards() {
        buildEncounterLookUp();
        generateGoodCards();
        generateBadCards();
    }

    private void generateGoodCards() {
        for (int i = 0; i < 36; i++) {
            int goodPlanetIndex = _random.nextInt(_goodPlanetRows.size());
            int goodStationIndex = _random.nextInt(_goodStationRows.size());
            int goodPlanetRow = _goodPlanetRows.remove(goodPlanetIndex);
            int goodStationRow = _goodStationRows.remove(goodStationIndex);
            _drawPile.add(new EncounterCard(true, _goodPlanetEncounters[goodPlanetRow - GOOD_PLANET], _goodStationEncounters[goodStationRow - GOOD_STATION]));
        }
    }

    private void generateBadCards() {
        for (int i = 0; i < 36; i++) {
            int badPlanetIndex = _random.nextInt(_badPlanetRows.size());
            int badStationIndex = _random.nextInt(_badStationRows.size());
            int badPlanetsRow = _badPlanetRows.remove(badPlanetIndex);
            int badStationsRow = _badStationRows.remove(badStationIndex);
            _drawPile.add(new EncounterCard(false, _badPlanetEncounters[badPlanetsRow - BAD_PLANET], _badStationEncounters[badStationsRow - BAD_STATION]));
        }
    }

    private void buildEncounterLookUp() {

        int i = 2;
        for (i = 2; i <= 34; i++) {
            _goodPlanetRows.add(i);
        }
        _goodPlanetRows.add(2);
        _goodPlanetRows.add(3);
        _goodPlanetRows.add(4);

        for (i = 35; i <= 52; i++) {
            _badPlanetRows.add(i);
        }
        for (i = 35; i <= 52; i++) {
            _badPlanetRows.add(i);
        }

        for (i = 53; i <= 85; i++) {
            _goodStationRows.add(i);
        }
        _goodStationRows.add(53);
        _goodStationRows.add(54);
        _goodStationRows.add(55);

        for (i = 86; i <= 103; i++) {
            _badStationRows.add(i);
        }
        for (i = 86; i <= 103; i++) {
            _badStationRows.add(i);
        }
    }

    private void generateGoodEncounters() {
        generateGoodPlanetEncounters();
        generateGoodStationEncounters();
    }

    private void generateGoodPlanetEncounters() {
        _goodPlanetEncounters[2 - GOOD_PLANET] = new GiftEncounter(true, _smallDie, Resource.FOOD);
        _goodPlanetEncounters[3 - GOOD_PLANET] = new GiftEncounter(true, _smallDie, Resource.WATER);
        _goodPlanetEncounters[4 - GOOD_PLANET] = new GiftEncounter(true, _smallDie, Resource.OXYGEN);
        _goodPlanetEncounters[5 - GOOD_PLANET] = new ExchangeEncounter(true, _bigDie, _bigDie, Resource.FOOD, Resource.FUEL);
        _goodPlanetEncounters[6 - GOOD_PLANET] = new ExchangeEncounter(true, _bigDie, _bigDie, Resource.FOOD, Resource.MONEY);
        _goodPlanetEncounters[7 - GOOD_PLANET] = new ExchangeEncounter(true, _bigDie, _bigDie, Resource.FOOD, Resource.WATER);
        _goodPlanetEncounters[8 - GOOD_PLANET] = new ExchangeEncounter(true, _bigDie, _bigDie, Resource.FOOD, Resource.OXYGEN);
        _goodPlanetEncounters[9 - GOOD_PLANET] = new ExchangeEncounter(true, _bigDie, _bigDie, Resource.WATER, Resource.FOOD);
        _goodPlanetEncounters[10 - GOOD_PLANET] = new ExchangeEncounter(true, _bigDie, _bigDie, Resource.WATER, Resource.FUEL);
        _goodPlanetEncounters[11 - GOOD_PLANET] = new ExchangeEncounter(true, _bigDie, _bigDie, Resource.WATER, Resource.OXYGEN);
        _goodPlanetEncounters[12 - GOOD_PLANET] = new ExchangeEncounter(true, _bigDie, _bigDie, Resource.WATER, Resource.MONEY);
        _goodPlanetEncounters[13 - GOOD_PLANET] = new ExchangeEncounter(true, _bigDie, _bigDie, Resource.OXYGEN, Resource.FOOD);
        _goodPlanetEncounters[14 - GOOD_PLANET] = new ExchangeEncounter(true, _bigDie, _bigDie, Resource.OXYGEN, Resource.WATER);
        _goodPlanetEncounters[15 - GOOD_PLANET] = new ExchangeEncounter(true, _bigDie, _bigDie, Resource.OXYGEN, Resource.MONEY);
        _goodPlanetEncounters[16 - GOOD_PLANET] = new ExchangeEncounter(true, _bigDie, _bigDie, Resource.OXYGEN, Resource.FUEL);
        _goodPlanetEncounters[17 - GOOD_PLANET] = new ExchangeEncounter(true, _bigDie, _smallDie, Resource.FOOD, Resource.FUEL, Resource.MONEY);
        _goodPlanetEncounters[18 - GOOD_PLANET] = new ExchangeEncounter(true, _bigDie, _smallDie, Resource.FOOD, Resource.FUEL, Resource.WATER);
        _goodPlanetEncounters[19 - GOOD_PLANET] = new ExchangeEncounter(true, _bigDie, _smallDie, Resource.FOOD, Resource.FUEL, Resource.OXYGEN);
        _goodPlanetEncounters[20 - GOOD_PLANET] = new ExchangeEncounter(true, _bigDie, _smallDie, Resource.FOOD, Resource.MONEY, Resource.WATER);
        _goodPlanetEncounters[21 - GOOD_PLANET] = new ExchangeEncounter(true, _bigDie, _smallDie, Resource.FOOD, Resource.MONEY, Resource.OXYGEN);
        _goodPlanetEncounters[22 - GOOD_PLANET] = new ExchangeEncounter(true, _bigDie, _smallDie, Resource.FOOD, Resource.OXYGEN, Resource.WATER);
        _goodPlanetEncounters[23 - GOOD_PLANET] = new ExchangeEncounter(true, _bigDie, _smallDie, Resource.WATER, Resource.FOOD, Resource.FUEL);
        _goodPlanetEncounters[24 - GOOD_PLANET] = new ExchangeEncounter(true, _bigDie, _smallDie, Resource.WATER, Resource.FOOD, Resource.OXYGEN);
        _goodPlanetEncounters[25 - GOOD_PLANET] = new ExchangeEncounter(true, _bigDie, _smallDie, Resource.WATER, Resource.FOOD, Resource.MONEY);
        _goodPlanetEncounters[26 - GOOD_PLANET] = new ExchangeEncounter(true, _bigDie, _smallDie, Resource.WATER, Resource.FUEL, Resource.OXYGEN);
        _goodPlanetEncounters[27 - GOOD_PLANET] = new ExchangeEncounter(true, _bigDie, _smallDie, Resource.WATER, Resource.FUEL, Resource.MONEY);
        _goodPlanetEncounters[28 - GOOD_PLANET] = new ExchangeEncounter(true, _bigDie, _smallDie, Resource.WATER, Resource.OXYGEN, Resource.MONEY);
        _goodPlanetEncounters[29 - GOOD_PLANET] = new ExchangeEncounter(true, _bigDie, _smallDie, Resource.OXYGEN, Resource.FOOD, Resource.MONEY);
        _goodPlanetEncounters[30 - GOOD_PLANET] = new ExchangeEncounter(true, _bigDie, _smallDie, Resource.OXYGEN, Resource.FOOD, Resource.WATER);
        _goodPlanetEncounters[31 - GOOD_PLANET] = new ExchangeEncounter(true, _bigDie, _smallDie, Resource.OXYGEN, Resource.FOOD, Resource.FUEL);
        _goodPlanetEncounters[32 - GOOD_PLANET] = new ExchangeEncounter(true, _bigDie, _smallDie, Resource.OXYGEN, Resource.WATER, Resource.MONEY);
        _goodPlanetEncounters[33 - GOOD_PLANET] = new ExchangeEncounter(true, _bigDie, _smallDie, Resource.OXYGEN, Resource.WATER, Resource.FUEL);
        _goodPlanetEncounters[34 - GOOD_PLANET] = new ExchangeEncounter(true, _bigDie, _smallDie, Resource.OXYGEN, Resource.FUEL, Resource.MONEY);
    }

    private void generateGoodStationEncounters() {
        _goodStationEncounters[53 - GOOD_STATION] = new GiftEncounter(false, _smallDie, Resource.MONEY);
        _goodStationEncounters[54 - GOOD_STATION] = new GiftEncounter(false, _smallDie, Resource.HULL);
        _goodStationEncounters[55 - GOOD_STATION] = new GiftEncounter(false, _smallDie, Resource.FUEL);
        _goodStationEncounters[56 - GOOD_STATION] = new ExchangeEncounter(false, _bigDie, _bigDie, Resource.MONEY, Resource.OXYGEN);
        _goodStationEncounters[57 - GOOD_STATION] = new ExchangeEncounter(false, _bigDie, _bigDie, Resource.MONEY, Resource.FOOD);
        _goodStationEncounters[58 - GOOD_STATION] = new ExchangeEncounter(false, _bigDie, _bigDie, Resource.MONEY, Resource.WATER);
        _goodStationEncounters[59 - GOOD_STATION] = new ExchangeEncounter(false, _bigDie, _bigDie, Resource.MONEY, Resource.FUEL);
        _goodStationEncounters[60 - GOOD_STATION] = new ExchangeEncounter(false, _bigDie, _bigDie, Resource.HULL, Resource.MONEY);
        _goodStationEncounters[61 - GOOD_STATION] = new ExchangeEncounter(false, _bigDie, _bigDie, Resource.HULL, Resource.OXYGEN);
        _goodStationEncounters[62 - GOOD_STATION] = new ExchangeEncounter(false, _bigDie, _bigDie, Resource.HULL, Resource.FUEL);
        _goodStationEncounters[63 - GOOD_STATION] = new ExchangeEncounter(false, _bigDie, _bigDie, Resource.HULL, Resource.FOOD);
        _goodStationEncounters[64 - GOOD_STATION] = new ExchangeEncounter(false, _bigDie, _bigDie, Resource.FUEL, Resource.MONEY);
        _goodStationEncounters[65 - GOOD_STATION] = new ExchangeEncounter(false, _bigDie, _bigDie, Resource.FUEL, Resource.WATER);
        _goodStationEncounters[66 - GOOD_STATION] = new ExchangeEncounter(false, _bigDie, _bigDie, Resource.FUEL, Resource.FOOD);
        _goodStationEncounters[67 - GOOD_STATION] = new ExchangeEncounter(false, _bigDie, _bigDie, Resource.FUEL, Resource.OXYGEN);
        _goodStationEncounters[68 - GOOD_STATION] = new ExchangeEncounter(false, _bigDie, _smallDie, Resource.MONEY, Resource.OXYGEN, Resource.FOOD);
        _goodStationEncounters[69 - GOOD_STATION] = new ExchangeEncounter(false, _bigDie, _smallDie, Resource.MONEY, Resource.OXYGEN, Resource.WATER);
        _goodStationEncounters[70 - GOOD_STATION] = new ExchangeEncounter(false, _bigDie, _smallDie, Resource.MONEY, Resource.OXYGEN, Resource.FUEL);
        _goodStationEncounters[71 - GOOD_STATION] = new ExchangeEncounter(false, _bigDie, _smallDie, Resource.MONEY, Resource.FOOD, Resource.WATER);
        _goodStationEncounters[72 - GOOD_STATION] = new ExchangeEncounter(false, _bigDie, _smallDie, Resource.MONEY, Resource.FOOD, Resource.FUEL);
        _goodStationEncounters[73 - GOOD_STATION] = new ExchangeEncounter(false, _bigDie, _smallDie, Resource.MONEY, Resource.FUEL, Resource.WATER);
        _goodStationEncounters[74 - GOOD_STATION] = new ExchangeEncounter(false, _bigDie, _smallDie, Resource.HULL, Resource.MONEY, Resource.OXYGEN);
        _goodStationEncounters[75 - GOOD_STATION] = new ExchangeEncounter(false, _bigDie, _smallDie, Resource.HULL, Resource.MONEY, Resource.FUEL);
        _goodStationEncounters[76 - GOOD_STATION] = new ExchangeEncounter(false, _bigDie, _smallDie, Resource.HULL, Resource.MONEY, Resource.FOOD);
        _goodStationEncounters[77 - GOOD_STATION] = new ExchangeEncounter(false, _bigDie, _smallDie, Resource.HULL, Resource.OXYGEN, Resource.FUEL);
        _goodStationEncounters[78 - GOOD_STATION] = new ExchangeEncounter(false, _bigDie, _smallDie, Resource.HULL, Resource.OXYGEN, Resource.FOOD);
        _goodStationEncounters[79 - GOOD_STATION] = new ExchangeEncounter(false, _bigDie, _smallDie, Resource.HULL, Resource.FUEL, Resource.FOOD);
        _goodStationEncounters[80 - GOOD_STATION] = new ExchangeEncounter(false, _bigDie, _smallDie, Resource.FUEL, Resource.MONEY, Resource.FOOD);
        _goodStationEncounters[81 - GOOD_STATION] = new ExchangeEncounter(false, _bigDie, _smallDie, Resource.FUEL, Resource.MONEY, Resource.WATER);
        _goodStationEncounters[82 - GOOD_STATION] = new ExchangeEncounter(false, _bigDie, _smallDie, Resource.FUEL, Resource.MONEY, Resource.OXYGEN);
        _goodStationEncounters[83 - GOOD_STATION] = new ExchangeEncounter(false, _bigDie, _smallDie, Resource.FUEL, Resource.WATER, Resource.FOOD);
        _goodStationEncounters[84 - GOOD_STATION] = new ExchangeEncounter(false, _bigDie, _smallDie, Resource.FUEL, Resource.WATER, Resource.OXYGEN);
        _goodStationEncounters[85 - GOOD_STATION] = new ExchangeEncounter(false, _bigDie, _smallDie, Resource.FUEL, Resource.OXYGEN, Resource.FOOD);
    }

    private void generateBadEncounters() {
        generateBadPlanetEncounters();
        generateBadStationEncounters();
    }

    private void generateBadPlanetEncounters() {
        _badPlanetEncounters[35 - BAD_PLANET] = new LossEncounter(true, _bigDie, Resource.FOOD);
        _badPlanetEncounters[36 - BAD_PLANET] = new LossEncounter(true, _bigDie, Resource.WATER);
        _badPlanetEncounters[37 - BAD_PLANET] = new LossEncounter(true, _bigDie, Resource.OXYGEN);
        _badPlanetEncounters[38 - BAD_PLANET] = new LossEncounter(true, _bigDie, Resource.MONEY);
        _badPlanetEncounters[39 - BAD_PLANET] = new LossEncounter(true, _bigDie, Resource.FUEL);
        _badPlanetEncounters[40 - BAD_PLANET] = new LossEncounter(true, _smallDie, Resource.FOOD, Resource.WATER);
        _badPlanetEncounters[41 - BAD_PLANET] = new LossEncounter(true, _smallDie, Resource.FOOD, Resource.OXYGEN);
        _badPlanetEncounters[42 - BAD_PLANET] = new LossEncounter(true, _smallDie, Resource.FOOD, Resource.FUEL);
        _badPlanetEncounters[43 - BAD_PLANET] = new LossEncounter(true, _smallDie, Resource.FOOD, Resource.MONEY);
        _badPlanetEncounters[44 - BAD_PLANET] = new LossEncounter(true, _smallDie, Resource.WATER, Resource.OXYGEN);
        _badPlanetEncounters[45 - BAD_PLANET] = new LossEncounter(true, _smallDie, Resource.WATER, Resource.MONEY);
        _badPlanetEncounters[46 - BAD_PLANET] = new LossEncounter(true, _smallDie, Resource.WATER, Resource.FUEL);
        _badPlanetEncounters[47 - BAD_PLANET] = new LossEncounter(true, _smallDie, Resource.FUEL, Resource.OXYGEN);
        _badPlanetEncounters[48 - BAD_PLANET] = new LossEncounter(true, _smallDie, Resource.FUEL, Resource.MONEY);
        _badPlanetEncounters[49 - BAD_PLANET] = new LossEncounter(true, _smallDie, Resource.OXYGEN, Resource.MONEY);
        _badPlanetEncounters[50 - BAD_PLANET] = new LossEncounter(true, _bigDie, Resource.HULL);
        _badPlanetEncounters[51 - BAD_PLANET] = new LossEncounter(true, _smallDie, Resource.HULL, Resource.OXYGEN);
        _badPlanetEncounters[52 - BAD_PLANET] = new LossEncounter(true, _smallDie, Resource.HULL, Resource.FUEL);
    }

    private void generateBadStationEncounters() {
        _badStationEncounters[86 - BAD_STATION] = new LossEncounter(false, _bigDie, Resource.FOOD);
        _badStationEncounters[87 - BAD_STATION] = new LossEncounter(false, _bigDie, Resource.WATER);
        _badStationEncounters[88 - BAD_STATION] = new LossEncounter(false, _bigDie, Resource.OXYGEN);
        _badStationEncounters[89 - BAD_STATION] = new LossEncounter(false, _bigDie, Resource.MONEY);
        _badStationEncounters[90 - BAD_STATION] = new LossEncounter(false, _bigDie, Resource.FUEL);
        _badStationEncounters[91 - BAD_STATION] = new LossEncounter(false, _smallDie, Resource.FOOD, Resource.WATER);
        _badStationEncounters[92 - BAD_STATION] = new LossEncounter(false, _smallDie, Resource.FOOD, Resource.OXYGEN);
        _badStationEncounters[93 - BAD_STATION] = new LossEncounter(false, _smallDie, Resource.FOOD, Resource.FUEL);
        _badStationEncounters[94 - BAD_STATION] = new LossEncounter(false, _smallDie, Resource.FOOD, Resource.MONEY);
        _badStationEncounters[95 - BAD_STATION] = new LossEncounter(false, _smallDie, Resource.WATER, Resource.OXYGEN);
        _badStationEncounters[96 - BAD_STATION] = new LossEncounter(false, _smallDie, Resource.WATER, Resource.MONEY);
        _badStationEncounters[97 - BAD_STATION] = new LossEncounter(false, _smallDie, Resource.WATER, Resource.FUEL);
        _badStationEncounters[98 - BAD_STATION] = new LossEncounter(false, _smallDie, Resource.FUEL, Resource.OXYGEN);
        _badStationEncounters[99 - BAD_STATION] = new LossEncounter(false, _smallDie, Resource.FUEL, Resource.MONEY);
        _badStationEncounters[100 - BAD_STATION] = new LossEncounter(false, _smallDie, Resource.OXYGEN, Resource.MONEY);
        _badStationEncounters[101 - BAD_STATION] = new LossEncounter(false, _bigDie, Resource.HULL);
        _badStationEncounters[102 - BAD_STATION] = new LossEncounter(false, _smallDie, Resource.HULL, Resource.OXYGEN);
        _badStationEncounters[103 - BAD_STATION] = new LossEncounter(false, _smallDie, Resource.HULL, Resource.FUEL);
    }

    public List<EncounterCard> getDrawPile() {
        return _drawPile;
    }

    public EncounterCard drawCard() {
        return _drawPile.remove(_random.nextInt(_drawPile.size()));
    }

}
