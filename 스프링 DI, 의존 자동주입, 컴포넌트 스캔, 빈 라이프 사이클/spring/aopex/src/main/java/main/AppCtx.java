package main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import aopex.Calculator;
import aopex.RecCalculator;

@Configuration
@EnableAspectJAutoProxy
public class AppCtx {
	
	@Bean
	public CacheAspect cacheAspect() {
		return new CacheAspect();
	}
	
	
	@Bean
	public ExeTimeAspect exeTimeAspect() {
		return new ExeTimeAspect();
	}
	
	@Bean
	public Calculator calculator() {
		return new RecCalculator();
	}
}
