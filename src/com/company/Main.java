package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Connection c = null;
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/","postgres","honey*1379");
            Statement statement = c.createStatement();
            c.setAutoCommit(false);
            String sql = "INSERT INTO category (id,name,description)" +" VALUES (1,'CAT2','description');";
            statement.executeLargeUpdate(sql);
            c.commit();
            c.close();

        }catch (Exception e){
            e.printStackTrace();
            System.err.println(e.getClass().getName()+":"+e.getMessage() );
        }
        System.out.println("connected");
    }
}