package com.huang.service;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import com.huang.fallback.MemberFeignFallBack;

/**
 * 使用feign调用其它服务接口
 * fallback当异常或者超时时候，调用服务降级处理
 * @author 41507
 *
 */
@FeignClient(value="server-member",fallback=MemberFeignFallBack.class)
public interface MemberFeign {
	
	//直接使用注解调用其它服务接口
	@RequestMapping("/getMemberAll.do")
	public List<String> getToMember();
}
