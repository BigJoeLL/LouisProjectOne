package com.louis.projectone;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@Slf4j
@SpringBootApplication
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
public class ProjectoneApplication {

	public static void main(String[] args) {
		try {
			SpringApplication.run(com.louis.projectone.ProjectoneApplication.class, args);
			log.info("Application Project One Started!!");
		} catch (Exception e) {
			log.error("Application Failed to Start for the reason of: " + e.getMessage());
		}
	}

}
