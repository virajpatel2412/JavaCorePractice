package recursion;


//	Count the total path to reach (N,M) cell from (0,0) cell
//	We can move either down or right side cell from current cell

public class CountPathMatrix {

	public static int countPath(int i, int j, int n, int m) {
		if(i == n || j == m) {
			return 0;
		}
		if(i == n-1 && j == m-1) {
			return 1;
		}
		
		int downPath = countPath(i+1, j, n, m);
		int rightPath = countPath(i, j+1, n, m);
		
		return downPath + rightPath;
		
	}
	
	public static void main(String[] args) {
		int totalPath = countPath(0,0,3,4);
		System.out.println("Total Path : "+totalPath);
	}

}
