package spring.felix.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
public class HelloAspect {

	@Before("execution(* spring.felix.service.HelloService.sayHello(..))")
	public void cutSayHello(){
		System.out.println("cut say hello");
	}
}
