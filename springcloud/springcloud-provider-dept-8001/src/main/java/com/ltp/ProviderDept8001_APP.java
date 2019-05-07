package com.ltp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ProviderDept8001_APP {
    public static void main(String[] args) {
        SpringApplication.run(ProviderDept8001_APP.class,args);
    }
}
