package org.example;

public class UserService {

    public void saveToDatabase(String user, Database database) {
        database.save(user);
    }
}
