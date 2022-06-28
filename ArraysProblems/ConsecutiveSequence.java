package ArraysProblems;

/*
	You are given an array of ‘N’ integers. You need to find the length 
	of the longest sequence which contains the consecutive elements.
	Input: [100, 200, 1, 3, 2, 4]

	Output: 4

	Explanation: The longest consecutive subsequence is 1, 2, 3, and 4.

*/

import java.util.Arrays;
import java.util.HashSet;

public class ConsecutiveSequence {

	public static int sequenceLength(int[] arr) {
		Arrays.sort(arr);
		
		int maxsequence = 1;
		int curseq = 1;
		int prev = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(arr[i] == prev+1) {
				curseq++;
			}
			else
				curseq = 1;
			maxsequence = Math.max(curseq, maxsequence);
			prev = arr[i];
		}
		return maxsequence;
	}
	
	public static int sequenceLengthOptimized(int[] arr) {
		int n = arr.length;
		int maxsequence = 0;
		
		HashSet<Integer> set = new HashSet<>();
		for(int x : arr)
			set.add(x);
		for(int i=0; i<n; i++) {
			int curseq = 1;
			int element = arr[i];
			if(!set.contains(element-1)) {
				while(set.contains(++element))
					curseq++;
				maxsequence = Math.max(maxsequence, curseq);
			}
		}
		return maxsequence;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {100,200,1,3,2,4};
		
		System.out.print(sequenceLengthOptimized(arr));
	}

}
