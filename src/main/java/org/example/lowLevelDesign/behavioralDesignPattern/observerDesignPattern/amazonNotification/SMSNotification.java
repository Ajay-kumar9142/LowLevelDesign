package org.example.lowLevelDesign.behavioralDesignPattern.observerDesignPattern.amazonNotification;

public class SMSNotification implements Observer{
    String phone;

    public SMSNotification(String phone){
        this.phone = phone;
    }


    @Override
    public void update(String productName) {
        System.out.println("notification is sent to : "+ this.phone +" for the product : "+ productName);
    }
}
