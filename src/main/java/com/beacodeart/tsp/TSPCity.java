package com.beacodeart.tsp;

public class TSPCity {
    
    private int x;
    private int y;

    public TSPCity(){
        this.x=(int) (Math.random() * 100);
        this.y =(int) (Math.random() * 100);
    }

    public TSPCity(int x, int y){
        this.x=x;
        this.y=y;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public double distanceTo(TSPCity city){
        int xDist = Math.abs(getX()-city.getX());
        int yDist = Math.abs(getY()-city.getY());

        double dist = Math.sqrt((xDist*xDist)+(yDist*yDist));

        return dist;
    }
}
