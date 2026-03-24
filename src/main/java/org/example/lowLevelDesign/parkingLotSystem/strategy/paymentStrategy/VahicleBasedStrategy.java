package org.example.lowLevelDesign.parkingLotSystem.strategy.paymentStrategy;

import org.example.lowLevelDesign.parkingLotSystem.entities.ParkingTicket;

public class VahicleBasedStrategy implements PaymentStrategy{
    @Override
    public double feeCalculator(ParkingTicket parkingTicket) {
        //logic
        return 150;
    }
}
