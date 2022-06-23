package NumberProblems;

public class IsPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 13;
		
		boolean isPrime = true;
		for(int i=2; i<num/2; i++) {
			if(num%i == 0) {
				isPrime = false;
				break;
			}
		}
		if(isPrime)
			System.out.println(num +" is Prime Number");
		else
			System.out.println(num +" is not Prime Number");
	}

}
