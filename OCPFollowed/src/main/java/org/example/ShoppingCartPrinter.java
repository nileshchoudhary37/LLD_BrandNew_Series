package org.example;

public class ShoppingCartPrinter {
    private ShoppingCart cart;

    public ShoppingCartPrinter(ShoppingCart shoppingCart) {
        this.cart = shoppingCart;
    }

    public void printInvoice(){
        for(Product product : cart.getProducts()){
            System.out.println("name: "+product.name+ " price: Rs"+product.price);
        }
        System.out.println("Total price: Rs"+cart.calculateTotal());
    }
}
