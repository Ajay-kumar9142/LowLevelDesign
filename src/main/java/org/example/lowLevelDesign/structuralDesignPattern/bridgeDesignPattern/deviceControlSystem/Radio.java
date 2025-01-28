package org.example.lowLevelDesign.structuralDesignPattern.bridgeDesignPattern.deviceControlSystem;

public class Radio implements Device{
    private Boolean isOn = false;
    private int volume = 30;
    @Override
    public void enable() {
        isOn = true;
        System.out.println("Radio is on now");
    }

    @Override
    public void disable() {
        isOn = false;
        System.out.println("Radio is off now");
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("current volume of Radio : "+ volume);
    }
}
