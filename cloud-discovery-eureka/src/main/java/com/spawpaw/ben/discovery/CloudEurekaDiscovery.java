package com.spawpaw.ben.discovery;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CloudEurekaDiscovery {

    public static void main(String[] args) {
        SpringApplication.run(CloudEurekaDiscovery.class, args);
    }
}
