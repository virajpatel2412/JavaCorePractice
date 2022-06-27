package StringProblems;

public class ChangeCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Change the case of String";
		StringBuilder s = new StringBuilder();
		
		for(int i=0; i<str.length(); i++) {
			int ascii = (int) str.charAt(i);
			if(ascii >= 65 && ascii <= 90)
				s.append((char)(ascii + 32));
			else if(ascii >= 97 && ascii <= 122)
				s.append((char)(ascii - 32));
			else
				s.append((char)ascii);
		}
		System.out.println(s);
	}

}
