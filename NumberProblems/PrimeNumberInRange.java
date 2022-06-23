package NumberProblems;

public class PrimeNumberInRange {
	
	public static boolean isPrime(int n) {
		for(int i=2; i<n/2; i++) {
			if(n%i == 0) 
				return false;
		}
		return true;		
	}
	
	public static void printPrimes(int start, int end) {
		for(int i=start; i<=end; i++) {
			if(isPrime(i))
				System.out.println(i);
		}
	}
	
	public static void main(String args[]) {
		int start = 12;
		int end = 100;
		
		printPrimes(start, end);
		
	}
}
