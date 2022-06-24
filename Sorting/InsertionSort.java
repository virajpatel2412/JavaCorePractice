package Sorting;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4,2,1,5,6,8,3,4,7};
		int n = arr.length;
		
		for(int i=1; i<n; i++) {
			int j=i-1;
			int temp = arr[i];
			while(j>=0 && arr[j]>temp) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1]=temp;
		}
	
	
	for(int x : arr)
		System.out.print(x+" ");
	}
}
