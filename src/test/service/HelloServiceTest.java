package test.service;

import static org.junit.Assert.*;
import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import spring.felix.service.HelloService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:META-INF/applicationContext.xml")
public class HelloServiceTest {

	//@Autowired
	//@Resource
	@Resource(name = "hello2Ser")
	private HelloService helloService;
	
	@Test
	public void testSayHello(){
		String say = helloService.sayHello(" world!");
		System.out.println(say);
		assertTrue(true);
	}
}
