package com.beyond.simulator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jared on 2/3/2017.
 */
public class EncounterCardCollection {

    /**
     * The first row of "good planet" encounters in my spreadsheet.
     */
    private static const int GOOD_PLANET = 2;

    /**
     * The first row of "good station" encounters in my spreadsheet.
     */
    private static const int GOOD_STATION = 53;

    private List<EncounterCard> _drawPile = new ArrayList<>();

    /**
     * The following collections are organized according to the spreadsheet I am maintaining in Google Docs so I can
     * make sense of them.
     */
    private Encounter[] _goodPlanetEncounters = new Encounter[33];
    private Encounter[] _goodStationEncounters = new Encounter[33];
    private Encounter[] _badPlanetEncounters = new Encounter[18];
    private Encounter[] _badStationEncounters = new Encounter[18];

    private Die _bigDie = new D10();
    private Die _smallDie = new D6();

    public EncounterCardCollection() {
        generateGoodEncounters();
        generateBadEncounters();
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
        _goodPlanetEncounters[8 - GOOD_PLANET] = new ExchangeEncounter(true, _bigDie, _bigDie, Resource.FOOD, Resource.OXYGEN;
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
        _goodPlanetEncounters[53 - GOOD_STATION] = new GiftEncounter(false, _smallDie, Resource.MONEY);
        _goodPlanetEncounters[54 - GOOD_STATION] = new GiftEncounter(false, _smallDie, Resource.HULL);
        _goodPlanetEncounters[55 - GOOD_STATION] = new GiftEncounter(false, _smallDie, Resource.FUEL);
        _goodPlanetEncounters[56 - GOOD_STATION] = new ExchangeEncounter(false, _bigDie, _bigDie, Resource.MONEY, Resource.OXYGEN);
        _goodPlanetEncounters[57 - GOOD_STATION] = new ExchangeEncounter(false, _bigDie, _bigDie, Resource.MONEY, Resource.FOOD);
        _goodPlanetEncounters[58 - GOOD_STATION] = new ExchangeEncounter(false, _bigDie, _bigDie, Resource.MONEY, Resource.WATER);
        _goodPlanetEncounters[59 - GOOD_STATION] = new ExchangeEncounter(false, _bigDie, _bigDie, Resource.MONEY, Resource.FUEL);
        _goodPlanetEncounters[60 - GOOD_STATION] = new ExchangeEncounter(false, _bigDie, _bigDie, Resource.HULL, Resource.MONEY);
        _goodPlanetEncounters[61 - GOOD_STATION] = new ExchangeEncounter(false, _bigDie, _bigDie, Resource.HULL, Resource.OXYGEN);
        _goodPlanetEncounters[62 - GOOD_STATION] = new ExchangeEncounter(false, _bigDie, _bigDie, Resource.HULL, Resource.FUEL);
        _goodPlanetEncounters[63 - GOOD_STATION] = new ExchangeEncounter(false, _bigDie, _bigDie, Resource.HULL, Resource.FOOD);
        _goodPlanetEncounters[64 - GOOD_STATION] = new ExchangeEncounter(false, _bigDie, _bigDie, Resource.FUEL, Resource.MONEY);
        _goodPlanetEncounters[65 - GOOD_STATION] = new ExchangeEncounter(false, _bigDie, _bigDie, Resource.FUEL, Resource.WATER);
        _goodPlanetEncounters[66 - GOOD_STATION] = new ExchangeEncounter(false, _bigDie, _bigDie, Resource.FUEL, Resource.FOOD);
        _goodPlanetEncounters[67 - GOOD_STATION] = new ExchangeEncounter(false, _bigDie, _bigDie, Resource.FUEL, Resource.OXYGEN);
        _goodPlanetEncounters[68 - GOOD_STATION] = new ExchangeEncounter(false, _bigDie, _smallDie, Resource.MONEY, Resource.OXYGEN, Resource.FOOD);
        _goodPlanetEncounters[69 - GOOD_STATION] = new ExchangeEncounter(false, _bigDie, _smallDie, Resource.MONEY, Resource.OXYGEN, Resource.WATER);
        _goodPlanetEncounters[70 - GOOD_STATION] = new ExchangeEncounter(false, _bigDie, _smallDie, Resource.MONEY, Resource.OXYGEN, Resource.FUEL);
        _goodPlanetEncounters[71 - GOOD_STATION] = new ExchangeEncounter(false, _bigDie, _smallDie, Resource.MONEY, Resource.FOOD, Resource.WATER);
        _goodPlanetEncounters[72 - GOOD_STATION] = new ExchangeEncounter(false, _bigDie, _smallDie, Resource.MONEY, Resource.FOOD, Resource.FUEL);
        _goodPlanetEncounters[73 - GOOD_STATION] = new ExchangeEncounter(false, _bigDie, _smallDie, Resource.MONEY, Resource.FUEL, Resource.WATER);
        _goodPlanetEncounters[74 - GOOD_STATION] = new ExchangeEncounter(false, _bigDie, _smallDie, Resource.HULL, Resource.MONEY, Resource.OXYGEN);
        _goodPlanetEncounters[75 - GOOD_STATION] = new ExchangeEncounter(false, _bigDie, _smallDie, Resource.HULL, Resource.MONEY, Resource.FUEL);
        _goodPlanetEncounters[76 - GOOD_STATION] = new ExchangeEncounter(false, _bigDie, _smallDie, Resource.HULL, Resource.MONEY, Resource.FOOD);
        _goodPlanetEncounters[77 - GOOD_STATION] = new ExchangeEncounter(false, _bigDie, _smallDie, Resource.HULL, Resource.OXYGEN, Resource.FUEL);
        _goodPlanetEncounters[78 - GOOD_STATION] = new ExchangeEncounter(false, _bigDie, _smallDie, Resource.HULL, Resource.OXYGEN, Resource.FOOD);
        _goodPlanetEncounters[79 - GOOD_STATION] = new ExchangeEncounter(false, _bigDie, _smallDie, Resource.HULL, Resource.FUEL, Resource.FOOD);
        _goodPlanetEncounters[80 - GOOD_STATION] = new ExchangeEncounter(false, _bigDie, _smallDie, Resource.FUEL, Resource.MONEY, Resource.FOOD);
        _goodPlanetEncounters[81 - GOOD_STATION] = new ExchangeEncounter(false, _bigDie, _smallDie, Resource.FUEL, Resource.MONEY, Resource.WATER);
        _goodPlanetEncounters[82 - GOOD_STATION] = new ExchangeEncounter(false, _bigDie, _smallDie, Resource.FUEL, Resource.MONEY, Resource.OXYGEN);
        _goodPlanetEncounters[83 - GOOD_STATION] = new ExchangeEncounter(false, _bigDie, _smallDie, Resource.FUEL, Resource.WATER, Resource.FOOD);
        _goodPlanetEncounters[84 - GOOD_STATION] = new ExchangeEncounter(false, _bigDie, _smallDie, Resource.FUEL, Resource.WATER, Resource.OXYGEN);
        _goodPlanetEncounters[85 - GOOD_STATION] = new ExchangeEncounter(false, _bigDie, _smallDie, Resource.FUEL, Resource.OXYGEN, Resource.FOOD);
    }

    private void generateBadEncounters() {

    }

    public List<EncounterCard> getDrawPile() {
        return _drawPile;
    }
}
