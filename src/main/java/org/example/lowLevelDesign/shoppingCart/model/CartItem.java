package org.example.lowLevelDesign.shoppingCart.model;

import lombok.Getter;

public class CartItem {
    @Getter
    private Long productId;
    @Getter
    private int quantity;
    private double price;

    public CartItem(Long productId, int quantity, double price) {
        this.productId = productId;
        this.quantity = quantity;
        this.price = price;
    }

    public double getPrice(){
        return price*quantity;
    }

    public void setQuantity(int n){
        this.quantity = n;
    }
}
