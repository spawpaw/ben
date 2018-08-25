package com.spawpaw.ben.provider;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubboConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * Created By spawpaw@hotmail.com  2018-08-24
 *
 * @author BenBenShang spawpaw@hotmail.com
 */
@SpringBootApplication
//@EnableAutoConfiguration
@EnableDubboConfig
@EnableDubbo
@MapperScan(basePackages = "com.spawpaw.ben.provider.dao")
public class ProviderUserService {
    public static void main(String[] args) {
        new SpringApplicationBuilder(ProviderUserService.class)
                .web(WebApplicationType.NONE)
                .build()
                .run(args);
    }
}
