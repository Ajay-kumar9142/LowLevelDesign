package org.example.lowLevelDesign.bookMyShow.model;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Seat {
    String seatId;

    SeatType seatType;
    SeatStatus status;

    public Seat(String seatId, SeatType seatType){
        this.seatId = seatId;
        this.seatType = seatType;
        this.status = SeatStatus.AVAILABLE;
    }

}
