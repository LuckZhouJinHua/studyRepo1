package cn.itcast.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@Autowired
	private Environment env;
	//新增测试
	@RequestMapping(value = "/info",method = RequestMethod.GET,name = "AAA")
	public String info(){
		return "HelloWorld!!"+env.getProperty("url");
	}

	@RequestMapping("/urlinfo")
	 public String findInfo(){
		return env.getProperty("url");

	 }

}
