package com.zjh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

@SpringBootApplication
//开启eureak服务端
//当项目启动时 注册中心就启动了
@EnableEurekaServer
public class EureakServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EureakServerApplication.class, args);

	}


}
