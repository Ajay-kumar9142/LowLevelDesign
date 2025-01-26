package org.example.lowLevelDesign.structuralDesignPattern.decoratorPattern.coffeeShop;

public abstract class CoffeeDecorator implements Coffee{
    protected Coffee coffee;

    public CoffeeDecorator(Coffee coffee){
        this.coffee = coffee;
    }

    @Override
    public String productDesc() {
       return coffee.productDesc();
    }

    @Override
    public int getCost() {
        return coffee.getCost();
    }
}
