package com.zjh.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@ConfigurationProperties(prefix ="student")//自动匹配配置文件字段
public class QuickController3 {
    //配置文件字段  并生成相应的getset方法
    private String name;
    private String phone;
    private String addr;

    @RequestMapping("/quick3")
    public String quick2(){
    //获取yaml配置文件信息
        return name+":"+phone+":"+addr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
}
