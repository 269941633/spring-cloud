package com.fei.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableEurekaClient 
@EnableFeignClients //用于启动Fegin功能
@EnableHystrix    //增加hystrix断路器
@EnableHystrixDashboard  //支持hystrix dashboard
public class Application {

	
	
	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);
	}
}
