package org.example.lowLevelDesign.shoppingCart.model;

import lombok.Getter;

@Getter
public class Product {
    private Long productId;
    private String name;
    private double price;
    private boolean inStock;

    public Product(Long productId, String name, double price, boolean inStock) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.inStock = inStock;
    }
}
