# 스프링 설정 클래스 

<br>

#### @Configuration

- 애노테이션은 해당 클래스를 스프링 설정 클래스로 

~~~java
package day01;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppContext {
	
	@Bean
	public Greeter greeter() {
		Greeter g = new Greeter();
		g.setFormat("%s, 안녕하세요.");
		return g;
	}
}
~~~

<br>

#### @Bean

-  스프링이 생성한 객체를 빈(Bean)객체라고 부른다. 
- @Bean 애노테이션을 메서드에 붙이면 해당 메서드가 생성한 객체를 스프링이 관리하는 빈 객체를 등록
- @Bean 애노테이션을 붙인 메서드의 이름은 빈 객체를 구분할 때 사용 그리고 이 이름은 빈 객체를 참조할 때 사용된다.

- @Bean 애노테이션을 붙인 메서드는 객체를 생성하고 알맞게 초기화 해야 한다.

~~~java
@Bean
public Greeter greeter() {
	Greeter g = new Greeter();
	g.setFormat("%s, 안녕하세요.");
	return g;
}
~~~

<br>

#### AnnotationConfigApplicationContext

- AnnotationConfigApplicationContext 클래스는 자바 설정에서 정보를 읽어와 빈 객체를 생성하고 관리

- AnnotationConfigApplicationContext 객체를 생설할 때 앞서 작성한 AppContext 클래스를 생성자 매개변수로 전달하고,  AnnotationConfigApplicationContext는 AppContext에 정의한 @Bean 설정 정보를 읽어와 Greeter 객체를 생성하고 초기화한다.

- getBean() 메서드는 AnnotationConfigApplicationContext가 자바 설정을 읽어와 생성한 빈(Bean) 객체를 검색할 때 사용

~~~java
package day01;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppContext.class);
		Greeter g = ctx.getBean("greeter", Greeter.class);
		String msg = g.greet("스프링");
		System.out.println(msg);
		ctx.close();
	}
}

//실형결과 스프링, 안녕하세요.
~~~

<br>

#### 싱글톤 객체

~~~java
package day01;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main2 {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppContext.class);
		Greeter g1 = ctx.getBean("greeter", Greeter.class);
		Greeter g2 = ctx.getBean("greeter", Greeter.class);
		System.out.println("(g1 == g2) = " + (g1 == g2));
		ctx.close();
	}
}
//실행 결과(g1 == g2) = true
~~~