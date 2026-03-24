package org.example.lowLevelDesign.parkingLotSystem.entities;

import lombok.Getter;
import org.example.lowLevelDesign.parkingLotSystem.vahicle.Vahicle;
import org.example.lowLevelDesign.parkingLotSystem.vahicle.VahicleType;

@Getter
public class ParkingSpot {

    private final String spotId;
    private final VahicleType vahicleType;
    private Vahicle vahicle;

    private boolean isOccupied;

    public ParkingSpot(String spotId, VahicleType vahicleType){
        this.spotId = spotId;
        this.vahicleType = vahicleType;
        this.vahicle = null;
        this.isOccupied = false;
    }

    public boolean canVahicleFit(Vahicle vahicle){
        if(isOccupied) return false;

        switch (vahicle.getVahicleType()){
            case SMALL: return vahicleType == VahicleType.SMALL;
            case MEDUIM: return vahicleType == VahicleType.MEDUIM;
            case LARGE: return vahicleType == VahicleType.LARGE;
            default: return false;
        }
    }

    public boolean isAvailable(){
        return !isOccupied;
    }

    public void parkVahicle(Vahicle vahicle){
        this.vahicle = vahicle;
        this.isOccupied = true;
    }

    public void unparkVahicle(){
        this.vahicle = null;
        this.isOccupied = false;
    }
}
