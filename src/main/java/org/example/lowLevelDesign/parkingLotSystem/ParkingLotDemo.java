package org.example.lowLevelDesign.parkingLotSystem;

import org.example.lowLevelDesign.parkingLotSystem.entities.ParkingFloor;
import org.example.lowLevelDesign.parkingLotSystem.entities.ParkingSpot;
import org.example.lowLevelDesign.parkingLotSystem.entities.ParkingTicket;
import org.example.lowLevelDesign.parkingLotSystem.strategy.parkingStrategy.NearestParkingStrategy;
import org.example.lowLevelDesign.parkingLotSystem.strategy.paymentStrategy.FlatRateFeeStrategy;
import org.example.lowLevelDesign.parkingLotSystem.vahicle.*;

import java.util.Optional;

public class ParkingLotDemo {

    public static void main(String[] args) {
        ParkingLotSystem parkingLot = ParkingLotSystem.getInstance();

        ParkingFloor floor1 = new ParkingFloor(1);
        floor1.addSpot(new ParkingSpot("F1-S1", VahicleType.SMALL));
        floor1.addSpot(new ParkingSpot("F1-M2", VahicleType.MEDUIM));
        floor1.addSpot(new ParkingSpot("F1-L1", VahicleType.LARGE));

        ParkingFloor floor2 = new ParkingFloor(2);
        floor2.addSpot(new ParkingSpot("F2-L1", VahicleType.LARGE));
        floor2.addSpot(new ParkingSpot("F2-L2", VahicleType.LARGE));

        parkingLot.addFloors(floor1);
        parkingLot.addFloors(floor2);

        parkingLot.setParkingStrategy(new NearestParkingStrategy());
        parkingLot.setPaymentStrategy(new FlatRateFeeStrategy());

        Vahicle bike = new Bike("BK-6785");
        Vahicle car = new Car("CR-6754");
        Vahicle truck = new Truck("TK-2460");

        Optional<ParkingTicket> ticket1 = parkingLot.parkVahicle(bike);
        Optional<ParkingTicket> ticket2 = parkingLot.parkVahicle(car);
        Optional<ParkingTicket> ticket3 = parkingLot.parkVahicle(truck);

        floor1.displayAvailablity();
        floor2.displayAvailablity();

        if(ticket2.isPresent()){
            Optional<Double> feeOpt = parkingLot.unparkVehicle(car.getRegistration());
            if(feeOpt.isPresent()) System.out.println("parking fee: " + feeOpt);
        }
    }
}
