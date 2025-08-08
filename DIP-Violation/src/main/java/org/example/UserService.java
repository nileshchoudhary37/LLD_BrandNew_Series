package org.example;

public class UserService {    //higher-level-module
    private final SqlDB sqldb = new SqlDB();
    private final MongoDB mongoDB = new MongoDB();

    public void saveToSql(String user){
        sqldb.save(user);
    }
    public void saveToMongo(String user){
        mongoDB.save(user);
    }
}
