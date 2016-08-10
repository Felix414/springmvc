package spring.felix.service.impl;


import org.springframework.stereotype.Component;

import spring.felix.annotations.Hello;
import spring.felix.service.HelloService;


@Component
public class Hello2ServiceImpl implements HelloService {

	public String sayHello(String str) {
		return "hello2,"	+ str;
	}


}
