package com.beacodeart.tsp;

import java.util.ArrayList;
import java.util.List;

public class TSPRepo {
    private static List<TSPCity> cities = new ArrayList<>();

    public static void addCity(TSPCity city){
        cities.add(city);
    }
    
    public static TSPCity getCity(int index){
        return cities.get(index);
    }

    public static int getNumberOfCities(){
        return cities.size();
    }
}

