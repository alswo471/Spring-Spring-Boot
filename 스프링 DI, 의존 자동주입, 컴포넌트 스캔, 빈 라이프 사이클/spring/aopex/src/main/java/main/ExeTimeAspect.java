package main;



import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;

@Aspect
@Order(2)
public class ExeTimeAspect {
	
//	@Pointcut("execution(public * aopex..*(..))")
//	public void calcuTarget() { 
//		
//	}
	//@Around("calcuTarget()")
	@Around("CommonTarget.calcuTarget()")
	public Object calcu(ProceedingJoinPoint joinPoint) throws Throwable{
		long start = System.nanoTime();
		
		try {
			Object result = joinPoint.proceed(); // 핵심 기능
			
			return result;
		} finally {
			long end = System.nanoTime();
			Signature sig = joinPoint.getSignature();
			System.out.printf("걸린시간 : %d%n", end - start);
			System.out.printf("클래스 : %s%n", joinPoint.getTarget().getClass().getName());
			System.out.printf("시그니쳐 : : %s%n",sig.getName());
			System.out.printf("Args : %s%n", java.util.Arrays.toString(joinPoint.getArgs()));
		}
		
		
	}
}
