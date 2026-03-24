package org.example.lowLevelDesign.parkingLotSystem.vahicle;

import lombok.Getter;

@Getter
public abstract class Vahicle {
    String registration;
    VahicleType vahicleType;

    public Vahicle(String reg, VahicleType vahicleType){
        this.registration = reg;
        this.vahicleType = vahicleType;
    }
}
