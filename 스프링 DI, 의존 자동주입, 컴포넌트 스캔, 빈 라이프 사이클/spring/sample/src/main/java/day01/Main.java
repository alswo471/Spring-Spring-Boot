package day01;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
	AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);
	
	Greet greet = ctx.getBean("greet", Greet.class);
	
	greet.greet("이름1");
	ctx.close();
	}

}
