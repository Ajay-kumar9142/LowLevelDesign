package org.example.lowLevelDesign.behavioralDesignPattern.commandDesignPattern.acRemoteControl;

public class Client {
    public static void main(String[] args) {
        AirConditioner ac = new AirConditioner();
        Command turnOnCommand = new TurnOnCommand(ac);
        Command turnOffCommand = new TurnOffCommand(ac);
        Command setTempretureCommand = new SetTempretureCommand(ac, 30);

        RemoteControl remote = new RemoteControl();

        //turn on Ac
        remote.setCommand(turnOnCommand);
        remote.pressButton();

        //turn off Ac
        remote.setCommand(turnOffCommand);
        remote.pressButton();

        //set tempreture
        remote.setCommand(setTempretureCommand);
        remote.pressButton();
    }
}
