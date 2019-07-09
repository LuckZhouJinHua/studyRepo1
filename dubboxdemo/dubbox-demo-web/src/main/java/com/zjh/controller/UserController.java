package com.zjh.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zjh.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("user")
public class UserController {


    @Reference//引用注解
    private UserService userService;

    @RequestMapping("showname")
    @ResponseBody//直接显示返回的字符串
    public String showName(){
        String name = userService.getName();
        return name;

    }
}
