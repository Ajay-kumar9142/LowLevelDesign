package org.example.lowLevelDesign.structuralDesignPattern.decoratorPattern.coffeeShop;

public class SimpleCoffee implements Coffee{
    @Override
    public String productDesc() {
        return "simple coffee";
    }

    @Override
    public int getCost() {
        return 15;
    }
}
