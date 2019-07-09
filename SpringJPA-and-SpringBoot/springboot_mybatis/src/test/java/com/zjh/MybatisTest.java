package com.zjh;

import com.zjh.domain.User;
import com.zjh.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

//springboot集成junit
@RunWith(SpringRunner.class)
@SpringBootTest(classes =SpringbootMybatisApplication.class)
public class MybatisTest {

    @Autowired
    private UserMapper userMapper;
    @Test
    public void testMybatis(){
        List<User> users = userMapper.queryUserList();
        for (User user : users) {
            System.out.println("user = " + user);
        }
    }
}
