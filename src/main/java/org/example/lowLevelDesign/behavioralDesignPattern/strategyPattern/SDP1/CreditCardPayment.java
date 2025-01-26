package org.example.lowLevelDesign.behavioralDesignPattern.strategyPattern.SDP1;

public class CreditCardPayment implements PaymentStrategy{
    @Override
    public void makePayment(int amount) {
        //making payment through credit card
        System.out.println("make payment through credit card :"+ amount);
    }
}
