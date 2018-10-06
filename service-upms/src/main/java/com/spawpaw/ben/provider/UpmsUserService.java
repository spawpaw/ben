package com.spawpaw.ben.provider;

import com.spawpaw.ben.api.service.upms.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan(basePackages = "com.spawpaw.ben.api.entity")
@ComponentScan(basePackageClasses = {
        UserService.class,
        RoleService.class,
        PrivilegeService.class,
        RoleHasPrivilegeService.class,
        UserHasRoleService.class,
})
@ComponentScan(basePackages = "com.spawpaw.ben.provider.service")
@EnableDiscoveryClient
public class UpmsUserService {
    public static void main(String[] args) {
        SpringApplication
                .run(UpmsUserService.class, args);
    }
}
