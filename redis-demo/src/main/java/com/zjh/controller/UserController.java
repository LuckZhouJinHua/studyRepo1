package com.zjh.controller;

import com.zjh.domain.UserInfo;
import org.jboss.logging.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/redis")
public class UserController {
@Resource
private RedisTemplate redisTemplate;
    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(UserController.class);


 @RequestMapping("/users")
public List findAllUser(){
     List users = (List) redisTemplate.boundHashOps("users").get("user");
    if(users==null || users.size()==0){
        ArrayList<UserInfo> userlist = new ArrayList<UserInfo>();

        //如果为空
        UserInfo user1 = new UserInfo();
        user1.setName("zhangsan");
        user1.setAge(20);
        user1.setSex("女");
        userlist.add(user1);
        UserInfo user2 = new UserInfo();
        user2.setName("lisi");
        user2.setAge(10);
        user2.setSex("男");
        userlist.add(user2);
        //模拟查询数据库
        redisTemplate.boundHashOps("users").put("user",userlist);
        System.out.println("zoule数据库");
        return userlist;
    }
     System.out.println("走了redis");
    return users;
 }
}
