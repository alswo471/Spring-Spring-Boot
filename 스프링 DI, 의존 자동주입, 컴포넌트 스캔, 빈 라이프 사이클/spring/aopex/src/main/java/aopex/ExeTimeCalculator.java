package aopex;

public class ExeTimeCalculator {
	private Calculator calculator;
	public ExeTimeCalculator(Calculator calculator) {
		this.calculator = calculator;
	}
	
	public long factorial(long num) {
		long start = System.nanoTime();
		try {
			long result = calculator.factorial(num);
			return result;
		} finally {
			long end = System.nanoTime();
			System.out.printf("걸린 시간 : %d%n", end - start);
		}
		
		
	
	}
}
