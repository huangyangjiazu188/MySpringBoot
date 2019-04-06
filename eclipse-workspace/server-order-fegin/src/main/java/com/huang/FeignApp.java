package com.huang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
/**
 * 使用feign技术调用其它服务接口
 * @author 41507
 *
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients //开启feign客户端  自带负载均衡
public class FeignApp {

	public static void main(String[] args) {
		SpringApplication.run(FeignApp.class, args);

	}

}
