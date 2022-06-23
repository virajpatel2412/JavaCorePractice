package ArraysProblems;

public class RemoveDuplicateSortedArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,1,2,2,2,3,4,5,6,6,6,7,7,7,7,8,8};
		int n = arr.length;
		
		boolean[] vis = new boolean[n];
		vis[0] = true;
		
		for(int i=1; i<n; i++) {
			if(arr[i] != arr[i-1]) {
				vis[i] = true;
			}
		}
		
		for(int i=0; i<n; i++) {
			if(vis[i])
				System.out.print(arr[i]+" ");
		}
	}

}
