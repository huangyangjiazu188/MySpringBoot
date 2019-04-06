package com.huang.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * 提供服务接口
 * @author 41507
 *
 */
@RestController
public class MemberController {
	
	int count = 0;
	
	@Value("${server.port}")
	private String serverPort;
	@RequestMapping("/getMemberAll.do")
	public List<String> getMemberAll(){
		
		
		try {
			//测试超时时候雪崩使用
			Thread.sleep(3000);
			System.out.println("睡眠中。。。");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		count++;
		List<String> list = new ArrayList<String>();
		list.add("张山");
		list.add("王五");
		list.add(serverPort);
		list.add("次数："+count);
		
		return list;
	}
	
	@RequestMapping("/getMemberService.do")
	public String getMemberService(){
		return "member项目工程";
	}
	
	
}
