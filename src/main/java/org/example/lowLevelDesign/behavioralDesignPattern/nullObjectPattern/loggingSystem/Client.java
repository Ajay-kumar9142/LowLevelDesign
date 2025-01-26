package org.example.lowLevelDesign.behavioralDesignPattern.nullObjectPattern.loggingSystem;

public class Client {
    public static void main(String[] args) {
        Logger logger = getConsoleLogger(false);
        logger.log("Hi Ajay");


    }

    public static Logger getConsoleLogger(Boolean isAvailable){
        if(isAvailable){
            return new ConsoleLogger();
        }
        return new NullLogger();
    }
}
