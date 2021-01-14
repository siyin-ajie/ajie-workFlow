package com.ajie.flowEngine.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.hystrix.FallbackHandler;
import com.netflix.ribbon.proxy.annotation.Hystrix;

/**
 * @name 对外提供服务
 * 
 * @author hongjie.gao
 * @date 2020年12月29日下午4:46:53
 */
@RestController
@RequestMapping(value = "/flowEngineApi")
public class FlowEngineApiController {
	@Value("${content}")
	String content;

	// @HystrixCommand(fallbackMethod = "testApiError", commandProperties = {
	// // 降级处理超时时间设置
	// @hy(name = "execution.isolation.thread.timeoutInMilliseconds", value =
	// "3000"),
	// // 任意时间点允许的最高并发数。超过该设置值后，拒绝执行请求。
	// @HystrixProperty(name = "fallback.isolation.semaphore.maxConcurrentRequests",
	// value = "1000") },
	// // 配置执行的线程池
	// threadPoolProperties = { @HystrixProperty(name = "coreSize", value = "20"),
	// @HystrixProperty(name = "maxQueueSize", value = "-1"), },
	// // 该异常不执行熔断，去执行该异常抛出的自己逻辑
	// ignoreExceptions = { NoSuchMethodException.class })
	@HystrixCommand(fallbackMethod = "testApiError")
	@RequestMapping("/testApi")
	public String testApi() {
		return content;
	}

	public String testApiError() {
		return "testApi:parameter:" + "error!";
	}
}
