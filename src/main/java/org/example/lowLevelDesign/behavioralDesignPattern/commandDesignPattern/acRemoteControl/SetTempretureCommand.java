package org.example.lowLevelDesign.behavioralDesignPattern.commandDesignPattern.acRemoteControl;

public class SetTempretureCommand implements Command{
    AirConditioner airConditioner;
    int tempreture;

    public SetTempretureCommand(AirConditioner airConditioner, int tempreture){
        this.airConditioner = airConditioner;
        this.tempreture = tempreture;
    }
    @Override
    public void excute() {
        airConditioner.setTempreture(tempreture);
    }
}
