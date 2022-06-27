package StringProblems;

import java.util.HashMap;
import java.util.Map;

public class CharFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Calculate frequency of each character in a string";
		
		Map<Character,Integer> map = new HashMap<>();
		for(int i=0; i<str.length(); i++) {
			char c = str.charAt(i);
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		
		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}

}
