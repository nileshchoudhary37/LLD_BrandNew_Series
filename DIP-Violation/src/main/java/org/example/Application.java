package org.example;

public class Application {
    public static void main(String[] args) {
        UserService userService = new UserService();
        userService.saveToMongo("Ramu Kaka");
        userService.saveToSql("Bhajan Lal");
    }
}