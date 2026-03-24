package org.example.lowLevelDesign.behavioralDesignPattern.commandDesignPattern.remoteControl;

public class LightOnCommand implements Command {

    Light light;

    public LightOnCommand(Light light){
        this.light = light;
    }
    @Override
    public void excute() {
        light.start();
    }
}
