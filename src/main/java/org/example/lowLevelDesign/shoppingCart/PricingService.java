package org.example.lowLevelDesign.shoppingCart;

import org.example.lowLevelDesign.shoppingCart.model.Cart;
import org.example.lowLevelDesign.shoppingCart.model.CartItem;

public class PricingService {

    public double subTotal(Cart cart){
        return cart.getItems()
                .stream()
                .mapToDouble(CartItem::getPrice)
                .sum();
    }

    //Buy 2, get 1 free
    public double bundleOffer(Cart cart){
        //logic
        return 0;
    }

    public double applyCoupon(double subtotal, String coupon){
        //logic
        return 0;
    }

    public double calculateTax(double amount) {
        return amount*0.18;
    }

    public double finalAmount(Cart cart, String coupon){
        double subtotal = subTotal(cart);
        double discount = bundleOffer(cart);
        double couponAmount = applyCoupon(subtotal, coupon);
        double total = subtotal - discount - couponAmount;
        double tax = calculateTax(total);
        return total + tax;
    }
}
