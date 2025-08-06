package org.example;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.addProduct(new Product("Laptop", 50000));
        cart.addProduct(new Product("Mouse", 2000));

        ShoppingCartPrinter printer = new ShoppingCartPrinter(cart);
        printer.printInvoice();
        ShoppingCartStorage storage = new ShoppingCartStorage(cart);
        storage.saveToSQLDatabase();
        storage.saveToMongoDatabase();
        storage.saveToFile();
    }
}