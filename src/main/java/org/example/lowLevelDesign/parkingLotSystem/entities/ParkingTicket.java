package org.example.lowLevelDesign.parkingLotSystem.entities;

import lombok.Getter;
import org.example.lowLevelDesign.parkingLotSystem.vahicle.Vahicle;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
public class ParkingTicket {
   private final String ticketId;
    private final LocalDateTime entryTime;
    private LocalDateTime exitTime;
    private final Vahicle vahicle;
    private final ParkingSpot parkingSpot;

    public ParkingTicket(Vahicle vahicle, ParkingSpot spot){
        this.ticketId = UUID.randomUUID().toString();
        this.entryTime = LocalDateTime.now();
        this.vahicle = vahicle;
        this.parkingSpot = spot;
    }

    public void setExitTime(LocalDateTime exitTime){
        this.exitTime = exitTime;
    }
}
