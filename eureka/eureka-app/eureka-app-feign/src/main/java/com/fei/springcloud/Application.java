package com.fei.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@EnableEurekaClient 
@EnableFeignClients //用于启动Fegin功能
@SpringBootApplication
public class Application {

	
	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);
	}
}
