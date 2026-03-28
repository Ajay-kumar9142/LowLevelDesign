package org.example.lowLevelDesign.shoppingCart.model;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Cart {
    private Long cartId;
    Map<Long, CartItem> items;
    private long expiry;

    public Cart(Long cartId, long expiry) {
        this.cartId = cartId;
        this.expiry = expiry;
        this.items = new HashMap<>();
    }

    public void addItem(CartItem item){

    }

    public void removeItem(Long productId){
        items.remove(productId);
    }

    public void updateItem(Long productId, int qty){
        if(items.containsKey(productId)){
            items.get(productId).setQuantity(qty);
        }
    }

    public Collection<CartItem> getItems(){
        return items.values();
    }
}
