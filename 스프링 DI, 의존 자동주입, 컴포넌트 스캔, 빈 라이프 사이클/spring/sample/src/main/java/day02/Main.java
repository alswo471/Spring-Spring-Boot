package day02;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		// 객체 생성 -> 의존성 해결 -> .... -> 소멸 
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);
		
		Greet greet = ctx.getBean("greeter", Greet.class);
		greet.print();
		
		ctx.close();

	}

}
