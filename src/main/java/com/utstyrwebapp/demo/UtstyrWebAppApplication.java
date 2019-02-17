package com.utstyrwebapp.demo;

import com.utstyrwebapp.demo.database.DbAdapter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UtstyrWebAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(UtstyrWebAppApplication.class, args);

        System.out.println("** Utstyr Web App started**");

        // Initialize database and connect
        DbAdapter dbAdapter = new DbAdapter();
        dbAdapter.connect();
        // dbAdapter.disconnect();


    }

}

