package org.example.lowLevelDesign.behavioralDesignPattern.nullObjectPattern.loggingSystem;

public class NullLogger implements Logger{
    @Override
    public void log(String message) {
        //do nothing
        System.out.println(message+" : No object available");
    }
}
