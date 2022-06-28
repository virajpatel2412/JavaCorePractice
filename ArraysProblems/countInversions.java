package ArraysProblems;

/*
	What is an inversion of an array? Definition: for all i & j < size of array, 
		if i < j then you have to find pair (A[i],A[j]) such that A[j] < A[i].
		
		Input Format: N = 5, array[] = {5,4,3,2,1}

	Result: 10

	Explanation: we have a reverse sorted array and we will 
	get the maximum inversions as for i < j we will always 
	find a pair such that A[j] < A[i]. 
	Example: 5 has index 0 and 3 has index 2 now (5,3) pair 
	is inversion as 0 < 2 and 5 > 3 which will satisfy out 
	conditions and for reverse sorted array we will get 
	maximum inversions and that is (n)*(n-1) / 2.
	For above given array there is 4 + 3 + 2 + 1 = 10 inversions.
		
*/
public class countInversions {

	public static int merge(int[] arr, int left, int mid, int right) {
		int n1 = mid-left+1;
		int n2 = right-mid;
		int[] a = new int[n1+1];
		int[] b = new int[n2+1];
		a[n1] = Integer.MAX_VALUE;
		b[n2] = Integer.MAX_VALUE;
		
		int l = 0;
		for(int i=left; i<=mid; i++) 
			a[l++] = arr[i];
		
		l=0;
		for(int i=mid+1; i<=right; i++)
			b[l++] = arr[i];
		
		
		int inversions = 0;
		int i=0;
		int j=0;
		for(int k=left; k<=right; k++) {
			if(a[i] <= b[j])
				arr[k] = a[i++];
			else {
				arr[k] = b[j];
				inversions += (n1-i);
				j++;
			}
		}
		return inversions;
		
	}
	public static int countInversion(int[] arr, int left, int right) {
		if(left < right) {
			int mid = (left + right)/2;
			int inversions = 0;
			inversions += countInversion(arr, left, mid);
			inversions += countInversion(arr, mid+1, right);
			
			inversions += merge(arr, left, mid, right);
			return inversions;
		}
		return 0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,4,3,2,1};
		
		int inversions = countInversion(arr,0,arr.length-1);
		System.out.println(inversions);
		
	}

}
