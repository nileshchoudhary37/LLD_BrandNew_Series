package org.example;

public class MongoPersistence implements Persistence {

    private ShoppingCart cart;

    public MongoPersistence(ShoppingCart cart) {
        this.cart = cart;
    }

    @Override
    public void save() {
        System.out.println("Saving shopping cart to MongoDB database...");
    }
}
