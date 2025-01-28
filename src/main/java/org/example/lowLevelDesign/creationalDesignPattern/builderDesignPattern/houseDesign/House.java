package org.example.lowLevelDesign.creationalDesignPattern.builderDesignPattern.houseDesign;

public class House {
     int walls;
     int windows;
     int doors;

     public void setWalls(int walls){
         this.walls = walls;
     }

     public void setWindows(int windows){
         this.windows = windows;
     }
     public void setDoors(int doors){
         this.doors = doors;
    }

    @Override
    public String toString() {
        return "House{" +
                "walls=" + walls +
                ", windows=" + windows +
                ", doors=" + doors +
                '}';
    }
}
