package org.example.lowLevelDesign.shoppingCart.model;

import lombok.Getter;

@Getter
public class User {
    private String name;
    private Long userId;

    public User(String name, Long userId) {
        this.name = name;
        this.userId = userId;
    }
}
