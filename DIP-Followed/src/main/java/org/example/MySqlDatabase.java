package org.example;

public class MySqlDatabase implements Database {

    @Override
    public void save(String user) {
        System.out.println("Saving user: " + user+ " to MySqlDatabase");
    }
}
