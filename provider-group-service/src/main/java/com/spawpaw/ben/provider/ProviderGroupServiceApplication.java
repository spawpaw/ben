package com.spawpaw.ben.provider;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubboConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
//@EnableAutoConfiguration
@EnableDubboConfig
@EnableDubbo
public class ProviderGroupServiceApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(ProviderGroupServiceApplication.class)
                .web(WebApplicationType.NONE)
                .build()
                .run(args);
    }
}
