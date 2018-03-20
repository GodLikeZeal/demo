package com.zeal.zealsay.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author zeal
 */
@EnableEurekaServer
@SpringBootApplication
public class ZealSayEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZealSayEurekaApplication.class, args);
	}
}
