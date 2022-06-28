package ArraysProblems;

public class MergeSortedArray {

	public static void insert(int[] arr, int d) {
		int j=1;
		while(j<arr.length && arr[j]<d) {
			arr[j-1] = arr[j];
			j++;
		}
		arr[j-1] = d;
	}
	
	public static void merge(int[] a, int[] b) {
		int first = 0, second = 0;
		
		while(first < a.length) {
			if(a[first] > b[second]) {
				int temp = a[first];
				a[first] = b[second];
				insert(b, temp);
			}
			first++;
		}
	}
	
	public static void printArr(int[] a) {
		for(int x : a)
			System.out.print(x+" ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,3,5,7,8};
		int[] b = {0,7,9,12,15,18};
		
		merge(a, b);
		printArr(a);
		printArr(b);
		
	}

}
