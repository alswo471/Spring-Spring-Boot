package main;

import java.util.HashMap;
import java.util.Map;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;

@Aspect
@Order(1)
public class CacheAspect {
	private Map<Long, Object> caches = new HashMap<>();

	

	//@Around("ExeTimeAspect.calcuTarget()")
	//@Around("execution(* aopex..*(..))")
	@Around("CommonTarget.calcuTarget()")
	public Object cache(ProceedingJoinPoint joinPoint) throws Throwable {

		Long num = (Long)joinPoint.getArgs()[0];
		if(caches.containsKey(num)) {
			System.out.printf("캐시에서 가져옴[%d]%n", num);
			return caches.get(num);
		}
		Object result = joinPoint.proceed();
		caches.put(num, result);
		System.out.printf("캐시에 추가[%d]%n", num);
		return result;

	}

}
