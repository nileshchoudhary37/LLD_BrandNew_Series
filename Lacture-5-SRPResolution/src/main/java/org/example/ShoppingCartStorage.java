package org.example;

public class ShoppingCartStorage {
    private ShoppingCart shoppingCart;

    public ShoppingCartStorage(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public void saveToDatabase() {
        System.out.println("Saving shopping cart to database...");
    }
}
