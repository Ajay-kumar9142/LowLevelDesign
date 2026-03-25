package org.example.lowLevelDesign.bookMyShow.model;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


@Getter
public class Cinema {
    String cinemaId;
    List<Screen> screens;

    String city;
    String name;

    public Cinema(String cinemaId, String city, String name){
        this.cinemaId = cinemaId;
        this.city = city;
        this.name = name;
        screens = new ArrayList<>();
    }

    public void addScreen(Screen screen){
        this.screens.add(screen);
    }

    public void remove(Screen screen){
        this.screens.remove(screen);
    }
}
