package NumberProblems;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 153;
		int temp = num;
		
		int sum = 0;
		while(temp > 0) {
			int x = temp%10;
			sum = sum + x*x*x;
			temp = temp/10;
		}
	
		if(num == sum)
			System.out.println(num + " is Armstrong number");
		else
			System.out.println(num + " is not Armstrong number");
		
	}

}
