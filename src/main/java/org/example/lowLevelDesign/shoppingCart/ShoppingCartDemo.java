package org.example.lowLevelDesign.shoppingCart;

import org.example.lowLevelDesign.shoppingCart.model.Cart;
import org.example.lowLevelDesign.shoppingCart.strategy.UpiPayment;

public class ShoppingCartDemo {

    public static void main(String[] args) {

        InventoryService inventoryService = new InventoryService();
        PricingService pricingService = new PricingService();

        CartService cartService = new CartService(inventoryService, pricingService);

        Cart cart = new Cart(245L, System.currentTimeMillis() + 30000);

        cartService.addItem(cart, 1L, 2, 20);

        double amount = cartService.checkOut(cart, "Discount10", new UpiPayment());
        System.out.println("final amount : " + amount);
    }
}
