package ArraysProblems;

import java.util.Arrays;
import java.util.ArrayList;

/*
	Problem Statement: Given an array of N integers, your task is to find unique quads 
	that add up to give a target value. In short, you need to return an array of all the
	quadruplets [arr[a], arr[b], arr[c], arr[d]] such that their sum is equal to a given target.
	
	arr[a] + arr[b] + arr[c] + arr[d] == target
	
*/

public class FourSum {
	
	public static ArrayList<ArrayList<Integer>> findSum (int[] arr, int key){
		ArrayList<ArrayList<Integer>> res = new ArrayList<>();
		
		Arrays.sort(arr);
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				int find = key - arr[i] - arr[j];
				int left = j+1;
				int right = arr.length-1;
				while(left < right) {
					int sum = arr[left]+arr[right];
					if(sum < find)
						left++;
					else if(sum > find)
						right--;
					else {
						ArrayList<Integer> sol = new ArrayList<>();
						sol.add(arr[i]);
						sol.add(arr[j]);
						sol.add(arr[left]);
						sol.add(arr[right]);
						res.add(sol);

						while(left < right && arr[left] == sol.get(2))
							left++;
						while(right > left && arr[right] == sol.get(3))
							right--;
					}
				}
				while(j+1 < arr.length && arr[j+1] == arr[j])
					j++;
			}
			while(i+1 < arr.length && arr[i+1] == arr[i])
				i++;
		}
		
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		int[] arr = {1,0,-1,0,-2,2};
		
		ArrayList<ArrayList<Integer>> res = findSum(arr, 0);
		System.out.print(res);
		
	}

}
