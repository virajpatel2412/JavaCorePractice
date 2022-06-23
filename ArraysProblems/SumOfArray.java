package ArraysProblems;

public class SumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4,2,6,2,3,6,7,8,5,4};
		int sum = 0;
		
		for(int x : arr)
			sum += x;
		
		System.out.println("Sum of all element is : "+ sum);
	}

}
