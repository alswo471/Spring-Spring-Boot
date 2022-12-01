package day03;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Client implements InitializingBean, DisposableBean{
private String host;


public void setHost(String host) {
	this.host=host;
}

public void send() {
	System.out.printf("Send to %s\n", host);
}

@Override
public void afterPropertiesSet() throws Exception {
System.out.println("초기화 과정에서 호출됨");
	
}

@Override
public void destroy() throws Exception {
	System.out.println("소멸되기 전에 호출됨");
	
}
}

