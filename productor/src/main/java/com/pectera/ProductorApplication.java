package com.pectera;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author James
 * @date 2021/5/6
 * @decription
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ProductorApplication {
	public static void main(String[] args) {
		SpringApplication.run(ProductorApplication.class,args);
	}
}
