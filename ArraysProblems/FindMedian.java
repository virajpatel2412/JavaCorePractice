package ArraysProblems;

import java.util.Arrays;

public class FindMedian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,6,2,3,6,3,2,8,5,8,9,4,2,5,9};
		
		int n=arr.length;
		Arrays.sort(arr);
		
		for(int x : arr)
			System.out.print(x+" ");
		
		if(n%2 == 1) {
			System.out.println(arr[(n-1)/2]);
		}
		else {
			double median = (double)(arr[(n-1)/2]+arr[((n-1)/2) + 1])/2;
			System.out.println(median);
		}
		
	}

}
