package NumberProblems;

public class GCD_LCM {
	
	public static int GCD(int a, int b) {
		if(b == 0)
			return a;
		return GCD(b, a%b);
	}
	
	public static int LCM(int a, int b) {
		int gcd = GCD(a, b);
		return ((a * b)/gcd);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(GCD(25,5));
		System.out.println(LCM(25,20));
	}

}
