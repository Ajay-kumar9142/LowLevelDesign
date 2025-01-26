package org.example.lowLevelDesign.behavioralDesignPattern.strategyPattern.SDP1;

public class Client {
    public static void main(String[] args) {
        PaymentContext paymentContext = new PaymentContext(new CreditCardPayment());
        paymentContext.makePayment(1000);
    }
}
