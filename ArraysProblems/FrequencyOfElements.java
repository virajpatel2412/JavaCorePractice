package ArraysProblems;

import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,2,1,5,3,5,6,3,4,7,8,4,5,3,2,5,7,3,2};
		
		Map<Integer, Integer> map = new LinkedHashMap<>();
		
		for(int x : arr) {
			if(map.containsKey(x)) {
				map.put(x, map.get(x)+1);
			}
			else
				map.put(x, 1);
		}
		
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() +" "+ entry.getValue());
		}
		
	}

}
