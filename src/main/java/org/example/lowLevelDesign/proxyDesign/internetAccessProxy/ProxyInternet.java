package org.example.lowLevelDesign.proxyDesign.internetAccessProxy;

import java.util.List;

public class ProxyInternet implements Internet{

    RealInternet realInternet = new RealInternet();

    private static final List<String> backlisted = List.of("youtube.com", "brave.com");


    @Override
    public void connecttoInternet(String serverHost) {

        if(backlisted.contains(serverHost)){
            System.out.println("access denied : "+ serverHost);
            return;
        }
        realInternet.connecttoInternet(serverHost);
    }
}
