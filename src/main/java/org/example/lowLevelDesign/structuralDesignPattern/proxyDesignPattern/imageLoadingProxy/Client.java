package org.example.lowLevelDesign.structuralDesignPattern.proxyDesignPattern.imageLoadingProxy;

public class Client {
    public static void main(String[] args) {
        Image image = new ProxyImage("test.jpg");
        System.out.println("first display :");
        image.display();

        System.out.println("second display :");
        image.display();
    }

}
