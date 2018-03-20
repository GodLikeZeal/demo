package com.zeal.zealsay.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import zipkin.server.EnableZipkinServer;

/**
 * @author zeal
 * @date 2018-01-24
 * zipkin mysql 存储实现
 */
@EnableDiscoveryClient
@SpringBootApplication
@EnableZipkinServer
public class ZealSayZipkinDbApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZealSayZipkinDbApplication.class, args);
    }
}
