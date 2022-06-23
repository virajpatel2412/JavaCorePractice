package ArraysProblems;

public class RotateLeft {
	
	public static void rotate(int[] arr, int start, int end) {
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
		int[] arr = {1,2,3,4,5,6,7,8,9};
		int k = 20;
		
		int n = arr.length;
		
		k = k%n;
		rotate(arr,0, n-1);
		rotate(arr,0,n-k-1);
		rotate(arr,n-k,n-1);
		
		for(int x : arr) {
			System.out.print(x+" ");
		}
		
	}

}
