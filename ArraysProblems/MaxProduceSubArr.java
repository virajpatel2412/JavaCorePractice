package ArraysProblems;

public class MaxProduceSubArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,-1,4,6,-3,4,9,0,7,8,-2,4};
		int n = arr.length;
		int maxproduct = 1;
		
		int max = arr[0];
		int min = arr[0];
		
		for(int i=1; i<n; i++) {
			int temp = Math.max(max*arr[i], Math.max(min*arr[i], arr[i]));
			min = Math.min(min*arr[i], Math.min(max*arr[i], arr[i]));
			max = temp;
//			System.out.println(max+" "+min);
			maxproduct = Math.max(maxproduct, max);
		}
		
		System.out.println("Max Product is : "+maxproduct);
		
	}

}
