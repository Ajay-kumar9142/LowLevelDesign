package org.example.lowLevelDesign.structuralDesignPattern.decoratorPattern.coffeeShop;

public class SugarDecorator extends CoffeeDecorator{
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String productDesc() {
        return coffee.productDesc()+", sugar";
    }

    @Override
    public int getCost() {
        return coffee.getCost()+5;
    }
}
