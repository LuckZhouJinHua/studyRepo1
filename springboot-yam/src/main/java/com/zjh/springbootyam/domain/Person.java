package com.zjh.springbootyam.domain;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import com.zjh.springbootyam.ReturnCode;
import java.util.List;
import java.util.Map;
@Component
@ConfigurationProperties(prefix = "person")
public class Person {
    private int age;

    private String name;
    private List<Object> hoby;
    private Map<String,String> maps;
    private Dog dog;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Object> getHoby() {
        return hoby;
    }

    public void setHoby(List<Object> hoby) {
        this.hoby = hoby;
    }

    public Map<String, String> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", hoby=" + hoby +
                ", maps=" + maps +
                ", dog=" + dog +
                '}';
    }
}
