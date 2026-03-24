package org.example.lowLevelDesign.lld.logger;

public class ConsoleLogger implements LogObserver{
    @Override
    public void log(String msg) {
        System.out.println("Logging into the console "+ msg);
    }
}
