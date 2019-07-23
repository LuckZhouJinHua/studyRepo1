package com.zjh.springbootyam.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import javax.print.DocFlavor;
import java.io.Serializable;

@Data//生成get和set方法 equal方法
@NoArgsConstructor
@AllArgsConstructor
@Component
@ConfigurationProperties(prefix = "student")
public class Student implements Serializable {
    private Integer age;
    private String name;
    private String sex;
}
