package NumberProblems;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 352;
		int temp = num;
		
		int sum = 0;
		while(temp > 0) {
			sum = sum*10 + temp%10;
			temp = temp/10;
		}
		System.out.println("Reverse number is "+sum);
	}

}
