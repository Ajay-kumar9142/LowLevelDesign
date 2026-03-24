package org.example.lowLevelDesign.proxyDesign.internetAccessProxy;

public class Client {

    public static void main(String[] args) {
        Internet internet = new ProxyInternet();

        internet.connecttoInternet("youtube.com");
        internet.connecttoInternet("google.com");
    }
}
