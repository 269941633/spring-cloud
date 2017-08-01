package com.fei.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
    private RestTemplate restTemplate;

	@HystrixCommand(fallbackMethod = "findError") //如果请求失败或超时
    @GetMapping(value = "/find")
    @ResponseBody
    public String find() {
    	//url中对应api提供者的名称，全大写
		System.out.println("向api提供者发起请求........");
    	String s = restTemplate.getForEntity("http://API-USER-SERVER/user/find/123", String.class).getBody();
        return s;
    }
	
	
	public String findError(){
		return "查询用户，调用api失败....";
	}
	
   
}
