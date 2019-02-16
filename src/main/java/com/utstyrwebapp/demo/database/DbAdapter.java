package com.utstyrwebapp.demo.database;
import java.sql.*;

public class DbAdapter {

    /*- 01 Variables -------------------*/
    String jdbUrl = "jdbc:postgresql://localhost:5432/Utstyr_Database";
    String username = "postgres";
    String password = "postgres";

    /*- 02 Database Variables ----------*/

    Connection connection = null;
    Statement statement = null;
    ResultSet result = null;

    /*- 03 Constructor -----------------*/

    public DbAdapter(){

    }

    public void connect(){
        try{
            // Connect to database
            connection = DriverManager.getConnection(jdbUrl, username, password);
            System.out.println("Connection established");
        } catch(SQLException e){
            e.printStackTrace();
        }
    } // Connected

    public void disconnect(){
        try{
            if (statement != null){
                statement.close();
            }

            if (result != null){
                result.close();
            }

            if (connection != null){
                connection.close();
            }
            System.out.println("Connection terminated");
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
}
