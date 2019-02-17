package com.utstyrwebapp.demo;

import com.utstyrwebapp.demo.database.DbImplement;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UtstyrWebAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(UtstyrWebAppApplication.class, args);

        System.out.println("** Utstyr Web App started**");

        // Initialize database and connect
        DbImplement dbImplement = new DbImplement();

        dbImplement.connect();

        // Create tables of equipment
        dbImplement.createTables();

        // Disconnect from database
        // dbImplement.disconnect();

    }

}

