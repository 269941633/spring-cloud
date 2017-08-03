package com.fei.springcloud.provider;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserProvider {

	@GetMapping(value="/find/{id}")
	public String find(@PathVariable("id") String id,HttpServletRequest request){
		//实际项目中，这里可以使用JSONObject，返回json字符串
		//为了便于测试消费者app的负载均衡，返回服务端端口
		String s = "张三"+"     服务端端口："+request.getLocalPort();
		
		return s;
	}
}
