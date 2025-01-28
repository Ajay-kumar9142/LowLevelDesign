package org.example.lowLevelDesign.creationalDesignPattern.builderDesignPattern.houseDesign;

public interface HouseBuilder {
    public void buildWalls();
    public  void  buildWindows();
    public void  buildDoors();
    public House getHouse();
}
