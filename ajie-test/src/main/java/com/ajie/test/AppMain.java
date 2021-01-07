package com.ajie.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @name
 * 
 * @author hongjie.gao
 * @date 2020年12月29日下午3:53:51
 */

@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient // Eureka Client
public class AppMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(AppMain.class, args);
	}

	@Bean // 定义rest客户端，restTemplate实例
	@LoadBalanced // 开启负载均衡能力
	RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
