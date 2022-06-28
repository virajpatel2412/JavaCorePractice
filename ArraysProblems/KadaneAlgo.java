package ArraysProblems;

import java.util.ArrayList;

public class KadaneAlgo {
	
	public static int maxSubArray(int[] arr, ArrayList<Integer> list) {
		int sum = Integer.MIN_VALUE;
		int cursum = 0;
		
		int j=0;
		for(int i=0; i<arr.length; i++) {
			cursum += arr[i];
			if(cursum > sum) {
				list.clear();
				list.add(j);
				list.add(i);
				sum = cursum;
			}
			if(cursum <= 0) {
				cursum = 0;
				j=i+1;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
		ArrayList<Integer> ind = new ArrayList<>();
		
		int max = maxSubArray(arr, ind);
		System.out.println("Max sum : "+max);
		System.out.println("Start index : "+ind.get(0));
		System.out.println("End index : "+ind.get(1));
	}

}
