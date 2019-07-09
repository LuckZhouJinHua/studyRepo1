package com.zjh.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuickController2 {
    //普通字符串
    @Value("${name}")
    private String username;
    //对象
    @Value("${student.phone}")
    private String phone;
    @RequestMapping("/quick2")
    public String quick2(){
    //获取yaml配置文件信息
        return username+":"+phone;
    }
}
