package spring.felix.service.impl;


import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import spring.felix.annotations.Action;
import spring.felix.annotations.Hello;
import spring.felix.service.HelloService;

//@Service @Controller @Repository @Component ��4��Ĭ�ϱ��ӵ�ioc����
//@Action//�Լ�д��annotation
@Component("hello2Ser")
public class HelloServiceImpl implements HelloService {

	@Hello
	public String sayHello(String str) {
		return "hello,"	+ str;
	}


}
