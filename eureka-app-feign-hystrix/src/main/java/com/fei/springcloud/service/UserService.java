package com.fei.springcloud.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value="API-USER-SERVER",fallback=UserServiceErrorImpl.class)
public interface UserService {

	@GetMapping(value="/user/find/{id}")
	String find(@PathVariable("id") String id);
}
