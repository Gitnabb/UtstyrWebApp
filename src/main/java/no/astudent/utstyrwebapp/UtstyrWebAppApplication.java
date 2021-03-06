package no.astudent.utstyrwebapp;

import javafx.application.Application;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UtstyrWebAppApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {


        SpringApplication.run(UtstyrWebAppApplication.class, args);

        LOGGER.info("** Utstyr Web App started**");

    }


}

