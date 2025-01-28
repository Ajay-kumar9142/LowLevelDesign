package org.example.lowLevelDesign.structuralDesignPattern.bridgeDesignPattern.deviceControlSystem;

public class Tv implements Device{
    private Boolean isOn = false;
    private int volume = 40;
    @Override
    public void enable() {
      isOn = true;
        System.out.println("Tv is on now");
    }

    @Override
    public void disable() {
       isOn = false;
        System.out.println("Tv is off now");
    }

    @Override
    public void setVolume(int volume) {
     this.volume = volume;
        System.out.println("current volume of Tv : "+volume);
    }
}
