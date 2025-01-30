package org.example.lowLevelDesign.behavioralDesignPattern.commandDesignPattern.acRemoteControl;

public class TurnOffCommand implements Command{
    AirConditioner airConditioner;

    public TurnOffCommand(AirConditioner airConditioner){
        this.airConditioner = airConditioner;
    }
    @Override
    public void excute() {
        airConditioner.turnOffAC();
    }
}
