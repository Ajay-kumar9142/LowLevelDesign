package org.example.lowLevelDesign.behavioralDesignPattern.commandDesignPattern.acRemoteControl;

public class TurnOnCommand implements Command{
    AirConditioner airConditioner;

    public TurnOnCommand(AirConditioner airConditioner){
        this.airConditioner = airConditioner;
    }
    @Override
    public void excute() {
      airConditioner.turnOnAC();
    }
}
