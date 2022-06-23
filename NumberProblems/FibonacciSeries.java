package NumberProblems;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		
		int a = 1;
		int b = 1;
		System.out.print(a+" "+b+" ");
		for(int i=3; i<=n; i++) {
			int c = a+b;
			a = b;
			b = c;
			System.out.print(c+" ");
		}
	}

}
