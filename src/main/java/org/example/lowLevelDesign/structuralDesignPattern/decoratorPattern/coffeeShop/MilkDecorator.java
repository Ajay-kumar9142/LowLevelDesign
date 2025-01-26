package org.example.lowLevelDesign.structuralDesignPattern.decoratorPattern.coffeeShop;

public class MilkDecorator extends CoffeeDecorator{

    public MilkDecorator(Coffee coffee){
        super(coffee);
    }

    @Override
    public String productDesc() {
        return coffee.productDesc() +", milk";
    }

    @Override
    public int getCost() {
        return coffee.getCost()+4;
    }
}
