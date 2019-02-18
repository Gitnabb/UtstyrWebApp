package com.utstyrwebapp.demo.Database;
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

    /*- 04 Connector -------------------*/
    public void connect(){
        try{
            // Connect to Database
            connection = DriverManager.getConnection(jdbUrl, username, password);
            System.out.println("Connection established");
        } catch(SQLException e){
            e.printStackTrace();
        }
    } // Connected

    /*- 05 Disconnector -----------------*/
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
