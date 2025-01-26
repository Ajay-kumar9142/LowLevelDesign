package org.example.lowLevelDesign.behavioralDesignPattern.chainOfResponsebility.loggerSystem;

public abstract class Logger {
    public static int INFO = 1;
    public static  int DEBUG = 2;
    public static int ERROR = 3;

    public  int level ;
    public Logger nextLogger;

    public void setNextLogger(Logger nextLogger){
        this.nextLogger = nextLogger;
    }

    public void logMessage(int level, String message){
        if(this.level == level){
            write(message);
        }
        if(nextLogger != null){
            nextLogger.logMessage(level, message);
        }
    }

    public abstract void write(String message);
}
