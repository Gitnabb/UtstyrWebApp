package com.utstyrwebapp.demo.database;

import java.sql.SQLException;

public class DbImplement extends DbAdapter {

    public void createTables(){

        try {
            statement = connection.createStatement();

            String sqlQuery = "CREATE TABLE IF NOT EXISTS equipment (" +
                    "product_id SERIAL PRIMARY KEY NOT NULL, " +
                    "product_name VARCHAR (100) NOT NULL, " +
                    "product_depositum REAL)";

            statement.executeUpdate(sqlQuery);
            statement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
