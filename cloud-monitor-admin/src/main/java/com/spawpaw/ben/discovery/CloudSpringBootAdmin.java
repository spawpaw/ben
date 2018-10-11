package com.spawpaw.ben.discovery;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class CloudSpringBootAdmin {

    public static void main(String[] args) {
        SpringApplication.run(CloudSpringBootAdmin.class, args);
    }
}
