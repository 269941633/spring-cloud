package com.fei.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.fei.springcloud.filter.TestPre02Filter;
import com.fei.springcloud.filter.TestPostFilter;
import com.fei.springcloud.filter.TestPre01Filter;

@EnableZuulProxy   
@SpringCloudApplication 
public class ZuulFilterApplication {

	public static void main(String[] args) {

		SpringApplication.run(ZuulFilterApplication.class, args);
	}
	
	@Bean
	public TestPre01Filter testPre01Filter(){
		return new TestPre01Filter();
	}
	
	@Bean
	public TestPre02Filter testPre02Filter(){
		return new TestPre02Filter();
	}
	
	
	@Bean
	public TestPostFilter testPostFilter(){
		return new TestPostFilter();
	}
	
}
