package com.huang.fallback;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.huang.service.MemberFeign;
/**
 * 服务降级，调用本地方法
 * 默认调用其它服务1s内，没响应调用本服务
 * 可配置，超时时间
 * @author 41507
 *
 */
@Component
public class MemberFeignFallBack implements MemberFeign{

	@Override
	public List<String> getToMember() {
		List<String> list = new ArrayList<String>();
		list.add("调用服务异常。。。");
		return list;
	}

}
