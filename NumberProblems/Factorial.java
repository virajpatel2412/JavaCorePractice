package NumberProblems;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		
		int fact = 1;
		for(int i=2; i<=n; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of "+n+" is "+fact);
	}

}
