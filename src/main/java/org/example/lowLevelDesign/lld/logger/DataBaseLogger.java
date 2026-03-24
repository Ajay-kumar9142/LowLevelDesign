package org.example.lowLevelDesign.lld.logger;

public class DataBaseLogger implements LogObserver{
    @Override
    public void log(String msg) {
        System.out.println("Logging into DataBase "+ msg);
    }
}
