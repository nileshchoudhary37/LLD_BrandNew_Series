package org.example.lspGuidelines;

public class MainGuy {
    public static void main(String[] args) {
        Parent obj = new Child();
        obj.solve("hawawa");
        obj = new Parent();
        obj.solve("hawawa");

    }
}
