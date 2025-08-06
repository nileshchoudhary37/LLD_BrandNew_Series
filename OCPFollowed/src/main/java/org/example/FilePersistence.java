package org.example;

public class FilePersistence implements Persistence {

    private ShoppingCart cart;

    public FilePersistence(ShoppingCart cart) {
        this.cart = cart;
    }

    @Override
    public void save() {
        System.out.println("Saving shopping cart to file system...");
    }
}
