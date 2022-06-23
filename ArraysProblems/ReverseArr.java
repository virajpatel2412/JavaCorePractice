package ArraysProblems;

public class ReverseArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6,7,8,9,0};
		
		int left=0;
		int right=arr.length-1;
		while(left < right) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}
		
		for(int x : arr)
			System.out.print(x+" ");
	}

}
