package org.example.lowLevelDesign.structuralDesignPattern.bridgeDesignPattern.deviceControlSystem;

public class RemoteControl {
    Device device;

    public RemoteControl(Device device){
        this.device = device;
    }

    public void turnOn(){
        device.enable();
    }

    public  void turnOff(){
        device.disable();
    }

    public void setVolume(int volume){
        device.setVolume(volume);
    }
}
