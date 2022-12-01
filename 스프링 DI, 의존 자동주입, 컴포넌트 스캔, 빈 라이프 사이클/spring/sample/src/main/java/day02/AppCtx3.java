package day02;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppCtx3 {
	@Bean
	public Client client() {
		Client client = new Client();
		client.setHost("Host!");
		return client;
	}
}
