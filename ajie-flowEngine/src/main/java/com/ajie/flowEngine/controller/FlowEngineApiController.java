package com.ajie.flowEngine.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

	@RequestMapping("/testApi")
	public String testApi() {
		return content;
	}
}
