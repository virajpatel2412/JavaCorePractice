package NumberProblems;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 2000;
		
		if(num%4 == 0 && num%100 != 0 || num%400 == 0)
			System.out.println(num + " is Leap year");
		else
			System.out.println(num + " is not Leap year");
	}

}
