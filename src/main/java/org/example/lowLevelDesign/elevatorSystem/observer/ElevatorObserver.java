package org.example.lowLevelDesign.elevatorSystem.observer;

import org.example.lowLevelDesign.elevatorSystem.Elevator;

public interface ElevatorObserver {

    void update(Elevator elevator);
}
