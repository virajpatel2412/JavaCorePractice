package StringProblems;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "This is string variable";
		
		StringBuilder s = new StringBuilder();
		for(int i=str.length()-1; i>=0; i--)
			s.append(str.charAt(i));
		
		System.out.print(s);
	}

}
