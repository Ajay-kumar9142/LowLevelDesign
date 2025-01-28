package org.example.lowLevelDesign.structuralDesignPattern.bridgeDesignPattern.deviceControlSystem;

public class AdvanceRemoteControl extends RemoteControl{

    public AdvanceRemoteControl(Device device) {
        super(device);
    }

    public void mute(){
        device.setVolume(0);
        System.out.println("Device is muted");
    }
}
