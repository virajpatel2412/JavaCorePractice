package ArraysProblems;

public class MaxSumSubArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,2,0,1,6,-1,3,7,-5,4,3,-7,6};
		int n = arr.length;
		int maxsum = 0;
		
		int cursum = 0;
		for(int i=0; i<n; i++) {
			cursum += arr[i];
			if(cursum < 0)
				cursum = 0;
			
			maxsum = Math.max(maxsum, cursum);
		}
		System.out.println("Max sum of continuous subarray is : "+ maxsum);
	}

}
