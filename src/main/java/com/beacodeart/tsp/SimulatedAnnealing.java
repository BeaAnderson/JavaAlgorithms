package com.beacodeart.tsp;

public class SimulatedAnnealing {
    private SingleTour best;

    public void simulation(){
        double temperature = 10000;
        double coolingrate = 0.03;

        SingleTour currentSolution = new SingleTour();
        currentSolution.generateIndividual();

        System.out.println("individual solution: " + currentSolution.getDist());

        best = new SingleTour(currentSolution.getTour());

        while (temperature>1) {
            SingleTour newSolution = new SingleTour(currentSolution.getTour());

            int randomIndex1 = (int)(newSolution.getTourSize()*Math.random());
            TSPCity city1 = newSolution.getCity(randomIndex1);

            int randomIndex2 = (int)(newSolution.getTourSize()*Math.random());
            TSPCity city2 = newSolution.getCity(randomIndex2);

            newSolution.setCity(randomIndex2, city1);
            newSolution.setCity(randomIndex1, city2);

            double currentEnergy = currentSolution.getDist();
            double neighborEnergy = newSolution.getDist();

            if(acceptanceProbability(currentEnergy, neighborEnergy, temperature)>Math.random()){
                currentSolution=new SingleTour(newSolution.getTour());
            }

            if(currentSolution.getDist()<best.getDist()){
                best = new SingleTour(currentSolution.getTour());
            }

            temperature *= 1-coolingrate; 
        }
    }

    private double acceptanceProbability(double currentEnergy, double neighborEnergy, double temperature) {
        if (neighborEnergy<currentEnergy){
            return 1;
        }
        
        return Math.exp((currentEnergy-neighborEnergy)/temperature);

    }

    public SingleTour getBest() {
        return best;
    }
}
