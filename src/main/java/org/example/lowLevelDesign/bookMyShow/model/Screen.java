package org.example.lowLevelDesign.bookMyShow.model;

import java.util.ArrayList;
import java.util.List;

public class Screen {

    String screenId;

    List<Seat> seats;

    public Screen(String screenId){
        this.screenId = screenId;
        this.seats = new ArrayList<>();
    }

    public void addSeat(Seat seat){
        this.seats.add(seat);
    }

    //remove seat
}
