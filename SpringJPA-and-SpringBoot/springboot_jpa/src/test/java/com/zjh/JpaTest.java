package com.zjh;

import com.zjh.domain.User;
import com.zjh.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootJpaApplication.class)
public class JpaTest {
    @Autowired
    private UserRepository userRepository;

    @Test
    public void test(){
        List<User> userList = userRepository.findAll();
        for (User user : userList) {
            System.out.println("user = " + user);
        }
    }


}
