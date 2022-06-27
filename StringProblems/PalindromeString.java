package StringProblems;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aabaa";
		int n = str.length();
		
		int left = 0;
		int right = n-1;
		
		while(left < right) {
			if(str.charAt(left) != str.charAt(right)) {
				System.out.print(str + " is not palindrome string");
				break;
			}
			left++;
			right--;
		}
		System.out.println(str + " is palindrome string");
	}

}
