package org.example;

public class ShoppingCartStorage {
    private ShoppingCart cart;

    public ShoppingCartStorage(ShoppingCart cart) {
        this.cart = cart;
    }

    public void saveToSQLDatabase() {
        System.out.println("Saving shopping cart to SQL database.......");
    }

    public void saveToMongoDatabase() {
        System.out.println("Saving shopping cart to MongoDb database.......");
    }

    public void saveToFile(){
        System.out.println("Saving shopping cart to file.......");
    }
}
