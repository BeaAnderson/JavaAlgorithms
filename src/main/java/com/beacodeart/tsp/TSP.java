package com.beacodeart.tsp;

public class TSP {
    public static void main(String[] args) {
        for (int i = 0; i<100; i++){
            TSPCity city = new TSPCity();
            TSPRepo.addCity(city);
        }

        SimulatedAnnealing simulatedAnnealing = new SimulatedAnnealing();

        simulatedAnnealing.simulation();

        System.out.println("final apprx sol: " + simulatedAnnealing.getBest().getDist());
    }
}
