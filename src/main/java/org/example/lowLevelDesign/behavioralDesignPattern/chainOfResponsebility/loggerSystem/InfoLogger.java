package org.example.lowLevelDesign.behavioralDesignPattern.chainOfResponsebility.loggerSystem;

public class InfoLogger extends Logger{

    public InfoLogger(int level){
        this.level = level;
    }
    @Override
    public void write(String message) {
        System.out.println("INFO"+" "+message);
    }
}
