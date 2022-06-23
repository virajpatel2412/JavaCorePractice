package ArraysProblems;

import java.util.LinkedHashMap;
import java.util.Map;

public class RepetingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,6,3,6,3,8,9,1,6,4,2,1};
		Map<Integer, Integer> map = new LinkedHashMap<>();
		
		for(int x : arr) {
			if(!map.containsKey(x))
				map.put(x, 1);
			else
				map.put(x, map.get(x)+1);
		}
		
		
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if(entry.getValue()>1)
				System.out.print(entry.getKey()+" ");
		}
		
	}

}
