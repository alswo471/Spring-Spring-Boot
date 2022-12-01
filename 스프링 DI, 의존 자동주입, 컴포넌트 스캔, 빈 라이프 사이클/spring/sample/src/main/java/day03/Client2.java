package day03;

public class Client2 {
	private String host;

	public void setHost(String host) {
		this.host = host;
	}

	public void send() {
		System.out.printf("Send to %s\n", host);
	}
	
	public void init() {
		System.out.println("초기화");
	}
	
	public void close() {
		System.out.println("close!!");
	}
	
}
