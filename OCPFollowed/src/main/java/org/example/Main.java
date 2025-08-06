package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.addProduct(new Product("Laptop", 50000));
        cart.addProduct(new Product("Mouse", 2000));

        ShoppingCartPrinter printer = new ShoppingCartPrinter(cart);
        printer.printInvoice();
        Persistence sqlP = new SQLPersistence(cart);
        Persistence fileP = new FilePersistence(cart);
        Persistence mongoP = new MongoPersistence(cart);
        sqlP.save();                                 //saving to SQL db
        fileP.save();                                 //saving to File system
        mongoP.save();                                 //saving to Mongo db
    }
}