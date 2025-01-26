package org.example.lowLevelDesign.behavioralDesignPattern.chainOfResponsebility.loggerSystem;

public class ErrorLogger extends Logger{

    public ErrorLogger(int level){
        this.level = level;
    }
    @Override
    public void write(String message) {
        System.out.println("ERROR : "+message);
    }
}
