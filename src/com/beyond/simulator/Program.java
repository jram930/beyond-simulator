package com.beyond.simulator;

/**
 * Created by Jared on 1/31/2017.
 */
public class Program {

    public static void main(String[] args) {
        System.out.println("Running a simulation of the Beyond game...");

        Simulator sim = new Simulator();

        sim.runSimulation();

        System.out.println("Simulation complete!");
    }

}
