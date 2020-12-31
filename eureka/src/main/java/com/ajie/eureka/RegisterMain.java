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
public class RegisterMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// new
		// SpringApplicationBuilder(RegisterMain.class).web(WebApplicationType.NONE).run(args);
		SpringApplication.run(RegisterMain.class, args);
	}

}
