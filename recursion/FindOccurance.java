package recursion;

//  find the first and last occurances of the element in string
public class FindOccurance {

	public static int first=-1, last=-1;
	public static void findOccurances(String str, char element, int ind) {
		
		if(ind == str.length()) {
			System.out.println("First index : "+first+" Last index : "+last);
			return;
		}
		
		if(str.charAt(ind) == element) {
			if(first == -1)
				first = ind;
			last = ind;
		}
		findOccurances(str, element, ind+1);
	}

	public static void main(String[] args) {
		
		findOccurances("dsasdfasdfdffd",'d',0);
		
	}

}
