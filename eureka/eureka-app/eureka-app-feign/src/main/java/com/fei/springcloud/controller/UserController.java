package com.fei.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fei.springcloud.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
    private UserService userService;

    @GetMapping(value = "/find")
    @ResponseBody
    public String find() {
    	//url中对应api提供者的名称，全大写
    	String s = userService.find("123");
        return s;
    }
	
  
}
