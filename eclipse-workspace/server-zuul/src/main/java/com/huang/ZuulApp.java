package com.huang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * 网关项目 zuul可以解决跨域问题
 * 拦截所有请求，过滤请求
 * 
 * nginx类似反向代理
 * 
 * Zuul可以通过加载动态过滤机制，从而实现以下各项功能：
	验证与安全保障: 识别面向各类资源的验证要求并拒绝那些与要求不符的请求。
	审查与监控: 在边缘位置追踪有意义数据及统计结果，从而为我们带来准确的生产状态结论。
	动态路由: 以动态方式根据需要将请求路由至不同后端集群处。
	压力测试: 逐渐增加指向集群的负载流量，从而计算性能水平。
	负载分配: 为每一种负载类型分配对应容量，并弃用超出限定值的请求。
	静态响应处理: 在边缘位置直接建立部分响应，从而避免其流入内部集群。
	多区域弹性: 跨越AWS区域进行请求路由，旨在实现ELB使用多样化并保证边缘位置与使用者尽可能接近。
 * @author 41507
 *
 */
@EnableZuulProxy//开启网关
@SpringBootApplication
@EnableEurekaClient 
public class ZuulApp {
	
	public static void main(String[] args) {
		SpringApplication.run(ZuulApp.class, args);
	}
	
	


	
	
}
