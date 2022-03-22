package recursion;

public class StringPermutations {

	public static void printPermutations(String str, String combination) {
		if(str.length() == 0) {
			System.out.println(combination);
			return;
		}
		
		for(int i=0; i<str.length(); i++) {
			String newStr = str.substring(0, i)+str.substring(i+1);
			printPermutations(newStr, combination+str.charAt(i));
		}
	}
 
	public static void main(String[] args) {
		String str = new String("");
		printPermutations("abc",str);
	}

}
