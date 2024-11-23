package com.company.smartbrain.tools.database.connection;

import java.sql.Connection;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class ConnectionPool {
    // Initialize Connection
    // Connection Pool
    private Connection connection;
    private ConcurrentHashMap<String, Object> connectionAlive = new ConcurrentHashMap<>();
    private ConcurrentHashMap<String,Object> connectionDeactive = new ConcurrentHashMap<>();
    private HashMap<String,Object> threadInfo = new HashMap<>();

    private void  requestConnection(){
        initializingConnection();
    }
    private void initializingConnection(){

    }
    private void checkingConnectionInfo(){

    }
    private void checkingObjectRequester(){

    }
    private void checkingThreadInfo(){

    }
    public void setConnection(Connection connection){

    }
    public void getConnection(){

    }

}
