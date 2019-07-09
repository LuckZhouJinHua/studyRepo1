package cn.itcast.demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * 消息生产者
 * @author Administrator
 *
 */
@RestController
public class QueueController {


	@Autowired(required = false)
	private JmsMessagingTemplate jmsMessagingTemplate;
	
	@RequestMapping("/send")
	public void send(String text){

		text = "sdsd";
		jmsMessagingTemplate.convertAndSend("itcast", text);
	}
	
	
	@RequestMapping("/sendmap")
	public void sendMap(){
		Map map=new HashMap<>();
		map.put("mobile", "17671429756");
		map.put("template_code", "SMS_164151010");
		map.put("sign_name","有品商城");
		map.put("param", "{\"code\":\"1215\"}");
		
		jmsMessagingTemplate.convertAndSend("sms", map);
	}
}
