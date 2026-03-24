package org.example.lowLevelDesign.elevatorSystem.state;

import org.example.lowLevelDesign.elevatorSystem.Elevator;
import org.example.lowLevelDesign.elevatorSystem.Request;
import org.example.lowLevelDesign.elevatorSystem.enums.Direction;

public class MovingUpState implements ElevatorState{
    @Override
    public void move(Elevator elevator) {

    }

    @Override
    public void addRequest(Request request, Elevator elevator) {

    }

    @Override
    public Direction getDirection() {
        return Direction.UP;
    }
}
