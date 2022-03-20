package recursion;

public class Fibonacci {
	
	public static int Fibonnaci(int n) {
		if(n==0 || n==1) {
			return n;
		}
		else {
			return Fibonnaci(n-1)+Fibonnaci(n-2);
		}
	}
	
	public static void printSeries(int n) {
		for(int i=0; i<n; i++) {
			System.out.print(Fibonnaci(i)+" ");
		}
	}


	public static void main(String[] args) {
		printSeries(12);
	}
}
