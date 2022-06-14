package DataStructure;

import java.util.Stack;

public class BalancedBracket {

	public static boolean isMatch(char a, char b) {
		if(a == '(' && b==')')
			return true;
		if(a=='[' && b==']')
			return true;
		if(a=='{' && b=='}')
			return true;
		return false;
	}
	
	public static int type(char a) {
		if(a == '(' || a=='[' || a=='{')
			return 1;
		else 
			return 2;
					
	}
	
	public static String isBalanced(String str) {
		if(str.length() % 2 == 1)
			return "NO";
		Stack<Character> s = new Stack<>();
		for(char a : str.toCharArray()) {
			if(type(a) == 1)
				s.push(a);
			else {
				char schar;
				try {
					schar = s.pop();
				}
				catch(Exception e) {
					return "NO";
				}
				if(!isMatch(schar, a))
					return "NO";
			}
		}
		if(s.isEmpty())
			return "YES";
		return "NO";
	}
	
	public static void main(String[] args) {
		System.out.println(isBalanced("{{}("));
	}

}
