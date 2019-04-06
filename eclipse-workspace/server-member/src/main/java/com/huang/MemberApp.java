package com.huang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
/**
 * 提供服务
 * @author 41507
 *
 */
@SpringBootApplication
@EnableEurekaClient
public class MemberApp {

	public static void main(String[] args) {
		SpringApplication.run(MemberApp.class, args);

	}

}
