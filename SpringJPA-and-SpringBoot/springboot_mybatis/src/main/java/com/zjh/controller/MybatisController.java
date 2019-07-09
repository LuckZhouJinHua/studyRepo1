package com.zjh.controller;


import com.zjh.domain.User;
import com.zjh.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MybatisController {
    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/")
    public List<User> queryUserList(){
        List<User> userList = userMapper.queryUserList();
        for (User user : userList) {
            System.out.println("user = " + user);
        }
        return userList;
    }
}
