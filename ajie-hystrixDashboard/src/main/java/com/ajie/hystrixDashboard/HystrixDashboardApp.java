package com.ajie.hystrixDashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @name 熔断器监控可视化
 * 
 * @author hongjie.gao
 * @date 2021年1月14日下午3:38:42
 */
@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashboardApp {
	public static void main(String[] args) {
		SpringApplication.run(HystrixDashboardApp.class, args);
	}
}
