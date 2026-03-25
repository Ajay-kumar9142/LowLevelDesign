package org.example.lowLevelDesign.bookMyShow.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
     String id;

     String name;

    public User(String id, String name){
        this.id = id;
        this.name = name;
    }
}
