package com.ajie.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

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

}
