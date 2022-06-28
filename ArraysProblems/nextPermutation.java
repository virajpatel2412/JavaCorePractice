package ArraysProblems;

import java.util.Arrays;

public class nextPermutation {
	
	public static void swap(Integer[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr = {1,6,4,5};
		int n = arr.length, k;
		
		for(k=n-2; k>=0; k--) {
			if(arr[k]<arr[k+1])
				break;
		}
		swap(arr, k, n-1);
		if(k < 0)
			Arrays.sort(arr, (a,b) ->  (b-a));
		else
			Arrays.sort(arr, k+1, n-1);
		
		for(Integer x : arr)
			System.out.print(x+" ");
		
	}

}
