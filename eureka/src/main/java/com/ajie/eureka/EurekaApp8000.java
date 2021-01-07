package com.ajie.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @name
 * 
 * @author hongjie.gao
 * @date 2020年12月29日下午2:44:29
 */
@SpringBootApplication // spring-boot 启动注解
@EnableEurekaServer // spring-cloud 服务注解
public class EurekaApp8000 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(EurekaApp8000.class, args);
	}

}
