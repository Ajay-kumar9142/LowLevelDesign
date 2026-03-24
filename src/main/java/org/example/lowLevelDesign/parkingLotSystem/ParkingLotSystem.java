package org.example.lowLevelDesign.parkingLotSystem;

import org.example.lowLevelDesign.parkingLotSystem.entities.ParkingFloor;
import org.example.lowLevelDesign.parkingLotSystem.entities.ParkingSpot;
import org.example.lowLevelDesign.parkingLotSystem.entities.ParkingTicket;
import org.example.lowLevelDesign.parkingLotSystem.strategy.parkingStrategy.DefaultParking;
import org.example.lowLevelDesign.parkingLotSystem.strategy.parkingStrategy.ParkingStrategy;
import org.example.lowLevelDesign.parkingLotSystem.strategy.paymentStrategy.FlatRateFeeStrategy;
import org.example.lowLevelDesign.parkingLotSystem.strategy.paymentStrategy.PaymentStrategy;
import org.example.lowLevelDesign.parkingLotSystem.vahicle.Vahicle;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

public class ParkingLotSystem {
    private ParkingStrategy parkingStrategy;

    private PaymentStrategy paymentStrategy;

    private final Map<String, ParkingTicket> activeTickets;

    private final List<ParkingFloor> floors = new ArrayList<>();

    private static ParkingLotSystem instance;

    private ParkingLotSystem(){
        //default values
        this.parkingStrategy = new DefaultParking();
        this.paymentStrategy = new FlatRateFeeStrategy();
        this.activeTickets = new ConcurrentHashMap<>();
    }

    public synchronized static ParkingLotSystem getInstance(){ //Singleton design pattern
        if(instance == null) instance = new ParkingLotSystem();
        return instance;
    }

    public void addFloors(ParkingFloor floor){
        this.floors.add(floor);
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }

    public void setParkingStrategy(ParkingStrategy parkingStrategy){
        this.parkingStrategy = parkingStrategy;
    }

    public Optional<ParkingTicket> parkVahicle(Vahicle vahicle){
    Optional<ParkingSpot> availableSpot = parkingStrategy.findSpot(vahicle);

        if (availableSpot.isPresent()) {
            ParkingSpot spot = availableSpot.get();
            spot.parkVahicle(vahicle);
            ParkingTicket ticket = new ParkingTicket(vahicle, spot);
            activeTickets.put(vahicle.getRegistration(), ticket);
            System.out.printf("%s parked at %s. Ticket: %s\n", vahicle.getRegistration(), spot.getSpotId(), ticket.getTicketId());
            return Optional.of(ticket);
        }

        System.out.println("No available spot for " + vahicle.getRegistration());
        return Optional.empty();
    }

    public Optional<Double> unparkVehicle(String licenseNumber) {
        ParkingTicket ticket = activeTickets.remove(licenseNumber);
        if (ticket == null) {
            System.out.println("Ticket not found");
            return Optional.empty();
        }

        ticket.setExitTime(LocalDateTime.now());
        ticket.getParkingSpot().unparkVahicle();

        Double parkingFee = paymentStrategy.feeCalculator(ticket);

        return Optional.of(parkingFee);
    }
}
