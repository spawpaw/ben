package com.spawpaw.ben.provider;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubboConfig;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

//@EnableAutoConfiguration
@EnableDubboConfig
@EnableDubbo
@SpringBootApplication
public class ProviderPrivilegeService {
    public static void main(String[] args) {
        new SpringApplicationBuilder(ProviderPrivilegeService.class)
                .web(WebApplicationType.NONE)
                .build()
                .run(args);
    }
}
