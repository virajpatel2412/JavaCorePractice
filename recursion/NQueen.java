package recursion;

public class NQueen {
	private static int count;
	public static boolean isSafe(boolean[][] board, int row, int col) {
//		Horizontally check
		for(int i=0; i<board[row].length; i++) {
			if(board[row][i] == true)
				return false;
		}
		
		for(int i=0; i<board.length; i++)
			if(board[i][col] == true)
				return false;
		
		for(int i=row,j=col; i>=0 && j>=0; i--, j-- ) {
			if(board[i][j] == true)
				return false;
		}
		
		for(int i=row,j=col; i>=0 && j<board[0].length; i--, j++ ) {
			if(board[i][j] == true)
				return false;
		}
		
		for(int i=row,j=col; i<board.length && j>=0; i++, j-- ) {
			if(board[i][j] == true)
				return false;
		}
		
		for(int i=row,j=col; i<board.length && j<board.length; i++, j++ ) {
			if(board[i][j] == true)
				return false;
		}
		return true;
	}
	
	public static void Nqueen(boolean[][] board, int col) {
		
		if(col >= board.length) {
			for(int i=0; i<board.length; i++) {
				for(int j=0; j<board[i].length; j++) {
					if(board[i][j] == true)
						System.out.print(1+" ");
					else
						System.out.print(0+" ");
				}
				System.out.println();
			}
			System.out.println("Solution No. : "+(++count));
			System.out.println();
			return;
		}
		
		for(int i=0; i<board.length; i++) {
			if(isSafe(board, i, col)) {
				board[i][col] = true;
				Nqueen(board, col+1);
				board[i][col] = false;
			}
		}
	}

	public static void main(String[] args) {
		boolean board[][] = new boolean[5][5];
		Nqueen(board, 0);
	}

}
