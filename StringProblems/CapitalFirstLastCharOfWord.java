package StringProblems;

public class CapitalFirstLastCharOfWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "This is a sentence";
		int length = str.length();
		
		StringBuilder s = new StringBuilder();
		String prev = "-";
		for(int i=0; i<=length-1; i++) {
			String cur = str.charAt(i)+"";
			if(i==0 || i==length-1 || prev.equals(" ") || str.charAt(i+1)==' ') {
				s.append(cur.toUpperCase());
			}
			else
				s.append(cur);
			prev = cur;
		}
		System.out.println(s);
	}

}
