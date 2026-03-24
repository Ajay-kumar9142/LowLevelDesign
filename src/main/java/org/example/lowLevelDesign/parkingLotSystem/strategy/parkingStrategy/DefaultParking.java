package org.example.lowLevelDesign.parkingLotSystem.strategy.parkingStrategy;

import org.example.lowLevelDesign.parkingLotSystem.entities.ParkingSpot;
import org.example.lowLevelDesign.parkingLotSystem.vahicle.Vahicle;

import java.util.Optional;

public class DefaultParking implements ParkingStrategy{
    @Override
    public Optional<ParkingSpot> findSpot(Vahicle vahicle) {
        //logic
        return Optional.empty();
    }
}
