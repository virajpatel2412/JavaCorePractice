
package ArraysProblems;

import java.util.ArrayList;
import java.util.HashMap;

/*
	Given an array of integers nums[] and an integer target, return indices
	of the two numbers such that their sum is equal to the target.
	
	Input: nums = [2,7,11,15], target = 9
	Output: [0,1]

	Explanation: Because nums[0] + nums[1] == 9, which is the required target, 
	we return indexes [0,1]. (0-based indexing)

*/

public class TwoSum {
	
	public static ArrayList<ArrayList<Integer>> findSum(int[] arr, int key) {
		ArrayList<ArrayList<Integer>> res = new ArrayList<>();
		
		HashMap<Integer, Integer> map = new HashMap<>(); 
		map.put(arr[0], 0);
		for(int i=1; i<arr.length; i++) {
			int f = key - arr[i];
			if(map.containsKey(f)) {
				ArrayList<Integer> sol = new ArrayList<>();
				sol.add(map.get(f));
				sol.add(i);
				res.add(sol);
			}
			else
				map.put(arr[i], i);
		}		
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,7,11,15};
		
		ArrayList<ArrayList<Integer>> res = findSum(arr, 9);	
		System.out.print(res);				
	}
}





