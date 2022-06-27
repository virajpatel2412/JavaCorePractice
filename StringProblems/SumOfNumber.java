package StringProblems;

public class SumOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "12342";
		int num =Integer.parseInt(str);
		
		int sum = 0;
		while(num > 0) {
			sum = sum + num%10;
			num = num/10;
		}
		System.out.print("Sum of all char is : "+sum);
	}

}
