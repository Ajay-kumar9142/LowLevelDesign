package org.example.lowLevelDesign.behavioralDesignPattern.observerDesignPattern.amazonNotification;

public class User {

    public static void main(String[] args) {

        Product iphone16 = new Product("iphone 16");

        iphone16.addObserver(new EmailNotification("ajayk01@gmail.com"));
        iphone16.addObserver(new SMSNotification("7992441379"));

        //in stock
        iphone16.reStock();
    }
}
