package recursion;

// 	Print all possible subsequences of a string

public class Subsequences {

	public static void printSubsequences(String str, int ind, String newStr) {
		if(ind == str.length()) {
			System.out.println(newStr);
			return;
		}
		
		char element = str.charAt(ind);
		printSubsequences(str, ind+1, newStr+element);
		printSubsequences(str, ind+1, newStr);
		
	}

	public static void main(String[] args) {
		printSubsequences("viraj",0,"");
	}

}
