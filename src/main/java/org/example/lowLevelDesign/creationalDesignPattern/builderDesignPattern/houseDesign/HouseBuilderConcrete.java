package org.example.lowLevelDesign.creationalDesignPattern.builderDesignPattern.houseDesign;

public class HouseBuilderConcrete implements HouseBuilder{
    House house;

    public HouseBuilderConcrete(){
        house = new House();
    }
    @Override
    public void buildWalls() {
        house.setWalls(5);
    }

    @Override
    public void buildWindows() {
      house.setWindows(10);
    }

    @Override
    public void buildDoors() {
      house.setDoors(8);
    }

    @Override
    public House getHouse() {
       return house;
    }
}
