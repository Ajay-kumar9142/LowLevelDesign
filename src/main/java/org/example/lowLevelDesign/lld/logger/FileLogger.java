package org.example.lowLevelDesign.lld.logger;

public class FileLogger implements LogObserver{
    @Override
    public void log(String msg) {
        System.out.println("logging into file "+ msg);
    }
}
