package org.example.lowLevelDesign.parkingLotSystem.strategy.parkingStrategy;

import org.example.lowLevelDesign.parkingLotSystem.entities.ParkingSpot;
import org.example.lowLevelDesign.parkingLotSystem.vahicle.Vahicle;

import java.util.Optional;

public interface ParkingStrategy {
    Optional<ParkingSpot> findSpot(Vahicle vahicle);
}
