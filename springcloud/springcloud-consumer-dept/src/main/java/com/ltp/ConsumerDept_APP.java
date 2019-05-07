package com.ltp;

import com.netflix.loadbalancer.RetryRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
//使用负载均衡
@RibbonClient(name = "DEPT",configuration = RetryRule.class)
public class ConsumerDept_APP {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerDept_APP.class,args);
    }
}
