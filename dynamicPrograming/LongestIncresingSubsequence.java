package dynamicPrograming;

import java.util.Arrays;

//	 [1,3,4,2,3,6,3,4,6]   ----   Ans = 5 (1,2,3,4,6)

public class LongestIncresingSubsequence {

	public static void subsequence(int a[]) {
		int n = a.length;
		int lis[] = new int[n];
		Arrays.fill(lis, 1);
		for(int i=0; i<n; i++) {
			for(int j=0; j<i; j++) {
				if(a[j]<a[i])
					lis[i] = Math.max(lis[j]+1, lis[i]);
			}
		}
		
		System.out.println(lis[lis.length-1]);
	}
	
	public static void main(String[] args) {
		int a[] = {1,3,4,2,3,6,3,4,6};
		subsequence(a);
	}

}
