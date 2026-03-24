package org.example.lowLevelDesign.elevatorSystem;

import org.example.lowLevelDesign.elevatorSystem.observer.ElevatorObserver;
import org.example.lowLevelDesign.elevatorSystem.state.ElevatorState;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;

public class Elevator {
    private int id;

    private AtomicInteger currFloor;

    private ElevatorState elevatorState;

    private boolean isRunning = true;

   private TreeSet<Integer> upRequests;
    private TreeSet<Integer> downRequests;

    private final List<ElevatorObserver> observers = new ArrayList<>();


}
