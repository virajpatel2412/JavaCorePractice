package ArraysProblems;

import java.util.HashSet;

/*
	Given a String, find the length of longest substring without any repeating character.

	Input: s = ”abcabcbb”
	Output: 3
*/

public class LongestSubstringUniqueChar {

	public static int findLongestSubString(String str) {
		int count = 0;
		int maxcount = 0;
		HashSet<Character> set = new HashSet<>();
		
		for(int i=0; i<str.length(); i++) {
			char c = str.charAt(i);
			if(!set.contains(c)) {
				count++;
				set.add(c);
			}
			else {
				count=1;
				set.clear();
				set.add(c);
			}
			maxcount = Math.max(maxcount, count);
		}
		
		return maxcount;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcabcdbb";
		
		System.out.println(findLongestSubString(str));
	}

}
