package org.example.lowLevelDesign.parkingLotSystem.strategy.paymentStrategy;

import org.example.lowLevelDesign.parkingLotSystem.entities.ParkingTicket;

public interface PaymentStrategy {
    double feeCalculator(ParkingTicket parkingTicket);
}
