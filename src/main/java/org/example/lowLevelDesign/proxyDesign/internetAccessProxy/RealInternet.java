package org.example.lowLevelDesign.proxyDesign.internetAccessProxy;

public class RealInternet implements Internet{
    @Override
    public void connecttoInternet(String serverHost) {
        System.out.println("connected to "+ serverHost);
    }
}
