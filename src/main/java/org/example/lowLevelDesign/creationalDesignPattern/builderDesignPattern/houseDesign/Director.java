package org.example.lowLevelDesign.creationalDesignPattern.builderDesignPattern.houseDesign;

public class Director {
    HouseBuilder houseBuilder;

    public  Director(HouseBuilder houseBuilder){
        this.houseBuilder = houseBuilder;
    }

    public House constructSimpleHouse(){
        houseBuilder.buildDoors();
        houseBuilder.buildWalls();
        return houseBuilder.getHouse();
    }

    public House constructLuxuryHouse(){
        houseBuilder.buildWalls();
        houseBuilder.buildWindows();
        houseBuilder.buildDoors();
        return houseBuilder.getHouse();
    }
}
