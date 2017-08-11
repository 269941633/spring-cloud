package com.fei.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy   
@SpringCloudApplication 
@EnableHystrixDashboard
public class ZuulFilterApplication {

	public static void main(String[] args) {

		SpringApplication.run(ZuulFilterApplication.class, args);
	}
}
