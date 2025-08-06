package org.example;

import java.util.ArrayList;
import java.util.List;

class ShoppingCart {
    private final List<Product> products = new ArrayList<>();

    public void addProduct(Product p) {
        products.add(p);
    }

    public List<Product> getProducts() {
        return products;
    }

    // 1. Calculates total price in cart.
    public double calculateTotal() {
        double total = 0;
        for (Product p : products) {
            total += p.price;
        }
        return total;
    }

    // 2. Violating SRP - Prints invoice (Should be in a separate class)
    public void printInvoice() {
        System.out.println("Shopping Cart Invoice:");
        for (Product p : products) {
            System.out.println(p.name + " - Rs " + p.price);
        }
        System.out.println("Total: Rs " + calculateTotal());
    }

    // 3. Violating SRP - Saves to DB (Should be in a separate class)
    public void saveToDatabase() {
        System.out.println("Saving shopping cart to database...");
    }
}
