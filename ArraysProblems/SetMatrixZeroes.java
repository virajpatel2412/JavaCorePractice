package ArraysProblems;

public class SetMatrixZeroes {
	
	public static void setZeroes(int[][] arr) {
		int rows = arr.length;
		int cols = arr[0].length;
		
		int row[] = new int[rows];
		int col[] = new int[cols];
		
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				if(arr[i][j] == 0) {
					row[i] = 1;
					col[j] = 1;
				}
			}
		}
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				if(row[i] == 1 || col[j] == 1) {
					arr[i][j] = 0;
				}
			}
		}
	}
	
	public static void setZeroesOptimized(int[][] arr) {
		int col0 = 1, row = arr.length, col = arr[0].length;
		for(int i=0; i<row; i++) {
			if(arr[i][0] == 0)
				col0 = 0;
			for(int j=1; j<col; j++) {
				if(arr[i][j] == 0) {
					arr[i][0] = 0;
					arr[0][j] = 0;
				}
			}
		}
		
		for(int i=row-1; i>=0; i--) {
			for(int j=col-1; j>=1; j--) {
				if(arr[i][0]==0 || arr[0][j] == 0)
					arr[i][j] = 0;
			}
			if(col0 == 0)
				arr[i][0] = 0;
		}
	}
	
	public static void printMatrix(int[][] arr) {
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}
	
	public static void main(String[] args) {
		int[][] arr = {{5,2,1,5,0},{0,1,2,5,2},{1,2,5,3,6},{6,3,2,1,6},{6,3,3,6,2}};
		setZeroesOptimized(arr);
		printMatrix(arr);
		
	}

}
