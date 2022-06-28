package ArraysProblems;

/*
 * 1 2 3
 * 4 5 6
 * 7 8 9
 * 
 * 7 4 1
 * 8 5 2 
 * 9 6 3
 */


public class RotateMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		int n = arr.length, m = arr[0].length;
		
		int[][] res = new int[n][m];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				res[i][j] = arr[n-1-j][i];
				System.out.print(res[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}

}
