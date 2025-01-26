package org.example.lowLevelDesign.behavioralDesignPattern.strategyPattern.SDP1;

public class PaymentContext {
    PaymentStrategy paymentStrategy;

    public PaymentContext(PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }

    public void makePayment(int amount){
        paymentStrategy.makePayment(amount);
    }
}
