
package dynamicPrograming;

public class FibonacciSeries {

	public static void fibonacci(int n) {
		int a[] = new int[n];
		a[0] = 0;
		a[1] = 1;
		for(int i=2; i<n; i++) {
			a[i] = a[i-1]+a[i-2];
		}
		for(int x : a)
			System.out.print(x+" ");
		
	}
	public static void main(String[] args) {
		fibonacci(7);
	}

}
