package org.example.lowLevelDesign.elevatorSystem;

import lombok.Getter;
import org.example.lowLevelDesign.elevatorSystem.enums.Direction;
import org.example.lowLevelDesign.elevatorSystem.enums.RequestSource;

@Getter
public class Request {

    int targetFloor;
    Direction direction;
    RequestSource requestSource;

    public Request(int floor, Direction direction, RequestSource source){
        this.targetFloor = floor;
        this.direction = direction;
        this.requestSource = source;
    }

    @Override
    public String toString() {
        return "Request{" +
                "targetFloor=" + targetFloor +
                ", direction=" + direction +
                ", requestSource=" + requestSource +
                '}';
    }
}
