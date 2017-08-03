package com.fei.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;
  
@SpringBootApplication
@EnableHystrixDashboard
@EnableTurbine
public class Application {

	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);
	}
}
