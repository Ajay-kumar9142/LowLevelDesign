package org.example.lowLevelDesign.structuralDesignPattern.decoratorPattern.coffeeShop;

public class Customer {
    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();

        System.out.println(coffee.productDesc()+" price :"+ coffee.getCost());

        //add milk
        coffee = new MilkDecorator(coffee);
        System.out.println(coffee.productDesc()+" price :"+ coffee.getCost());

        //add sugar
        coffee = new SugarDecorator(coffee);
        System.out.println(coffee.productDesc()+" price :"+ coffee.getCost());
    }
}
