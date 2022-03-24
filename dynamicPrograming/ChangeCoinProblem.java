package dynamicPrograming;

public class ChangeCoinProblem {
	public static final int MAX = 1000000;
	public static void changecoin(int coin[], int sum) {
		int len = coin.length;
		int count[][] = new int[len][sum+1];
		
		for(int i=0; i<len; i++) {
			for(int j=1; j<=sum; j++) {
				if(i == 0) {
					if(j < coin[0])
						count[i][j] = 0;
					else 
						count[i][j] = 1+count[i][j-coin[i]];
					continue;
				}
				if(coin[i] > j)
					count[i][j] = count[i-1][j];
				else 
					count[i][j] = Math.min(count[i][j-coin[i]]+1, count[i-1][j]);
			}
		}
		for(int[] a : count) {
			for(int x : a) {
				System.out.print(x+" ");
			}
			System.out.println();
		}
		System.out.println(count[len-1][sum]);
	}

	public static void main(String[] args) {
		int coin[] = {1};
		changecoin(coin, 10);
	}

}
