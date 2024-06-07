package com.beacodeart.tsp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SingleTour {
    private List<TSPCity> tour = new ArrayList<>();
    private double distance = 0;

    public SingleTour(){
        for (int i = 0; i<TSPRepo.getNumberOfCities(); i++){
            tour.add(null);
        }
    }

    public SingleTour(List<TSPCity> cities){
        List<TSPCity> currentTour = new ArrayList<>(cities.size());

        for(int i=0; i<cities.size();i++){
            currentTour.add(null);
        }


        for(int i=0; i<cities.size();i++){
            currentTour.set(i, cities.get(i));
        }

        this.tour = currentTour;
    }

    public double getDist(){
        if (distance==0){
            int tourDist=0;

            for (int cityIndex = 0; cityIndex<getTourSize(); cityIndex++){
                TSPCity fromCity = getCity(cityIndex);
                TSPCity destCity;

                if(cityIndex+1<getTourSize()){
                    destCity=getCity(cityIndex+1);
                } else {
                    destCity = getCity(0);
                }

                tourDist+=fromCity.distanceTo(destCity);
            }

            this.distance=tourDist;

        }

        return distance;
    }

    public List<TSPCity> getTour() {
        return tour;
    }

    public void generateIndividual(){
        for (int cityIndex = 0; cityIndex<TSPRepo.getNumberOfCities(); cityIndex++){
            setCity(cityIndex, TSPRepo.getCity(cityIndex));
        }
        Collections.shuffle(tour);
    }

    public void setCity(int cityIndex, TSPCity city) {
        this.tour.set(cityIndex, city);
        this.distance = 0;
    }

    public TSPCity getCity(int pos){
        return tour.get(pos);
    }

    public int getTourSize(){
        return this.tour.size();
    }

    @Override
    public String toString() {
        String s = "";

        for (int i=0; i<tour.size(); i++){
            s+=getCity(i) + " ";
        }

        return s;
    }

}
