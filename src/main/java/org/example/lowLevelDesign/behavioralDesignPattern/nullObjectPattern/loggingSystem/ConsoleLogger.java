package org.example.lowLevelDesign.behavioralDesignPattern.nullObjectPattern.loggingSystem;

public class ConsoleLogger implements Logger{

    @Override
    public void log(String message) {
        System.out.println("LOG :"+message);
    }
}
