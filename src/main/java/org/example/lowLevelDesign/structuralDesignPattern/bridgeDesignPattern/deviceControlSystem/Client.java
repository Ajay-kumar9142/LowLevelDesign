package org.example.lowLevelDesign.structuralDesignPattern.bridgeDesignPattern.deviceControlSystem;

public class Client {
    public static void main(String[] args) {
        Device radio = new Radio();
        RemoteControl remoteControl = new RemoteControl(radio);
        remoteControl.turnOn();
        remoteControl.setVolume(80);

        AdvanceRemoteControl advanceRemoteControl = new AdvanceRemoteControl(new Tv());
        advanceRemoteControl.turnOn();
        advanceRemoteControl.mute();

    }
}
