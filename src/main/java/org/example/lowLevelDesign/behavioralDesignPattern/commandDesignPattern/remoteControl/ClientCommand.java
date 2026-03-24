package org.example.lowLevelDesign.behavioralDesignPattern.commandDesignPattern.remoteControl;

public class ClientCommand {

    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        remoteControl.setCommand(new LightOnCommand(new Light()));
        remoteControl.pressButton();
    }
}
