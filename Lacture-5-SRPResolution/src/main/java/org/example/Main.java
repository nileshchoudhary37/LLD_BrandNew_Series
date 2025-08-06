package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(new Product("Laptop", 53455.99));
        cart.addProduct(new Product("Airpod", 20455.99));

        ShoppingCartPrinter sp = new ShoppingCartPrinter(cart);
        sp.printInvoice();
        new ShoppingCartStorage(cart).saveToDatabase();
    }
}