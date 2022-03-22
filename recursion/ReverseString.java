package recursion;

public class ReverseString {

	public static void printReverse(String str, int ind) {
		if(ind == str.length()) {
			return;
		}
		printReverse(str, ind+1);
		System.out.print(str.charAt(ind));
	}

	public static void main(String[] args) {
		printReverse("Viraj",0);
	}

}
