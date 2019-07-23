package com.zjh.springbootyam;

import com.zjh.springbootyam.domain.Person;
import com.zjh.springbootyam.domain.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

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

}
