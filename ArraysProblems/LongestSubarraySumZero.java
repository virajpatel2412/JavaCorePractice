package ArraysProblems;

import java.util.ArrayList;
import java.util.HashMap;

public class LongestSubarraySumZero {

	public static ArrayList<Integer> findSubArray(int[] arr){
		ArrayList<Integer> res = new ArrayList<>();
		
		HashMap<Integer, Integer> map = new HashMap<>();
		int maxi = 0, sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
			if(sum == 0) {
				res.clear();
				res.add(0);
				res.add(i);
				maxi = i+1;
			}
			else {
				if(map.containsKey(sum)) {
					if(maxi < i-map.get(sum)) {
						res.clear();
						res.add(maxi+1);
						res.add(i);
						maxi = i-map.get(sum);
					}
				}
				else
					map.put(sum, i);
			}
		}
		return res;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,-1,3,2,-2,-8,1,7,10,23};
		
		ArrayList<Integer> res = findSubArray(arr);
		System.out.println("Subarray between given indices : "+res);
	}

}
