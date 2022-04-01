package com.louis.projectone;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
//@ComponentScan(basePackages = "com.louis.projectone.*")
public class ProjectOneApplication {

    private static final Logger logger = LoggerFactory.getLogger(ProjectOneApplication.class);

    public static void main(String[] args) {
        try {
            SpringApplication.run(ProjectOneApplication.class, args);
            logger.info("Application Project One Started!!");
        } catch (Exception e) {
            logger.error("Application Failed to Start for the reason of: " + e.getMessage());
        }
    }

}
