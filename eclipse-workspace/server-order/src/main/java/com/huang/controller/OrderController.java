package com.huang.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.huang.service.OrderService;

@RestController
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	
	@RequestMapping("/getOrderAll.do")
	public List<String> getOrderAll(){
		System.out.println("订单服务调用测试服务");
		return orderService.getOrderUserAll();
	}
	
	@RequestMapping("/getOrderService.do")
	public String getOrderService(){
		return "order项目工程";
	}
	
	
	@Value("${name}")
    private String name;
    @Value("${age}")
    private String age;

    @RequestMapping("/test")
    public String test(){
    	System.out.println("调用配置中心系统，获取配置");
        return "这就是配置："+this.name+":"+this.age;
    }
	
	
	
}
