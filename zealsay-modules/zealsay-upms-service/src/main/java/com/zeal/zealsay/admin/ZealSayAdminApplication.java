package com.zeal.zealsay.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @author zeal
 * @date 2017年10月27日13:59:05
 */
@EnableAsync
@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan(basePackages = {"com.zeal.zealsay.admin", "com.zeal.zealsay.common.bean"})
public class ZealSayAdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZealSayAdminApplication.class, args);
    }
}