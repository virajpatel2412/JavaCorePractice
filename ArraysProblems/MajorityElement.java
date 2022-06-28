package ArraysProblems;

/*
 	Given an array of N integers, write a program to return an element 
	that occurs more than N/2 times in the given array. 
	You may consider that such an element always exists in the array.
	
*/

public class MajorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,4,1,4,1,1,3,1,1};
		
		int count = 0;
		int element = 0;
		for(int num : arr) {
			if(count == 0)
				element = num;
			if(num == element)
				count++;
			else
				count--;
		}
		System.out.println("Majority element is : "+element);
		
	}

}
