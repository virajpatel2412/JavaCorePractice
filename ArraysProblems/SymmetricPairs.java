package ArraysProblems;

public class SymmetricPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{1,2}, {2,3}, {3,5}, {2,1}, {3,7}, {5,3}};
		
		int n = arr.length;
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				if(arr[i][0] == arr[j][1] && arr[i][1] == arr[j][0])
					System.out.println("( "+arr[i][0] + ", "+ arr[i][1] +" )");
			}
		}
	}

}
