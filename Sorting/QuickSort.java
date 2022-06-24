package Sorting;

public class QuickSort {
	
	public static void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	
	public static int partation(int[] arr, int left, int right) {
		int pivot = arr[right];
		int i = left-1;
		
		for(int j=left; j<right; j++) {
			if(arr[j]<pivot) {
				i++;
				swap(arr, i, j);
			}
		}
		swap(arr, i+1, right);
		return (i+1);
	}
	
	public static void quickSort(int[] arr, int left, int right) {
		if(left < right) {
			int mid = partation(arr, left, right);
			quickSort(arr, left, mid-1);
			quickSort(arr, mid+1, right);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,12,5,7,3,7,8,4,5};
		quickSort(arr, 0, arr.length-1);
		
		for(int x : arr)
			System.out.print(x+" ");
		
	}

}
