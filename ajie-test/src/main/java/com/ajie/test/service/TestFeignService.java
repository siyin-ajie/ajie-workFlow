package com.ajie.test.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @name 测试使用feign链接生产者API
 * 
 * @author hongjie.gao
 * @date 2020年12月29日下午4:57:01
 */
// 生产者的服务名
@FeignClient(name = "ajie-flowEngine")
public interface TestFeignService {

	// 生产者所提供的接口
	@GetMapping(value = "/flowEngineApi/testApi")
	String testApi();
}
