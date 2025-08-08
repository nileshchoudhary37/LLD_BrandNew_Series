package org.example;

public class Main {
    public static void main(String[] args) {

        Database sqlDatabase = new MySqlDatabase();
        Database mongoDatabase = new MongoDbDatabase();
        UserService userService = new UserService();

        userService.saveToDatabase("Ramu Kaka", sqlDatabase);
        userService.saveToDatabase("Bhajan Lal", mongoDatabase);


    }
}