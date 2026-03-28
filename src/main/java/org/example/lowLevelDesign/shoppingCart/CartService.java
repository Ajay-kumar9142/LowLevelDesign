package org.example.lowLevelDesign.shoppingCart;

import org.example.lowLevelDesign.shoppingCart.model.Cart;
import org.example.lowLevelDesign.shoppingCart.model.CartItem;
import org.example.lowLevelDesign.shoppingCart.strategy.PaymentStrategy;

public class CartService {

    private final InventoryService inventoryService;
    private final PricingService pricingService;

    public CartService(InventoryService inventoryService, PricingService pricingService) {
        this.inventoryService = inventoryService;
        this.pricingService = pricingService;
    }

    public void addItem(Cart cart, Long productId, int qty, double price){
        if(!inventoryService.checkStock(productId, qty)) throw new RuntimeException("product is out of stock.");

        cart.addItem(new CartItem(productId, qty, price));
    }

    public double checkOut(Cart cart, String coupon, PaymentStrategy payment){
        double total = pricingService.finalAmount(cart, coupon);
        payment.pay(total);
        return total;
    }
}
