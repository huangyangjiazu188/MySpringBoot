package com.huang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * 项目更具rest 调用其它服务
 * 增加ribbon负载均衡
 * 
 * 读取注册中心配置文件
 * 	注意：注册中心在git上配置文件名称（项目名称+dev等）
 * @author 41507
 *
 */
@SpringBootApplication
@EnableEurekaClient
public class OrderApp {
	
	public static void main(String[] args) {
		SpringApplication.run(OrderApp.class, args);
	}
	
	

	@Bean //将bean加载到容器
	@LoadBalanced //支持负载均衡  ribbon (哪里调用集成到那个项目中)
	RestTemplate restTemplate() {
		return new RestTemplate();
	}
	
	
}
