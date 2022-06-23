package ArraysProblems;

public class RotateByK {

	
	public static void rotate(int[] arr, int end, int k) {
		int start = end-k+1;
		while(start<end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,3,5,2,6,3,1,7,3,4,8,9,4,2};
		int k = arr.length;
		
		int n = arr.length;
		
		if(k >= n)
			k=n;
		
		int i=0;
		for(i=k-1; i<n; i=i+k) {
			rotate(arr, i, k);
		}
		if(i-k+1 < n-1) {
			rotate(arr, n-1, i-n);
		}
				
		for(int x : arr) {
			System.out.print(x+" ");
		}
	}

}
