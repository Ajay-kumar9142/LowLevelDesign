package org.example.lowLevelDesign.behavioralDesignPattern.commandDesignPattern.acRemoteControl;

public class AirConditioner {

    void turnOnAC(){
        System.out.println("The AC is On now !");
    }

    void turnOffAC(){
        System.out.println("The AC is off now");
    }

    void setTempreture(int tempreture){
        System.out.println("The AC tempreture is : "+tempreture);
    }
}
