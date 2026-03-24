package org.example.lowLevelDesign.elevatorSystem.state;

import org.example.lowLevelDesign.elevatorSystem.Request;
import org.example.lowLevelDesign.elevatorSystem.enums.Direction;
import org.example.lowLevelDesign.elevatorSystem.Elevator;

public interface ElevatorState {

    void move(Elevator elevator);
    void addRequest(Request request, Elevator elevator);

    Direction getDirection();
}
