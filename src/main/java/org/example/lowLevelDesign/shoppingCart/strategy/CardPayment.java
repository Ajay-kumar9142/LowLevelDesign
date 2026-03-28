package org.example.lowLevelDesign.shoppingCart.strategy;

public class CardPayment implements PaymentStrategy{
    @Override
    public void pay(double amount) {
        System.out.println("payment via credit card" + amount);
    }
}
