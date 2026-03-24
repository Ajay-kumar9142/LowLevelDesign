package org.example.lowLevelDesign.parkingLotSystem.entities;

import org.example.lowLevelDesign.parkingLotSystem.vahicle.Vahicle;
import org.example.lowLevelDesign.parkingLotSystem.vahicle.VahicleType;

import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

public class ParkingFloor {
    private final int floorNumber;
    private final Map<String, ParkingSpot> spots ;

    public ParkingFloor(final int floorNumber){
        this.floorNumber = floorNumber;
        spots = new ConcurrentHashMap<>();
    }

    public void addSpot(final ParkingSpot spot){
        spots.put(spot.getSpotId(), spot);
    }

    public Optional<ParkingSpot> findAvailability(Vahicle vahicle){
        return spots.values().stream()
                .filter(spot -> !spot.isOccupied() && spot.canVahicleFit(vahicle))
                .sorted(Comparator.comparing(ParkingSpot :: getVahicleType))
                .findFirst();
    }

    public void displayAvailablity(){
        //print all unoccupied spots
    }
}
