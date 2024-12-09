package com.company.smartbrain.tools.database.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class ConnectionPool {
    /// Initialize-Connection
    /// Connection Pool
    private Connection connection;
    private ConcurrentHashMap<String, Object> connectionAlive = new ConcurrentHashMap<>();//locking hashmap for thread by using ConcurrentHashMap
    private ConcurrentHashMap<String,Object> connectionDeactive = new ConcurrentHashMap<>();
    private HashMap<String,Object> threadInfo = new HashMap<>();

    public void  requestConnection(){
        initializingConnection();
    }
    private void initializingConnection(){
        //put the thread in those three maps (check if the thread exists and it's not suspended  don't put it again)
        Thread.currentThread().getId();
        Thread.currentThread().getName();
        Thread.currentThread().getState();

        try {
            Class.forName("org.postgresql.Driver");
            Connection tmpConnection = DriverManager
                    .getConnection("jdbc:postgresql://localhost:5432/",
                            "postgres","honey*1379");
            setConnection(tmpConnection);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
    private void checkingConnectionInfo(){

    }
    private void checkingObjectRequester(){

    }
    private void checkingThreadInfo(){

    }
    public void setConnection(Connection connection){
        this.connection = connection;
    }
    public Connection getConnection(){
        return connection;
    }

}
