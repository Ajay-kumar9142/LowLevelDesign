package org.example.lowLevelDesign.creationalDesignPattern.builderDesignPattern.houseDesign;

public class Client {
    public static void main(String[] args) {
        HouseBuilder builder = new HouseBuilderConcrete();

        Director director = new Director(builder);
        House simpleHouse = director.constructSimpleHouse();
        House luxuryHouse = director.constructLuxuryHouse();
        System.out.println("simple House : "+simpleHouse);
        System.out.println("Luxury House : "+luxuryHouse.toString());
    }


}
