package com.zjh.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class quickController {

    @RequestMapping("/test")
    public String index() {
        return "hello world25555";
    }
}
