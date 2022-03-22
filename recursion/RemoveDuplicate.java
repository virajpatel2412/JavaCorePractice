package recursion;

// Remove duplicate element from the string

public class RemoveDuplicate {

	private static boolean[] map = new boolean[26];
	public static void removeDuplicate(String str, int ind, String newStr) {
		
		if(ind == str.length()) {
			System.out.println(newStr);
			return;
		}
		
		if( !map[str.charAt(ind) - 'a'] ) {
			map[str.charAt(ind) - 'a'] = true;
			newStr += str.charAt(ind);
		}
		removeDuplicate(str, ind+1, newStr);
	}

	public static void main(String[] args) {
		removeDuplicate("adfadaeasdfaefszz",0,"");
	}

}
