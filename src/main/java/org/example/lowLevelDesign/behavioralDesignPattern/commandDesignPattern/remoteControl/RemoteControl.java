package org.example.lowLevelDesign.behavioralDesignPattern.commandDesignPattern.remoteControl;

public class RemoteControl {
    Command command;

    public void setCommand(Command command){
        this.command = command;
    }

    public void pressButton(){
        command.excute();
    }
}
