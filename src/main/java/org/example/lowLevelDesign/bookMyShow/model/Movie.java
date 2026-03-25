package org.example.lowLevelDesign.bookMyShow.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Movie {
    String title;
    String name;
    int duration;

    public Movie(String title, String name, int duration){
        this.title = title;
        this.name = name;
        this.duration = duration;
    }
}
