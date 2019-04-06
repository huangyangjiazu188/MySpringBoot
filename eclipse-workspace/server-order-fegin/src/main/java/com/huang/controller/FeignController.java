package com.huang.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.huang.service.MemberFeign;

@RestController
public class FeignController {
	@Autowired
	private MemberFeign memberFeign;
	
	@RequestMapping("/getMemberAllOnFeign.do")
	public List<String> getMemberAll(){
		return memberFeign.getToMember();
	}
	
	@RequestMapping("/getOrder.do")
	public String getOrder(){
		return "getOrder";
	}
	
	
	
}
