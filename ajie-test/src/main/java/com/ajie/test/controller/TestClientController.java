package com.ajie.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ajie.test.service.TestFeignService;

/**
 * @name 测试调用
 * 
 * @author hongjie.gao
 * @date 2020年12月29日下午4:51:10
 */
@RestController
@RequestMapping(value = "testClient")
public class TestClientController {
	@Autowired
	private TestFeignService testFeignService;

	@GetMapping("/testFeign")
	public String testServer() {
		return testFeignService.testApi();
	}
}
