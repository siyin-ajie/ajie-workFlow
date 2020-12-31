package com.ajie.flowEngine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @name 流程引擎模块启动类
 * 
 * @author hongjie.gao
 * @date 2020年12月29日下午4:44:24
 */

@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient
public class FlowEngineApp {

	public static void main(String[] args) {
		SpringApplication.run(FlowEngineApp.class, args);
	}

}
