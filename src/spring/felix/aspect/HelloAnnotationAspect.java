package spring.felix.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect @Component
public class HelloAnnotationAspect {

	@Before("@annotation(spring.felix.annotations.Hello)")//用@Hello标记的方法都切
	public void cutSayHello(){
		System.out.println("annotation cut say hello");
	}
}
