package com.beyond.simulator;

/**
 * Created by Jared on 2/3/2017.
 */
public class ResourcePool {

    private int _hull;

    private int _fuel;

    private int _money;

    private int _food;

    private int _water;

    private int _oxygen;

    public ResourcePool(int hull, int fuel, int money, int food, int water, int oxygen) {
        _hull = hull;
        _fuel = fuel;
        _money = money;
        _food = food;
        _water = water;
        _oxygen = oxygen;
    }

    public int getHull() {
        return _hull;
    }

    public int getFuel() {
        return _fuel;
    }

    public int getMoney() {
        return _money;
    }

    public int getFood() {
        return _food;
    }

    public int getWater() {
        return _water;
    }

    public int getOxygen() {
        return _oxygen;
    }

    public int increaseHull(int n) {
        _hull += n;
        return _hull;
    }

    public int decreaseHull(int n) {
        _hull -= n;
        return _hull;
    }

    public int increaseFuel(int n) {
        _fuel += n;
        return _fuel;
    }

    public int decreaseFuel(int n) {
        _fuel -= n;
        return _fuel;
    }

    public int increaseMoney(int n) {
        _money = _money + n;
        return _money;
    }

    public int decreaseMoney(int n) {
        _money = _money - n;
        return _money;
    }

    public int increaseFood(int n) {
        _food = _food + n;
        return _food;
    }

    public int decreaseFood(int n) {
        _food = _food - n;
        return _food;
    }

    public int increaseWater(int n) {
        _water += n;
        return _water;
    }

    public int decreaseWater(int n) {
        _water -= n;
        return _water;
    }

    public int increaseOxygen(int n) {
        _oxygen += n;
        return _oxygen;
    }

    public int decreaseOxygen(int n) {
        _oxygen -= n;
        return _oxygen;
    }

    public boolean enoughToLive() {
        // Money is not necessary to survive.
        return _food > 0 && _water > 0 && _oxygen > 0 && _fuel > 0 && _hull > 0;
    }
}
