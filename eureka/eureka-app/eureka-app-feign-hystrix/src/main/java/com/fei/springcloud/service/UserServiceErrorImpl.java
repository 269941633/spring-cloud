package com.fei.springcloud.service;

import org.springframework.stereotype.Component;

@Component
public class UserServiceErrorImpl implements UserService{

	@Override
	public String find(String id) {
		return "根据id查询用户，调用api提供者失败...";
	}

}
