package org.example;

public class SQLPersistence implements Persistence {

    private ShoppingCart cart;

    public SQLPersistence(ShoppingCart cart) {
        this.cart = cart;
    }

    @Override
    public void save() {
        System.out.println("Saving shopping cart to SQL Database...");
    }
}
