package day02;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppCtx {
	
	@Bean
	@Qualifier("mperson2")
	public Meta2Person person2() {
		return new Meta2Person("이름2", 40);  
	}
	
	@Bean
	public MetaPerson person() {
		return new MetaPerson("이름1", 40);  
	}

	@Bean
	public Greet greeter() {
		return new Greet();
	}
}
