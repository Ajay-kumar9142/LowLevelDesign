package org.example.lowLevelDesign.behavioralDesignPattern.chainOfResponsebility.loggerSystem;

public class client {
    public static void main(String[] args) {
        Logger loggerChain = LoggerChain.getLoggerChain();

        System.out.println("for DEBUG logger :");
        loggerChain.logMessage(Logger.DEBUG, "Debuggler message");

        System.out.println("for INFO logger :");
        loggerChain.logMessage(Logger.INFO, "informational message");

        System.out.println("for ERROR logger :");
        loggerChain.logMessage(Logger.ERROR, "error message");
    }
}
