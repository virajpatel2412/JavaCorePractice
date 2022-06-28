package ArraysProblems;
/*
	Given a matrix m X n, count paths from left-top to the right bottom 
	of a matrix with the constraints that from each 
	cell you can either only move to the rightward direction or the downward direction.

*
*/

public class GridUniquePath {

	public static int possiblePath(int i, int j, int n, int m) {
		if(i == n-1 && j == m-1)
			return 1;
		if(i >= n || j>=m)
			return 0;
		return possiblePath(i+1, j, n, m)+possiblePath(i, j+1, n, m);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 7;
		int m = 3;
		System.out.println("Possible paths are : "+possiblePath(0,0,n,m));
	}

}
