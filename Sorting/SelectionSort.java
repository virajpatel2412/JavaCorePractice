package Sorting;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4,3,1,7,9,6,2,5};
		int n = arr.length;
		
		for(int i=0; i<n; i++) {
			int min = i;
			for(int j=i; j<n; j++) {
				if(arr[j] < arr[min]) 
					min = j;
			}
			if(min != i) {
				int temp = arr[min];
				arr[min] = arr[i];
				arr[i] = temp;
			}
		}
		for(int x : arr)
			System.out.print(x+" ");
	}

}
