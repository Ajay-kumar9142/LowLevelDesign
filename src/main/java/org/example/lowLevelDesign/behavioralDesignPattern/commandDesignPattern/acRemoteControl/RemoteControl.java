package org.example.lowLevelDesign.behavioralDesignPattern.commandDesignPattern.acRemoteControl;

public class RemoteControl {
    Command command;
     void setCommand(Command command){
         this.command = command;
     }

     void pressButton(){
         if(command != null){
             command.excute();
         }
     }
}
