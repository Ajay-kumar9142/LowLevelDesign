package org.example.lowLevelDesign.behavioralDesignPattern.observerDesignPattern.amazonNotification;

public class EmailNotification implements Observer {
    private String email;
    public EmailNotification(String email){
        this.email = email;
    }
    @Override
    public void update(String productName) {
        System.out.println("notification is sent to : "+ email +" for the product : "+ productName);
    }
}
