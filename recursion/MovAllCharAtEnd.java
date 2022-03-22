package recursion;

// Move all particular char at the end of the string 

public class MovAllCharAtEnd {
	private static int count=0;
	public static void moveEnd(String str, char element, int ind, String newStr){
		if(ind == str.length()) {
			for(int i=0; i<count; i++) {
				newStr += element;
			}
			System.out.println(newStr);
			return;
		}
		
		if(str.charAt(ind) == element)
			count++;
		else 
			newStr += str.charAt(ind);
		
		moveEnd(str, element, ind+1, newStr);
	}

	public static void main(String[] args) {
		moveEnd("aabdsfadwefa",'a',0,"");
	}

}
