package org.example.lowLevelDesign.shoppingCart.strategy;

public class UpiPayment implements PaymentStrategy{
    @Override
    public void pay(double amount) {
        System.out.println("payment via UPI " + amount);
    }
}
