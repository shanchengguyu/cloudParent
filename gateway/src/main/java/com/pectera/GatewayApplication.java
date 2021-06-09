package com.pectera;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author James
 * @date 2021/6/4
 * @decription
 */
@SpringBootApplication
@EnableDiscoveryClient
public class GatewayApplication {
	public static void main(String[] args) {
		SpringApplication.run(GatewayApplication.class,args);
	}
}
