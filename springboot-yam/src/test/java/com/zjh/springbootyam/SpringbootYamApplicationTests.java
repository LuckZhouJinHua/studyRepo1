package com.zjh.springbootyam;

import com.zjh.springbootyam.domain.Person;
import com.zjh.springbootyam.domain.Student;
import org.assertj.core.util.Lists;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.ArrayList;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootYamApplicationTests {

    @Resource
    private Person person;

    @Autowired
    private Student student;


    @Test
    public void contextLoads() {
        System.out.println(student);
        System.out.println("person = " + person);
    }

    @Test
    public void testRandom() {
        for (int i = 0; i < 1000; i++) {
            double random = Math.random();
            long v = (long) ((random * 9 + 1) * 100000);
            System.out.println("random = " + v);
        }

        double random = Math.random();
        ArrayList<Integer> ings = Lists.newArrayList();
        for (int i = 0; i < 1000; i++) {
            long v = (long) ((random * 9 + 1) * 1);
            ings.add(Integer.parseInt(v + ""));
        }
        int danNum = 0;
        int shuang = 0;
        for (Integer ing : ings) {
            if (ing > 5) {
                danNum++;
            } else {
                shuang++;
            }

        }
        if (danNum > shuang) {
            System.out.println("买单层的");
        } else {
            System.out.println("买双层的");
        }
    }

}
