package aopex;

public class ImpeCalcultor  implements Calculator{

	@Override
	public long factorial(long num) {
		// 4! -> 4 * 3 * 2 * 1 
		
		long result = 1;
		
		for(long i = 1; i <= num; i++) {
			result *= i;
		}
		return result;
	}

}
