package com.huang.filter;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
/**
 * 过滤器
 * @author 41507
 *
 */
@Component
public class MyFilter extends ZuulFilter {

	private static Logger log = LoggerFactory.getLogger(MyFilter.class);
	//过滤类型
	@Override
	public String filterType() {
		/*
		 * (1) PRE：这种过滤器在请求被路由之前调用。我们可利用这种过滤器实现身份验证、在集群中选择请求的微服务、记录调试信息等。
			(2) ROUTING：这种过滤器将请求路由到微服务。这种过滤器用于构建发送给微服务的请求，并使用Apache HttpClient或Netfilx Ribbon请求微服务。
			(3) POST：这种过滤器在路由到微服务以后执行。这种过滤器可用来为响应添加标准的HTTP Header、收集统计信息和指标、将响应从微服务发送给客户端等。
			(4) ERROR：在其他阶段发生错误时执行该过滤器。
		 */
		return "pre";
	}
	//过滤优先级 数字越大优先级越高，越早执行
	@Override
	public int filterOrder() {
		return 0;
	}
	//设置过滤条件
	public boolean shouldFilter() {
//		  return RequestContext.getCurrentContext().getRouteHost() != null
//	                && RequestContext.getCurrentContext().sendZuulResponse();

		return true;
	}
	
	/**
	 * 拦截所有请求
	 * 具体操作
	 */
	public Object run() {
		RequestContext ctx = RequestContext.getCurrentContext();
		HttpServletRequest request = ctx.getRequest();
		log.info(String.format("%s >>> %s", request.getMethod(), request.getRequestURL().toString()));
		//判断是否有token参数
		Object accessToken = request.getParameter("token");
		if (accessToken != null) {
			return null;
		}
		log.warn("token is empty");
		ctx.setSendZuulResponse(false);
		ctx.setResponseStatusCode(401);
		try {
			ctx.getResponse().getWriter().write("token is empty");
		} catch (Exception e) {
		}
		return null;

	}
}
