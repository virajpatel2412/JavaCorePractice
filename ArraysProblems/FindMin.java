package ArraysProblems;

public class FindMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,1,5,2,5,7,2,6,3,2,9,8,6,4,3};
		int min = arr[0];
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i] < min)
				min = arr[i];
		}
		System.out.println("Min value is : "+min);
	}

}
