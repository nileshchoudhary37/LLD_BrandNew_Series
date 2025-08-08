package org.example;

public class MongoDbDatabase implements Database{

    @Override
    public void save(String user) {
        System.out.println("Saving user: " + user+" to MongoDB database");
    }
}
