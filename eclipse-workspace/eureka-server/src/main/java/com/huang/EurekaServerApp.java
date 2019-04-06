package com.huang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
/**
 * 注册中心
 * @author 41507
 *
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApp {
	
	
	public static void main(String[] args) {
		SpringApplication.run(EurekaServerApp.class, args);
	}
	
}
