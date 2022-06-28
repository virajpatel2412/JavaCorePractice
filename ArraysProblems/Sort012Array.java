package ArraysProblems;

public class Sort012Array {
	
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,1,0,1,0,2,0,1,0,2,1,0};
		
		int mid, left=0, right= arr.length-1;
		for(mid=0; mid<=right; mid++) {
			if(arr[mid] == 0)
				swap(arr, mid, left++);
			else if(arr[mid] == 2)
				swap(arr, mid, right--);
			else
				mid++;
			mid--;
		}
		
		for(int x : arr) {
			System.out.print(x+" ");
		}
	}

}
