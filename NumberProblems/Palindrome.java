package NumberProblems;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 110011;
		int x = num;
		int temp = 0;
		while(num > 0) {
			temp = temp*10 + num%10;
			num = num/10;
		}
		if(temp == x) 
			System.out.println("Number is palindrome ");
		else
			System.out.println("Number is not palindrome");
	}

}
