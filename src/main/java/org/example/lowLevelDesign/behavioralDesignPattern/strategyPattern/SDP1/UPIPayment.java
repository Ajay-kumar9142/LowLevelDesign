package org.example.lowLevelDesign.behavioralDesignPattern.strategyPattern.SDP1;

public class UPIPayment implements PaymentStrategy{
    @Override
    public void makePayment(int amount) {
        //making payment through UPI
        System.out.println("make payment through UPI :" + amount);
    }
}
