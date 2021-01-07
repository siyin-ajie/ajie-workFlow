package com.ajie.flowEngine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @name 流程引擎模块启动类
 * 
 * @author hongjie.gao
 * @date 2020年12月29日下午4:44:24
 */

@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class FlowEngineApp {

	public static void main(String[] args) {
		SpringApplication.run(FlowEngineApp.class, args);
	}

	@Bean // 定义rest客户端，restTemplate实例
	@LoadBalanced // 开启负载均衡能力
	RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
