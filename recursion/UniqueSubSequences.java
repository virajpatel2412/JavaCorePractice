package recursion;

import java.util.HashSet;

//	Print Unique SubSequences of String

public class UniqueSubSequences {

	private static HashSet<String> map = new HashSet<>();
	public static void printSubSequences(String str, int ind, String newStr) {
		if(ind == str.length()) {
			if(!map.contains(newStr)) {
				System.out.println(newStr);
				map.add(newStr);
			}
			return;
		}
		
		char element = str.charAt(ind);
		printSubSequences(str, ind+1, newStr+element);
		printSubSequences(str, ind+1, newStr);
	}

	public static void main(String[] args) {
		printSubSequences("aaaa",0,"");
	}

}
