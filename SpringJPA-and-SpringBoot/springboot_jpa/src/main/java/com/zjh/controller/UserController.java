package com.zjh.controller;

import com.zjh.domain.User;
import com.zjh.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/")
    public List<User> jpaTest(){
        List<User> userList = userRepository.findAll();
        return userList;
    }
}
