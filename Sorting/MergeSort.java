package Sorting;

public class MergeSort {
	
	public static void merge(int[] arr, int left, int k, int right) {
		int n1 = k-left+1;
		int n2 = right-k;
		
		int[] p = new int[n1+1];
		int[] q = new int[n2+1];
		
		int l = 0;
		for(int i=left; i<=k; i++) 
			p[l++] = arr[i];
		p[n1] = Integer.MAX_VALUE;
		
		l=0;
		for(int i=k+1; i<=right; i++)
			q[l++] = arr[i];
		q[n2] = Integer.MAX_VALUE;
		
		int i = 0;
		int j = 0;
		for(int r=left; r<=right; r++) {
			if(p[i] < q[j]) {
				arr[r] = p[i];
				i++;
			}
			else {
				arr[r] = q[j];
				j++;
			}
		}
	}
	
	public static void mergeSort(int[] arr, int left, int right) {
		int k = (left + right)/2;
		if(left < right) {
			mergeSort(arr, left, k);
			mergeSort(arr, k+1, right);
			merge(arr, left, k, right);

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4,2,6,9,7,4,1,0};
		mergeSort(arr, 0, arr.length-1);
		for(int x : arr)
			System.out.print(x+" ");
	}

}
