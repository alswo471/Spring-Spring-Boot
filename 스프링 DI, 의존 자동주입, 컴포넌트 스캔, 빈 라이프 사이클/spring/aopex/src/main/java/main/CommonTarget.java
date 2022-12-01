package main;

import org.aspectj.lang.annotation.Pointcut;

public class CommonTarget {
@Pointcut("execution(* aopex..*(..))")
public void calcuTarget() {
	
}
}

