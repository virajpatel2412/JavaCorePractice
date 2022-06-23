package ArraysProblems;

public class SecondMinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,3,6,3,6,3,5,7,8,9,0};
		int min = arr[0], max=arr[0], secondmin=arr[0], secondmax=arr[0];
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i] > max) {
				secondmax = max;
				max = arr[i];
			}
			if(arr[i] < min) {
				secondmin = min;
				min = arr[i];
			}
		}
		
		System.out.println("Second min is : "+secondmin);
		System.out.println("Second max is : "+secondmax);
		
	}

}
