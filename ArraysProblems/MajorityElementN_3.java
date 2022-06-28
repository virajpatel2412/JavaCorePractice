package ArraysProblems;

import java.util.ArrayList;

/*
 
	Given an array of N integers. Find the elements that appear more than N/3 times 
	in the array. If no such element exists, return an empty vector.
		Input:  N = 6, array[] = {11,33,33,11,33,11}
		Output: 11 33
		
*/

public class MajorityElementN_3 {
	
	public static ArrayList<Integer> majorityElement(int[] arr){
		int n = arr.length;
		int num1 = -1, num2 = -1, count1=0, count2=0, i;
		for(i=0; i<n; i++) {
			if(arr[i] == num1)
				count1++;
			else if(arr[i] == num2)
				count2++;
			else if(count1 == 0) {
				num1 = arr[i];
				count1 = 1;
			}
			else if(count2 == 0) {
				num2 = arr[i];
				count2 = 1;
			}
			else {
				count1--;
				count2--;
			}
		}
		ArrayList<Integer> res = new ArrayList<>();
		count1 = count2 = 0;
		for(i=0; i<n; i++) {
			if(arr[i] == num1)
				count1++;
			else if(arr[i] == num2)
				count2++;
		}
		if(count1 > n/3)
			res.add(num1);
		if(count2 > n/3)
			res.add(num2);
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {11,33,33,11,33,11};
		
		ArrayList<Integer> res = majorityElement(arr);
		System.out.println(res);
	}

}
