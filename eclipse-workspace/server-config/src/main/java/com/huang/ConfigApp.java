package com.huang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
/**
 * 分布式配置中心
 * 从git版本控制中获取配置文件
 * 目前此配置修改文件后需要重新启动调用配置的客户端，
 * 
 * 自动刷新配置：使用springcloudbus技术 ，
 * 依赖消息中间件（kafka,rabbitMQ等   ）未实现
 * 
 * @author 41507
 *
 */
@SpringBootApplication
@EnableConfigServer //配置中心注解
@EnableEurekaClient
public class ConfigApp {

	public static void main(String[] args) {
		SpringApplication.run(ConfigApp.class, args);

	}

}
